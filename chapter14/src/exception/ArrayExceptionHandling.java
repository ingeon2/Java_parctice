package exception;

public class ArrayExceptionHandling {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		try {
			for(int i = 0; i <= 5 ;i++ ) { //5���� �������� 0 1 2 3 4 ä������
				arr[i] = i;
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("���� ó�� �κ�");
		}
		
		System.out.println("���α׷� ����");

	}

}
