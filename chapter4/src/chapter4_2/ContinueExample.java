package chapter4_2;

public class ContinueExample {

	public static void main(String[] args) {
		int a;
		int b = 0;
		int c = 5;
		for(a=1 ; a<=100 ; a++) {
			if(a%c == 0) continue;
			b += a;
		}
		System.out.println("1���� 100���� " + c + "�� ����� �����ϰ� ���ϸ�" + b + "���Ϳ�");

	}

}
