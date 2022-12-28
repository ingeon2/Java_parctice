package innerclass;

class OutClass{
	
	private int num = 10;
	private static int sNum = 20;
	InClass inClass;
	
	public OutClass () {
		inClass = new InClass();
	}
	
	
	
	
	private class InClass{ //OutClass ���� Ŭ����
		int inNum = 200;
		//static int sInNum = 100; (���� Ŭ�������� �ܺ� ���� ����Ҷ�! �ż��� �� ����ƽ ������) - ���� ���� Ŭ�������� ������
		
		void inTest() {
			System.out.println(num); //���� Ŭ������ Ŭ���� �ȿ� �ֱ� ������, �����̺� ���� ��밡��
			System.out.println(sNum);
		}
	}
	public void usingInTest() { //��Ŭ������ �����ؼ� ����� �ż���
		inClass.inTest();
	}
	
	
	static class InStaticClass{
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			//num += 10; (���� ���� Ŭ�������� �ܺ� ���� ����Ҷ�!�� ����ƽ ����,�ż��常 ����ؾ���) - ���� Ŭ�������� ������
			sNum += 10;
			System.out.println(sNum);
			System.out.println(iNum); //�������� �ƴϿ��� ����Ŭ������ ��밡��
			System.out.println(sInNum);
			
		}
		
		static void sTest() { //���⼭�� ���� �Լ��� ���ؼ�, num, iNum ���Ұ� (���� �ż����̱� ����)
			System.out.println(sNum);
			System.out.println(sInNum);
		} 
		
	}
	
}

public class InnerTest {
	
	public static void main(String[] args) {
		
		OutClass outClass = new OutClass();
		outClass.usingInTest();
		
		System.out.println("���� �׳� ����Ŭ������ �׳� �ż��� �Ʒ��� ���� ����Ŭ������ �׳� �ż���");
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		
		System.out.println("�Ʒ��� ���� ����Ŭ������ �����ż���� �������� �ĸ� ���� �ִ°�.");
		
		OutClass.InStaticClass.sTest();
	}

}
