package exercise4;

public class TakeCoffee {

	public static void main(String[] args) {
		Cafe star = new Cafe("���ٹ�" , "�达" , 0);
		
		Americano ame = new Americano("�Ƹ޸�ī��");

		star.takeAme(ame); //�갡 ��ü������ ����
		
		ame.ameInfo();
		
		star.cafeInfo();
	}

}
