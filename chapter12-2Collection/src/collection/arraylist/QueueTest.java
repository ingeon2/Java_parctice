package collection.arraylist;

import java.util.ArrayList;

class MyQueue{ //ť�� FIFO ť�� FIFO ť�� FIFO
	
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	public String pop() {
		int len = arrayQueue.size();
		
		if(len == 0) {
			System.out.println("������ ���µ� ��Ի����ؿ� �Ѥ�");
			return null;
		}
		return arrayQueue.remove(0); //���Ⱑ ���ð��� ����
	}
	
}

public class QueueTest {
	

	public static void main(String[] args) {
		

	}

}
