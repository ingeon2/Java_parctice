package interfaceex;

public class CompleteClac extends Calculator{ //����� Ŭ���� �ϳ��ۿ� �ȵ�����, �������̽��� ���ø������� ����Ŭ���� ����


	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if (num2 != 0) {
			return num1 / num2;
		}
		return ERROR; //īũ �������̽� ������ īť�����Ϳ��� ��ӹ��� ���ø�īŧ������ �� �������(īũ���� ����)�� ��밡��
	}
	
	public void showInfo() {
		System.out.println("Clac �������̽��� �����߾��"); //��� �������̽��� �ν��Ͻ������� ����� �� ����! �� �����ֱ� ���� �ۼ�
	}

	@Override
	public void description() {
		System.out.println("�Ϻ��� �����Դϴ�");
	}
	
	

}
