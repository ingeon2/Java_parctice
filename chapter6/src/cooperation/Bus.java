package cooperation;

public class Bus {
	
	int busNumber;
	int pessengerCount;
	int money;
	
	public Bus (int busNumber) { //������ ����
		this.busNumber = busNumber;
	}
	
	public void take(int money) { //������ ������� �ӴϿ� �Ű����� �Ӵϸ� ���ϰ� , �°��� +1 ���ִ� �ż���
		this.money += money;
		pessengerCount++;
	}
	
	public void showInfo() {
		System.out.println("����" +  busNumber + "���� �°����� " + pessengerCount + "���̰�, ������ " + money + "�� �Դϴ�.");
	}

}
