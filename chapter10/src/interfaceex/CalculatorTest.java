package interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {
		
		//Clac clac1 = new Clac(); �������̽��� ������
		//Clac clac2 = new Calculator(); �߻� Ŭ������ ������
		//Calculator clac3 = new CompleteClac(); ������ ������, �߻� Ŭ���� īŧ�����Ͷ� �ż��� add. �̷��� ��� ����
		
		Clac calc4 = new CompleteClac(); //Clac Ŭ������, ���ø� Ŭ�������� ������� �ż��� �������� ����� �� ����.
										 //calc4.showInfo() ��������~
		
		int num1 = 300;
		int num2 = 10;
		
		System.out.println(calc4.add(num1, num2));
		System.out.println(calc4.substract(num1, num2));
		System.out.println(calc4.times(num1, num2));
		System.out.println(calc4.divide(num1, num2));
		
		
		int [] arr = {1, 2, 3, 4, 5}; // ���� �ż��� - �� Ŭ������ �̷������� �ν��Ͻ� ���� ���� ��밡���� �ż���
		System.out.println(Clac.total(arr));
		
		
		
	}

}
