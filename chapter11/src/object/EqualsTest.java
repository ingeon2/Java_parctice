package object;


public class EqualsTest {

	public static void main(String[] args) {
		
		String str1 = new String("test");
		String str2 = new String("test");
		
		System.out.println(str1 == str2);  // �ּҰ������� üũ (������ ���ϼ�)
		System.out.println(str1.equals(str2)); //���배������ üũ (���� ���ϼ�)
		
		System.out.println("=========�ؽ��ڵ�========");
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode()); //�ְ�����? (�������� ������ �ؽ��ڵ嵵 ���ƾ���. �ڹٿ����� ����!)	
		

	}

}
