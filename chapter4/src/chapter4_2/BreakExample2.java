package chapter4_2;

public class BreakExample2 {

	public static void main(String[] args) {
		//å 120������ 121���������� �극��ũ�� �����ϱ�
		int Num;
		int Sum = 0;
		for(Num = 1 ; Sum < 100 ; Num++) { // Sum�� 100���� Ŀ���� ���� 
			Sum += Num;
			//if(Sum >= 100)break; ���ٰ� �� ������ Sum < 100 ����� �׷��� ����� ��14 ��105 �ȴ�.
		}
		System.out.println("Num : " + Num);
		System.out.println("Sum : " + Sum);

	}

}
