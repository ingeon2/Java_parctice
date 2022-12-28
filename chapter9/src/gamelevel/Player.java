package gamelevel;

public class Player {
	
	private PlayerLevel level; //Player �� ������ level���� ���� (int=9; �� ������)
	
	public Player() { // ����Ʈ������ + ����ó�� ���ʺ��ͽ��� + ����޼��� �ż��� ���
		level = new BegeinnerLevel(); //���� ������ �÷��̾� ������ ��ӹ޾����� ����
		level.showLevelMessege();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) { //�÷��̾� ���� Ŭ������ ������ �Ű������� �޴� �ż���
		this.level = level;						  //�� ���� (�� ����)�� �Ű������� ���� ������ ����.
		level.showLevelMessege();
	}
	
	public void play(int count) { //PlayerLevel Ŭ������ go�ż��带 ȣ��
		level.go(count);
	}

}
