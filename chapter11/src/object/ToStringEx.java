package object;

class Book{
	int bookNum;
	String bookTitle;
	
	Book(int bookNum , String bookTitle) { //������
		this.bookNum = bookNum;
		this.bookTitle = bookTitle;
		
		
	}

	@Override
	public String toString() {
		return bookNum + " , " + bookTitle;
	}
}





public class ToStringEx {

	public static void main(String[] args) {
		Book book1 = new Book(1200, "�����ڹ�");
		
		System.out.println(book1); //�ν��Ͻ� book1 ������ ��Ÿ���� �ż�������(object.Book@7a81197d), �������� ���� ��������.
		//System.out.print(book1.toString()); ���� �� ����������, �������Ҷ� �ڹٿ��� �ٿ���.
		

	}

}
