package usingStream;

import java.util.ArrayList;

public class TravelTest {

	public static void main(String[] args) {
		
		 //15�� �̻� 100����
		TravelCustomer customerKim = new TravelCustomer("������", 20, 100);
		TravelCustomer customerHong = new TravelCustomer("ȫ�浢", 13, 50);
		
		ArrayList<TravelCustomer> customerList = new ArrayList();
		
		customerList.add(new TravelCustomer("�̼���", 40, 100)); //�̷��Ե� �߰�����
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		System.out.println("== �� ��� �߰��� ������� �̸���!! ����ҰԿ� =="); //�̸��� �� map
		customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		
		
		System.out.println("== ������ ������ �� ==");
		int sum = customerList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println(sum);
		
		
		System.out.println("== Ʋ�M����(20���̻� ���) ==");
		customerList.stream().filter(c-> c.getAge() >= 20).map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));
		

	}

}
