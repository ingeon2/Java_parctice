package chapter4_2;

public class WhileExanple1 {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		while(num <= 10){ //(�� <= 10) ���̸� ����ض� -> ������ ���� -> 11���� ����
			sum += num; //�� = �� + ��
			num++; //�� 1�� ����
		}
		
		System.out.println("1���� 10������ ����" + sum + "�̴�");

	}

}
