package chapter2;

public class OperationEx5 {

	public static void main(String[] args) {
		int num = 0B00000101; //8��Ʈ 2���� ���� 5 ǥ��
		
		System.out.println(num << 2); // 10100 
		System.out.println(num >> 2); // 1 (2����)
		System.out.println(num >>> 2); // 1(2����)
		
		System.out.println(num);
		
		
		num = num << 2; //10100 ���� num���� ��ü�� �ٲ����
		System.out.println(num);
	}

}
