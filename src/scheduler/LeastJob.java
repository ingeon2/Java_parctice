package scheduler;

public class LeastJob implements Scheduler{
	
	@Override
	public void getNextCall() {
		System.out.println("����Ʈ�� �� �ؽ�Ʈ ���Դϴ�");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("����Ʈ�� ��������������Ʈ�Դϴ�");
		
	}

}
