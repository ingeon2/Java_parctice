package string;

public class StringTest1 {
	

	public static void main(String[] args) { //��Ʈ�� �� �� ��Ʈ�� ��� ������
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println(str1 == str2); //new �ؼ� ������ �ΰ��� ���ϳ��� �ν��Ͻ��� �ּҴ� �ٸ���
		
		String str3 = "abc";
		String str4 = "abc";
		System.out.println(str3 == str4); // ����� ������ �ΰ��� �ν��Ͻ��� �ּҰ� ���� (abc��ü�� �Ҵ�Ǳ� ����)

	}

}
