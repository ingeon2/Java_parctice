package interfaceex;

public abstract class Calculator implements Clac{ // �������̽������� �߻�ż��� 4���� 2�� ������ �� �� ����Ŭ������ ��ӽ��� ������ �ΰ� �����ϰڴ�.
												  // 2���� �����ߴ� �� �ΰ��� �߻�ż��� �� ä�� ���� �� �߻� Ŭ����������(������ ������ ���� �Ϻη� �ΰ��� ����.)

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}
	

}
