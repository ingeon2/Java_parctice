package inheritance;

public class CustomerTest2 {

	public static void main(String[] args) {
		VIPCustomer customerPark = new VIPCustomer(10030, "Park", 1);
		
		
		System.out.println(customerPark.showCustomerInfo());
		System.out.println(customerPark.calPrice(10000) + " , " + customerPark.bonusPoint);
		//Į �����̽� ���� 10000���� 10�ۼ�Ʈ ���εǾ� 9000, ���ʽ�����Ʈ �����̽� ���� 10000���� ���ʽ����� 5�ۼ�Ʈ

	}

}
