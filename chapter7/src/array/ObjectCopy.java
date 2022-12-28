package array;

public class ObjectCopy {

	public static void main(String[] args) {
		
		Book [] a = new Book[3];
		Book [] b = new Book[3];
		
		a[0] = new Book("�¹���" , "������");
		a[1] = new Book("���̾�" , "�츣�� �켼");
		a[2] = new Book("��� �� ���ΰ�" , "���ù�");
		
		System.arraycopy(a, 0, b, 0, 3);
		
		for(int i = 0 ; i < b.length ; i++) {
			b[i].showBookInfo();
		}
		
		
		
		a[0].setBookName("����"); //a�� ù��° ������ ��������� �ٲٱ�
		a[0].setAuthor("�ڿϼ�");
		
		System.out.println("=== a ===");
		for(int i = 0 ; i < a.length ; i++) {
			a[i].showBookInfo();
		}
		
		
		System.out.println("=== b ===");
		for(int i = 0 ; i < b.length ; i++) {
			b[i].showBookInfo();
		}
		
	}

}
//�� �����ϰ� �����ϰ� ����ص� �����Ѱ��� �ݿ��ɱ�? �� ���뺹�簡 �ƴ϶�, �ּҸ� �����߱� ����. (�������� �������� �������� �������� �������� �������� �������� ��������)