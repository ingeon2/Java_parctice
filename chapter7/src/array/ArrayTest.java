package array;

public class ArrayTest {

	public static void main(String[] args) {
		
		int [] numbers1 = new int[3];
		numbers1[0] = 1;
		numbers1[1] = 2;
		numbers1[2] = 3;
		
		for(int i = 0 ; i < numbers1.length ; i++) {
			System.out.println(numbers1[i]);
		}	
		
		
		int [] numbers2 = new int[] {4, 5, 6};
		
		/* ���� �����ϴ¹� �ΰ�����,
		 	int [] numbers3 = new int[3] {7, 8, 9}; =====�̰� ���� ũ�� ������ƾ��� */
		
		
		
		int [] studentID = new int[5]; //�����ϰ� �� �ȳ־��ָ� int�� �ʱⰪ 0��� ä����! (double �� 0.0, string �� null)
		for(int i = 0 ; i < studentID.length ; i++) {
		System.out.println(studentID[i]);
		}
		
		

	}

}
