package thisex;

class Person{
	String name;
	int age;

//���⼭�� this�� �Ǵٸ� �����ڸ� ȣ���ϴ� this�̴�!!!!!!!!!!
	
	Person(){ 
		this("�̸� ����" , 1);  // �갡 �Ʒ��� 14����� 17������� �����ڸ� ȣ����
	}						 // �����ڰ� (��Ʈ�� �̸����� , ��Ʈ 1) �� �����ؼ� ������Ÿ���� �´� �Ʒ� ������(13��)�� �˾Ƽ� ���εǾ �����ȴ�!
	
	Person(String name , int age){
		this.name = name;
		this.age = age;
	}
	
	
	public	Person	returnSelf() { //this�� �̿��Ͽ� �ּ� �� ��ȯ�ϴ� �ż��� (�ڷ��� �ߺ���)
		return this;
	}
}
	



public class CallAnotherConst {

	public static void main(String[] args) {
		Person p1 = new Person("���ΰ�" , 26);
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);

		System.out.println(p1.returnSelf()); // �𽺷� �ּҰ� ��ȯ�ϴ� �ż��� ���� �Ѱ�
		System.out.println(p1); // �׳� �ּҰ� ���
	}

}
