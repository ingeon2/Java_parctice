package scheduler;

public class RoundRobin implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("����κ� �� �ؽ�Ʈ ���Դϴ�");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("����κ� ��������������Ʈ�Դϴ�");
		
	}

}
