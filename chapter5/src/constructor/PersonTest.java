package constructor;

public class PersonTest {

	public static void main(String[] args) {
		Person personLee = new Person();
			personLee.name = "���ΰ�";
			personLee.height = 179;
			personLee.weight = 72;
		
		Person personMo = new Person("���");
				System.out.println("�̸� : " + personMo.name);
		
		Person personKim = new Person ("�����" , 179 , 72);
			System.out.println("�̸� : " + personKim.name +" Ű : " + personKim.height + " ���� : " + personKim.weight);

	}

}
