package chapter5;

public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = mul(num1,num2);
		System.out.println(num1 + " + " + num2 + " = " + sum + " �Դϴ�");
	}
	
	public static int add(int n1 , int n2) {
		int result = n1 + n2;
		return result; // �Լ��� ������� ��ȯ�մϴ� -> return�Լ�
	}
	
	public static int min(int n1 , int n2) {
		int result = n1 - n2;
		return result;
	}
	
	public static int mul(int n1 , int n2) {
		int result = n1 * n2;
		return result;
	}
	
	public static int div(int n1 , int n2) {
		int result = n1 * n2;
		return result;
	}

} //�Լ������!!!!!!!!

// add�Լ� ���� -> ��Ʈ n1 ��Ʈ n2�� ��Ʈ ����Ʈ�� ���� �� ����Ʈ�� ��ȯ�ض�
// �Լ��� ����� ���� -> ���⼭�� �����ִ� ���ϱ� �Լ��� ���������, �ٸ� ��Ȳ���� �⺻���� �־����� �ʴ� ����� ���� �Լ��� �ʿ��ϱ� ����.
