package cooperationEx;

public class Taxi {
	int taxiNum;
	int pessengerCount;
	int money;
	
	public Taxi( int taxiNum) {
		this.taxiNum = taxiNum;
	}
	
	public void take(int money ) {
		this.money += money;
		pessengerCount++;
	}
	
	public void taxiinfo() {
		System.out.println(taxiNum + "�� �ýô� " + pessengerCount + "���� �¿���, ������ " + money + "�� �Դϴ�");
	}

}
