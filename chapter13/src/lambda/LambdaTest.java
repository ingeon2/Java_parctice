package lambda;

interface PrintString{
	void showPrinting(String str);
}


public class LambdaTest {

	public static void main(String[] args) {
		
		PrintString lambdaPrint = str -> System.out.println(str); //���� lambdaPrint �� �����ؼ� �ٷ� implements�ϴ� ��� 1
		lambdaPrint.showPrinting("test");
		
		showMyString(lambdaPrint);  //implements �Ȱ� ��ü�� �Ű������� �Ѿ�� ��� 2 (22��) �̰� test2
		
		PrintString restr = returnPrint(); //implements �Ȱ� ��ü�� ��ȯ������ �Ѿ�� ��� 3
		restr.showPrinting("Hello");
		
		

	}
	
	public static void showMyString(PrintString lambda) { //�̰� �ٷ� �Լ��� ����ó�� ����ϴ� ���ٽ�
		lambda.showPrinting("test2");
	}
	
	public static PrintString returnPrint() {
		PrintString str = s -> System.out.println(s + " World"); //��ȯ ������ ���̴� ���ٽ�
		return str;  
	}
	//�ٷ� ���� �Լ� ����ϱ� in 17,18��
	
	

}
