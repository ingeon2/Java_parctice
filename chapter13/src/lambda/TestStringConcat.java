package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		
		StringConcatImpl concat1 = new StringConcatImpl();
		concat1.makeString("Hello", "Java");
		
		//���� ����(��ü����), �Ʒ��� ���ٽ�(�Լ�����)
		
		StringConcat concat2 = (s1, s2) -> System.out.println(s1 + " " + s2); //���ٽ�(=�Լ�����ٰ����) �������̽���-�Լ��� = ���� -> �����Լ�   	����
		concat2.makeString("Hello", "Java"); //�������� StringConcatImpl Ŭ���� �����ݾ�. ���⼭�� (�͸�Ŭ����)�� �ִ°Ͱ� ���������� �ٷ� �������̽� ����°�.
																							//���� ���� P468 
	}

}
