package exercise4;

public class Cafe {
	String cafeName;
	String personName;
	int money;
	
	public Cafe(String cafeName , String personName , int money) {
		this.cafeName = cafeName;
		this.personName = personName;
		this.money = money;
	}
	
	public void takeAme(Americano ame) {
		ame.take(4000);
		money += 4000;
	}
	
	public void cafeInfo() {
		System.out.println(cafeName + "���� " + personName + "�� " + money + "���� ����ϼ̽��ϴ�.");
	}


}
