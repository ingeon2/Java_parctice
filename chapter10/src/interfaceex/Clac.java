package interfaceex;

public interface Clac {  //�������̽����� ����� �߻�ż��常 �����ϴ�.
	
	double PI = 3.14;  //�������̽����� �ڵ����� ����� ����� (�ۺ� ����ƽ ���̳� ���� ���� = 3.14;) ���Ÿ�ü.
	int ERROR = -999999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	//������ʹ� �ڹ�8���� �߰��� ���� (����Ʈ �ż���, ���� �ż���, �����̺� �ż���)
	
	// �����̺� �ż��� - just �������̽� ���ο����� ����ϴ� �ż���
	
	default void description() { // ����Ʈ - �⺻ ���� ����(���� ���� �������̽��� �ż���� ���� ���� ���ݾ�), ���� ������ ����
		System.out.println("���� ���⸦ �����մϴ�"); //���ø� īŧ�����Ϳ��� ��������
	}
	
	
	static int total(int[] arr) { // ���� �ż��� - �� Ŭ������ �̷������� �ν��Ͻ� ���� ���� ��밡���� �ż���
		int total = 0;			  // īŧ������ �׽�Ʈ���� �ν��Ͻ��������� �ż��尥��
		
		for(int i : arr) {
			total += i;
		}
		return total;
	}
	
	
	

}

//�������̽��� "����" �̴�.