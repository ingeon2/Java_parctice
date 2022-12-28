package collection.arraylist;

import java.util.ArrayList;

class MyStack{ //������ LIFO ������ LIFO
	
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) { //���� Ǫ��
		arrayStack.add(data);
	}
	
	public String pop() {
		int len = arrayStack.size();
		
		if(len == 0) {
			System.out.println("������ ���µ� ��Ի����ؿ� �Ѥ�");
			return null;
		}
		return arrayStack.remove(len - 1); //���Ⱑ ť ���� ����
	}
	
	public String peek() { //pop �ż������ ���� ������ , �� (�� �Լ��� �������ִ°� �� �ż���� �������� �ż���.)
		int len = arrayStack.size();
		
		if(len == 0) {
			System.out.println("������ ���µ� ��Ի����ؿ� �Ѥ�");
			return null;
		}
		return arrayStack.get(len - 1);
	}
	
}

public class StackTest {

	public static void main(String[] args) {
		
		MyStack stack = new MyStack();
		
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		
		System.out.println("���� ���̰� �Ʒ��� ��");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println(stack.pop());
		

	}

}
