package bookshelf;

import java.util.ArrayList;

public class Shelf {
	
	protected ArrayList<String> shelf; //������� (å���̴� å ����� �Է��ؾ���.)
	
	public Shelf() { //������
		shelf = new ArrayList<String>();
	}

	public ArrayList<String> getShelf() {
		return shelf;
	}

	public int getCount() { //shelf�� ��̸���Ʈ�� �����̹Ƿ� ������ �ż��� ��밡��.
		return shelf.size();
	}
	
	
	
}
