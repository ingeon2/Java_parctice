package P346Ex;

public class QuickSort implements Sort{

	@Override
	public void ascending(int[] arr) {
		System.out.println("����Ʈ ����Դϴ�.");
		
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("����Ʈ �𼾵��Դϴ�.");
		
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("����Ʈ�Դϴ�");
	}
	
	

}
