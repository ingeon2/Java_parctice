package classex;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Person person = new Person();
		
		Class pClass1 = person.getClass(); //����Ʈ �޼���(��Ŭ����)
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("classex.Person"); //Class �ż���
		System.out.println(pClass3.getName());

	}//ClassŬ������ �ٸ� Ŭ���� �������� ������ ���. forName �߿�!!! forName �߿�!!! forName �߿�!!!

}
