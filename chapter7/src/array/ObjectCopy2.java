package array;

public class ObjectCopy2 {

	public static void main(String[] args) {
		
		Book [] a = new Book[3];
		Book [] b = new Book[3];
		
		a[0] = new Book("�¹���" , "������");
		a[1] = new Book("���̾�" , "�츣�� �켼");
		a[2] = new Book("��� �� ���ΰ�" , "���ù�");
		
		
		
	
		//�������
		b[0] = new Book();
		b[1] = new Book();
		b[2] = new Book();
		
		for(int i = 0 ; i < b.length ; i++) {
			b[i].setBookName(a[i].getBookName()); 
			b[i].setAuthor(a[i].getAuthor()); 
		}
		//��������� ���� ������� ����. ���������System.copy �޼��� ���.
		
		
		
		//b ��� �� a �ٲٰ� ������ b�� �״���̴�
		for(int i = 0 ; i < b.length ; i++) {
			b[i].showBookInfo();
		}
		
		
				
		a[0].setBookName("����"); //a�� ù��° ������ ��������� �ٲٱ�
		a[0].setAuthor("�ڿϼ�");
		
		System.out.println("=== a ===");
		for(int i = 0 ; i < a.length ; i++) {
			a[i].showBookInfo();
		} //a ���
		
		
		System.out.println("=== b ===");
		for(int i = 0 ; i < b.length ; i++) {
			b[i].showBookInfo();
		} //b ���
		
		//��� ��������� �ּҰ����� ���� ������ �ƴ϶�, �ν��Ͻ��� ���� ������!
		  
		
		System.out.println("===���� for �� === ���� for������ó�� i�� ���� ������ �ʿ� ���� ���� �� ����");
		
		int [] c = new int[] {1, 2, 3};
		for(int d : c) {
			System.out.println(d);
		}
		
		
		for(Book s : a){
		s.showBookInfo();}

	}

}
