package abstractex;

public abstract class Computer { // �߻� Ŭ���� ���� (�߻� �ż����� ���綧���� �߻� Ŭ������ �Ǵ°�.)
	
	public void tornOn() {
		System.out.println("������ �մϴ�.");
	}
	
	public void tornOff() {
		System.out.println("������ ���ϴ�.");
	}
	
	public abstract void display(); //�̰� �߻� �ż��� 
	//(����ؼ� �ż��� ����ϴ°Ͱ� �ٸ��� ������! �� �߻� �ż���� ����Ŭ�������� �������� ���ǵȰ� ����! ���°� �Լ���(); �̰� �����ݾ�)
	 
	public abstract void typing();
	

}
// ��ǻ�Ϳ��� ����ũ��(���÷���, Ÿ����) ��Ʈ�� ���(���÷���), ��Ʈ�Ͽ��� ���̳�Ʈ��(Ÿ����) ���. �߻�ż��带 ���� �����ؾ� ���̻��� �߻�Ŭ������ �ƴ�! �����ϱ�.
