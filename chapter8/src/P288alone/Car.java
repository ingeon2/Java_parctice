package P288alone;

public abstract class Car {
	
	public void run() {
		System.out.println("������ �������̵� �Ұ̴ϴ�.");
	}
	
	public void refuel() {
		System.out.println("������ �������̵� �Ұ̴ϴ�.");
	}
	
	public void stop() {
		System.out.println("���� ����ϴ�.");
	}
	
	public abstract void takePassenger(); 
	
	public abstract void load(); 

}
