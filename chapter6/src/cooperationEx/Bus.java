package cooperationEx;

public class Bus {
	
	int busNum;
	int pessengerCount;
	int money;
	
	public Bus( int busNum) {
		this.busNum = busNum;
	}
	
	public void take(int money ) {
		this.money += money;
		pessengerCount++;
	}
	
	public void businfo() {
		System.out.println(busNum + "�� ������ " + pessengerCount + "���� �¿���, ������ " + money + "�� �Դϴ�");
	}

}
