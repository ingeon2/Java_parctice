package chapter5;

public class Man {
	int Age;
	String Name;
	boolean Married;
	int Baby;

	public static void main(String[] args) {
		Man man1 = new Man();
		man1.Name = "James"; //man1�� �ν��Ͻ��� ���ø޸� , ������ ��(heap) �޸�
		man1.Age = 40;
		man1.Married = true;
		man1.Baby = 3;
		
		System.out.println("���� : " + man1.Age);
		System.out.println("�̸� : " + man1.Name);
		System.out.println("��ȥ ���� : " + man1.Married);
		System.out.println("�ư� ��� : " + man1.Baby);

	}

}
