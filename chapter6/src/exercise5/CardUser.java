package exercise5;

public class CardUser {
	

	public static void main(String[] args) {
		
		CardCompany a = CardCompany.getOnly();
		CardCompany b = CardCompany.getOnly();
		
		System.out.println(a);
		System.out.println(b);
				
		/*===========================���� �̱��� �Ʒ��� ����ƽ=======================*/
		
		
		Card c = new Card();
		Card d = new Card();
		
		System.out.println(c.CardID);
		System.out.println(d.CardID);

	}

}
