package string;

public class StringTest2 {

	public static void main(String[] args) { // ���ڿ� �����ϱ� (�Ʒ��� ���� String ��Ĺ�ϸ� java�� ���� ������ �޸𸮰� ����.)
		
		String str1 = new String("java");
		String str2 = new String(" android");
		System.out.println(System.identityHashCode(str1));
		
		str1 = str1.concat(str2); //str1 �� str2 �������� �ƴ϶� just str1�� ���ο� ���ڿ��� �� ����!!!!!!(���̻� str1�� java �� �ƴ�)
		
		System.out.print(str1);
		

		System.out.println(System.identityHashCode(str1)); //���� �޶���

	}

}
