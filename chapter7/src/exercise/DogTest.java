package exercise;

public class DogTest {

	public static void main(String[] args) {
		
		Dog [] dogArray = new Dog[5];  // != Dog a = new Dog("�ٵ�1" , "�˰�1");
		
		dogArray[0] = new Dog("�ٵ�1" , "�˰�1");
		dogArray[1] = new Dog("�ٵ�2" , "�˰�2");
		dogArray[2] = new Dog("�ٵ�3" , "�˰�3");
		dogArray[3] = new Dog("�ٵ�4" , "�˰�4");
		dogArray[4] = new Dog("�ٵ�5" , "�˰�5");
		
		for(int i = 0 ; i < dogArray.length ; i++) {
			System.out.println(dogArray[i].showDogInfo());
		}
		
		// ���� �׳� for �Ʒ��� ��ȭfor
		
		for(Dog d : dogArray) {
			System.out.println(d.showDogInfo());
		}

		
		
		Dog c = new Dog("�迭�ƴ�1" , "�迭�ƴ�2"); //������(DogŬ������ ����)�� �´� �ν��Ͻ� ����.
		System.out.println(c.showDogInfo()); //�迭�� �ִ¹��� �׳� �ϳ��� ������ �ִ¹� �򰥸����.
		
		
	}

}
