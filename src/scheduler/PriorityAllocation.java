package scheduler;

public class PriorityAllocation implements Scheduler{
	
	@Override
	public void getNextCall() {
		System.out.println("�˷����̼� �� �ؽ�Ʈ ���Դϴ�");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("�˷����̼� ��������������Ʈ�Դϴ�");
		
	}

}
