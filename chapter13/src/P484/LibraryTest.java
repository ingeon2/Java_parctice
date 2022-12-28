package P484;

import java.util.ArrayList;
import java.util.List;

class Book{
	private String name;
	private int price;
	
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}


public class LibraryTest {

	public static void main(String[] args) {
		
		List<Book> bookList = new ArrayList(); //List�� ArrayList�� ����Ŭ������ ����!
		
		bookList.add(new Book("�ڹ�", 25000));
		bookList.add(new Book("���̽�", 15000));
		bookList.add(new Book("�ȵ���̵�", 30000));
		
		//���⼭���� ��Ʈ������,��� (Q7)
		
		System.out.println("��� å�� ������ ��");
		int sum = bookList.stream().mapToInt(c -> c.getPrice()).sum();	
		System.out.println(sum);
		
		System.out.println("å�� ������ 20000�̻��� å�� �̸� �����Ͽ� ���");
		bookList.stream().filter(p -> p.getPrice() >= 20000).map(n -> n.getName()).sorted().forEach(n -> System.out.println(n));
		
		

	}

}
