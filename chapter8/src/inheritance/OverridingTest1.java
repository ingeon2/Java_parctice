package inheritance;

public class OverridingTest1 {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010 , "Lee");
		customerLee.bonusPoint = 1000;
		
		VIPCustomer customerKim = new VIPCustomer(10020 , "Kim" , 12);
		customerKim.bonusPoint = 10000;
		
		int price = 10000;
		
		
		//�̾��� �׳� Ŀ���͸� �� ���� �״�� ����
		//�达�� �׳� VIPĿ���͸� �� ���� ��������Ʈ(VIPĿ���͸� �������)��ŭ ���εǾ� ���� (�ż��� ������)
		
		
		
		System.out.println(customerLee.getCustomerName() + "���� �����ؾ��Ͻ� �ݾ��� " + customerLee.calPrice(price) + "�� �Դϴ�.");
		System.out.println(customerLee.showCustomerInfo());
		//���� �Լ��� �Ʒ��� �Լ��� �޶�! (�� �� ��������) + ���ʽ�����Ʈ ����� �� �����Եɱ� ����~(�Լ� ������ �߿���.)
		System.out.println(customerKim.getCustomerName() + "���� �����ؾ��Ͻ� �ݾ��� " + customerKim.calPrice(price) + "�� �Դϴ�.");
		System.out.println(customerKim.showCustomerInfo());
		
		
		
		System.out.println("===============��ȯ�ѳ� + �������̵� �ż���======================�� �̸��� ���� �ż���!====");
		
		Customer vc = new VIPCustomer (10030 , "vc" , 123){};
		System.out.println("��ȯ�ѳ��ε� �����̸� �׳ɸ޼��� ��õ���̸� �������̵� �ż���, �����? " +vc.calPrice(price));

	}

}
