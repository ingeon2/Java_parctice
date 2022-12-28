package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		String str1 = new String("�ٺ�");
		
		System.out.println("String���� str1�� �ּҴ� " + System.identityHashCode(str1));
		
		StringBuilder buffer = new StringBuilder(str1);
		System.out.println("StringBuilder���� str1�� �ּҴ� " + System.identityHashCode(buffer));
		
		buffer.append("�˰�");
		buffer.append("������");
		System.out.println("StringBuilder���� �߰��ص� �ּҴ� " + System.identityHashCode(buffer) + " �� �״����.(����)");
		
		String str2 = buffer.toString();
		System.out.println("str2�� " + str2);
		System.out.println("StringBuilder�� String�� str2���� �Ҵ��� �ּҴ� " + System.identityHashCode(str2));
		

	}

}
