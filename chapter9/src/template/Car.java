package template;

public abstract class Car {
	
	public abstract void drive(); //�߻�ż���
	public abstract void stop(); //�߻�ż���
	
	public void wiper () {} //����Ŭ�������� �������� �ż��� (�߻�ż���X)
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
	}
	

}
