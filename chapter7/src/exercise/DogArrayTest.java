package exercise;

import java.util.ArrayList;

public class DogArrayTest {

	public static void main(String[] args) {
		
		ArrayList<Dog> DogList = new ArrayList<Dog>(); //DogList ��̸���Ʈ ����.
		
		DogList.add(new Dog("�ٵ�1", "�˰�1"));
		DogList.add(new Dog("�ٵ�2", "�˰�2"));
		DogList.add(new Dog("�ٵ�3", "�˰�3"));
		DogList.add(new Dog("�ٵ�4", "�˰�4"));
		
		for(int i = 0 ; i < DogList.size() ; i++) {
			System.out.println(DogList.get(i).showDogInfo()); //DogList = ��̸���Ʈ , DogList.get(i) = ��̸���Ʈ�� i���� ��� (���⼱ Dog)
															  //DogList.get(i).showDogInfo() ���׸���Ʈ i���� ���׿� ����� �ż��� ���.
		}
		
		

	}

}
