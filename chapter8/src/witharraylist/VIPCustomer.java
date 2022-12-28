package witharraylist;

public class VIPCustomer extends Customer{
	
	private int agentID; //VIP�� ���� ID
	double saleRatio; //������
	
	public VIPCustomer() { 
		//super(); �����ȰͰ� ��������!
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	} // ����Ʈ ������
	
	public VIPCustomer(int CustomerID , String customerName , int agentID) {
		super (CustomerID, customerName); 
		this.agentID = agentID;
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	} // ���� ���� ������
	
	
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
		return super.showCustomerInfo() + " ��� ���� ��ȣ�� " + agentID + "�Դϴ�."; 
	} //�� Ŀ���͸� ���� �����Ǵ� VIP�� �ʿ��� (���� ��ȣ ������� VIP�� �����ֱ� ����.)

	
	
	
	
	
	

}
