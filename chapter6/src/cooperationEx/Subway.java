package cooperationEx;

public class Subway {
	
	int subNum;
	int pessengerCount;
	int money;
	
	public Subway(int subNum) {
		this.subNum = subNum;
	}
	
	public void take(int money ) {
		this.money += money;
		pessengerCount++;
	}
	
	public void subinfo() {
		System.out.println(subNum + "ȣ�� ����ö�� " + pessengerCount + "���� �¿���, ������ " + money + "�� �Դϴ�");
	}

}
