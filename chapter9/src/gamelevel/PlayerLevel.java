package gamelevel;

public abstract class PlayerLevel {
	
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessege();
	
	public final void go (int count) { //���ø� �ż��� (���̳�)
		run();
		for(int i = 0 ; i < count ; i++) { //���� ������ ��Ű���� for�� �ȿ� ������.
			jump();
		}
		turn();
	}

}
