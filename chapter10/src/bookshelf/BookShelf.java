package bookshelf;

//�̰� �ٽ�. Queue �� Shelf �� ��ӹް� implement�ؼ� ���� Ŭ����

public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String Title) { // å ���� �迭�� �� �ڷ� �߰��ϴ� �ż���
		 shelf.add(Title);
	}

	@Override
	public String deQueue() {
		return shelf.remove(0); // shelf ��̸���Ʈ���� 0��°���� ����ϸ鼭 ����.
		
	}

	@Override
	public int getSize() { //��̸���Ʈ�� ũ�� �� å�� ��
		return getCount();
	}
	
	

}
