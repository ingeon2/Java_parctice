package polymorphism; 


class Animal {
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("����� �Ƚ��ϴ�.");
	}
	
	public void read() {
		System.out.println("����� �н��ϴ�.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("ȣ���̰� �׹߷� �ݴϴ�.");
	}
	
	public void hunting() {
		System.out.println("ȣ���̰� ����մϴ�.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
	
	public void flying() {
		System.out.println("�������� ���ϴ�.");
	}
}

//������� ����Ŭ���� ����Ŭ����



public class AnimalTest1 {

	public static void main(String[] args) {
		
		AnimalTest1 atest = new AnimalTest1(); //atest �ν��Ͻ� �����
		
		atest.moveAnimal(new Animal()); //�ִϸ� Ŭ������ �ν��Ͻ��� ������ ����ϴ� ���� �ִϸ� �ż��带 AnimalTest1 ���� ���������,
										//AnimalTest1 �ν��Ͻ��� atest ���� ��밡���Ѱ�! (�� �� �� �� �� ��)
		atest.moveAnimal(new Human());
		atest.moveAnimal(new Tiger());
		
		//Animal E = new Eagle();
		//atest.moveAnimal(E); �̰� �Ʒ��� ������
		atest.moveAnimal(new Eagle());
		
		}
		
		
		public void moveAnimal(Animal animal) { //Animal Ŭ������ �ν��Ͻ� animal(�ִϸ� �޸� Ÿ�̰� �̱�)�� ������ �޾� �ν��Ͻ�.���� �� �����ϴ� �ż��� 
			animal.move(); //Animal�� �ٸ� �ν��Ͻ��鸶�� �����ǵ� �ż���� ����! (Animal, Human, Tiger, Eagle)
			
		//�ٿ�ĳ���� instanceof (��ӹޱ� ������, �������̵� �ż��尡 �ƴ� ������ �Լ��� ����ϰ� ������ �� �ܰ��� Ŭ������ �ö󰡴°�)
			if( animal instanceof Human) {
				Human human = (Human) animal;
				human.read();
			}
			else if( animal instanceof Tiger) {
				Tiger tiger = (Tiger) animal;
				tiger.hunting();
			}
			else if( animal instanceof Eagle) {
				Eagle eagle = (Eagle) animal;
				eagle.flying();
			}
			else {
				System.out.println("Animal Ŭ������ ���� Ŭ�����̱� ������ �ٿ�ĳ������ ���� �ż���� �����ϴ�.");
			}
			
			
		}

}
