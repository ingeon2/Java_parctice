package exercise4;

public class Americano {
	String coffeeName;
	int money;
	int cups;
	
	public Americano (String coffeeName) {
		this.coffeeName = coffeeName;
	}
	
	public void take(int money) {
		this.money += money;
		cups ++;
	}
	
	public void ameInfo() {
		System.out.println(coffeeName + "�� " + cups + "���� �Ǹ��ϼ̽��ϴ�. �Ƹ޸�ī�� �� �Ǹž���" + money + "�� �Դϴ�.");
	}


}
