package classex;

public class NewInstance {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Class pClass = Class.forName("classex.Person");
		
		Person p2 = (Person)pClass.newInstance();

	}

}//Class ������ �ٸ� Ŭ���������� Person�� �ν��Ͻ��� ����� ���. ������ �� ������⿡ ���� ���� �׾�����. (����Ʈ ��������.)
