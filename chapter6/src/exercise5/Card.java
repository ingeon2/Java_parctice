package exercise5;

class CardCompany{

		private static CardCompany only = new CardCompany();
		
		private CardCompany() {}

		public static CardCompany getOnly() {
			if(only == null)
				only = new CardCompany();
			return only;
		}
	
/*=====================================���� �̱��� �Ʒ��� ����ƽ====================================== */
	
}

public class Card {
	static int CardNum = 1;
	int CardID;
	
	public Card() {
		this.CardID = CardNum;
		CardNum ++;
	}

}
