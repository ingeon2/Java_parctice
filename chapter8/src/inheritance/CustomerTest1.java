package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10100);
		customerLee.setCustomerName("Lee");
		customerLee.bonusPoint = 1000;
		
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerID(10101);
		customerKim.setCustomerName("Kim");
		customerKim.bonusPoint = 10000;
		
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo());
		
		//���� ��� Ŀ���͸Ӷ� VIPĿ���͸ӿ��� ����Ʈ ������ �ּ�ó���ؼ� ��������. Ŀ���͸� �׽�Ʈ2������ Ŀ���͸ӿ� �ش��ϴ� �����ڷ� �����ؼ� ���� X
	}

}
