package P123;

public class Q1switch {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		char operator = '1';
		
		int result = 0;
		
		if(operator == '+') {
			result = num1 + num2;
			}
		else if(operator == '-') {
			result = num1 - num2;
			}
		else if(operator == '*') {
			result = num1 * num2;
			}
		else if(operator == '/') {
			result = num1 / num2;
			}
		else {
			System.out.println("�׷� �����ڴ� ���׿�");
			return; // ���� ������ �׷� �����ڴ� ���׿� ���ٰ� �� �Ʒ��� ����Ʈln���� ���͹���
		}
		
		System.out.println("num1" + operator + "num2 = " + result + "�Դϴ�.");
		
	}
}
