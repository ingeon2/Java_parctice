package cooperation;

public class Subway {
	
	int lineNumber;
	int pessengerCount;
	int money;
	
	public Subway (int lineNumber) { //������ ����
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) { //�������� ������� �ӴϿ� �Ű����� �Ӵϸ� ���ϰ� , �°��� +1 ���ִ� �ż���
		this.money += money;
		pessengerCount++;
	}
	
	public void showInfo() {
		System.out.println("����ö" +  lineNumber + "ȣ���� �°����� " + pessengerCount + "���̰�, ������ " + money + "�� �Դϴ�.");
	}


}
