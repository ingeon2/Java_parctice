package inheritance;

public class Customer {
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	/*public Customer() {  //������
		//super (); = �����Ϸ��� �ڵ��߰��ϴ� �ڵ�. ����Ʈ ������ó�� ���� �ʾƵ� �ִ°��� ���� Ŭ����(Object)�� ȣ���ϴ� �����.
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer() ������ ȣ��"); //�����ϸ� Ŀ���͸Ӷ� vipĿ���͸� ������������ ���� �� �� �ִ�.
	}*/
	
	public Customer(int customerID , String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	
	
	
	
	
	
	
	public int calPrice (int price) { //���ʽ�����Ʈ ��� �ż���
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() { //������ �˷��ִ� �ż���
		return customerName + "���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ�� " +
		bonusPoint + "�Դϴ�." ;
	}
	
	
	
	//������Ƽ�� ��������� �ż���� ����ϰ� �ټ��߰�
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
}
