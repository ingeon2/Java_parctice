package gamelevel;

public class AdvancedLevel extends PlayerLevel{
	
	@Override
	public void run() {
		System.out.println("���� �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("���� Jump�� �� �ִ�!");
		
	}

	@Override
	public void turn() {
		System.out.println("������ Turn�� �� ������!");
		
	}

	@Override
	public void showLevelMessege() {
		System.out.println("***** �߱��� �����Դϴ�. *****");
		
	}

}
