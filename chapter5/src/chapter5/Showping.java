package chapter5;

public class Showping {
	long Num;
	String ID;
	String Day; //��¥�� ���� Calendar���
	String Name;
	String GoodsId;
	String library;
	
	public static void main(String[] args) {
		Showping order1 = new Showping();
		order1.Num = 201803120001L;
		order1.ID = "abc123";
		order1.Day = "2018�� 3�� 12��";
		order1.Name = "ȫ���";
		order1.GoodsId = "PD0345-12";
		order1.library = "����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ� ��ȣ : " + order1.Num);
		System.out.println("�ֹ��� ���̵� : " + order1.ID);
		System.out.println("�ֹ� ��¥ : " + order1.Day);
		System.out.println("�ֹ��� �̸� : " + order1.Name);
		System.out.println("�ֹ� ��ǰ ��ȣ : " + order1.GoodsId);
		System.out.println("��� �ּ� : " + order1.library);
		
		
		

	}

}
