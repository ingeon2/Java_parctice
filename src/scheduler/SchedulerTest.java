package scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		
		// R, L, P
		
		System.out.println("��ȭ ��� ����� ��󺸼��� ����!!~!!");
		int ch = System.in.read();
		
		Scheduler scheduler = null; //scheduler �ν��Ͻ� ���� �ɰ��� �ż���� ����Ŷ� �ϴ� �η� �Ҵ�.
		
		if(ch == 'R'||ch == 'r') {
			scheduler = new RoundRobin();
		}
		else if(ch == 'L'||ch == 'l') {
			scheduler = new LeastJob();
		}
		else if(ch == 'P'||ch == 'p') {
			scheduler = new PriorityAllocation();
		}
		else {
			System.out.println("�������� �ִ°� �� ������ �������Ҷ�");
			return;
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();

	}

}
