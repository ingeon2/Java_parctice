package chapter4_2;

public class DoWhileExample {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		do {sum += num;
			num++;          
			
		}while(num <= 10);
		System.out.println("1����10����" + sum);

	}

}

//���ϰ� �� ���� ������ - ���ǹ��� ���� ��,�� �̹Ƿ� ���� �������� �� ���Ϲ��� ������ �ѹ��� ����.
// ���� ������, num <= 0 �ϸ� ������ ���� 0 but �� ������ ���� 1