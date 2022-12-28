package innerclass;

class Outer{
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) { //�� ���ʺ��̶�� �ż���, ���ʺ�(���̺귯���� �⺻ �������̽� ����)�̶�� ���·� ��ȯ�ϸ� �ȴ�
		int num = 100;
		
		
		class MyRunnable implements Runnable { //�� ���ʺ� �ż��� �ȿ��� / ���̷��ʺ� �̶�� ���ʺ� �������̽��� ������ Ŭ������ ����. (���ø����������ϱ� �������̵�����)
			int localNum = 300;

		@Override
		public void run() {
			System.out.println(outNum);
			System.out.println(sNum);
			System.out.println(localNum);
			System.out.println(num);
			System.out.println(i);
			
			//num = 200; ��� ���� ���� �ٸ��ݾ�. ����������. �׷��ϱ� ���ó�� ����ؼ� ���� ������ ���� ����. but��ó�� ����Ʈ�������� ����� �� �� �־�.
			//i = 100;
			
			}
			
		}
		return new MyRunnable(); //���̷��ʺ��� ���ʺ� �������̽����� �� Ŭ�����ϱ�, ���ʺ�� ��ȯ�϶�� �ٷ��ʺ� �ż����� ��ȯ�� ���̷��ʺ�� �� �� ����.
	}
}

public class LocalInnerTest {

	public static void main(String[] args) {
		
		Outer outer = new Outer();
		
		Runnable runner = outer.getRunnable(10);
		runner.run();
		
		outer.getRunnable(10).run(); //������� �ȿ� �ż��� �ȿ� �޼��� �ٷ� ���� ������ ���ٷ� ����Ѱ�.
		

	}

}
//p458,459���� (�͸� ���� Ŭ����)