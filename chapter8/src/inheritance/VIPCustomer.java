package inheritance;

public class VIPCustomer extends Customer{
	
	private int agentID; //VIP�� ���� ID
	double saleRatio; //������
	
	/*public VIPCustomer() { //Customer�̶� ���ؼ� ���Ϻ��� �߰��� ������.
		//super (); = �����Ϸ��� �ڵ��߰��ϴ� �ڵ�. ����Ʈ ������ó�� ���� �ʾƵ� �ִ°��� ���� Ŭ����(Customer)�� ȣ���ϴ� �����.
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer() ������ ȣ��"); //�����ϸ� Ŀ���͸Ӷ� vipĿ���͸� ������������ ���� �� �� �ִ�.
	} */
	
	public VIPCustomer(int CustomerID , String customerName , int agentID) {
		super (CustomerID, customerName); //Ŀ���͸��� ������ ȣ��! (ID Name ���� ������ ȣ���ؼ� �״�� ���Ű�, �������� ���˾Ƽ� �ۼ��Ұ�.)
		this.agentID = agentID;
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	
	public int getAgentID() {
		return agentID;
	}
	
	//��� Ŀ���͸� ��ӹް�������, �ű��ִ� �������, ������, �ż��� �� ��밡��
	
	
	//���� �Ʒ����� �ż��� �������̵� (Ŀ���͸� Ŭ������ Į �����̽� �ż��带 VIPĿ���͸ӿ� �°� �ٲٴ� ��.)
	@Override        //(@Override �� �����Ϸ����� �������̵� �˷��ִ� ����)
	public int calPrice (int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio); //VIP���� �߰��������!
	}


	@Override
	public String showCustomerInfo() {
		// TODO Auto-generated method stub
		return super.showCustomerInfo() + " ��� ���� ��ȣ�� " + agentID + "�Դϴ�."; 
	}


	
	
	
	
	
	

}
