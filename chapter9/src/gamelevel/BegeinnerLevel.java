package gamelevel;

public class BegeinnerLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("õõ�� �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("Jump�� �� ������!");
		
	}

	@Override
	public void turn() {
		System.out.println("Turn�� �ٵ� ������ �޷�!");
		
	}

	@Override
	public void showLevelMessege() {
		System.out.println("***** �ʺ��� �����Դϴ�. *****");
		
	}
	
	

}
