package P346Ex;

public interface Sort {
	
	public void ascending(int[] arr);
	public void descending(int[] arr);
	public default void description() {
		System.out.println("���ڸ� �����ϴ� �˰����Դϴ�.");
	};
	
	

}
