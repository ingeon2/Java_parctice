package array;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		int[] data = new int[5];
		int size = 0;
		
		data[0] = 10; size++;
		data[1] = 20; size++;
		data[2] = 30; size++;
		
		int total = 1;
		
		for(int i = 0 ; i < size ; i++) {
			System.out.println(data[i]);
			total *= data[i];
		}
		
		System.out.println("total = " + total );

	}

}
//�迭ũ�� 5���� 3���� �������. �ű⿡�� ��ȿ���� �̾Ƴ��� ��� (int size�̿�)