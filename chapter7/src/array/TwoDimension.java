package array;

public class TwoDimension {

	public static void main(String[] args) {
		int[][] a = new int[][] { {1, 2, 3} , {4, 5, 6} };
		
		for(int i = 0 ; i < a.length ; i++) {
			for(int j = 0 ; j < a[i].length ; j++) {
				System.out.println(a[i][j]);
			}
		}
		
		//================================P221=================================================
		
		char[][] b = new char[13][2];
		char alphabets = 'a';
		
		for (int i = 0 ; i < b.length ; i++) { // i��j�� �����Ҷ� ch�� �����ؾ��� (i: 0 �� 1 ,ch: 65 �� 66)
			for(int j = 0 ; j <b[i].length ; j++) {
			b[i][j] = alphabets;
			alphabets++;
			System.out.println(b[i][j]+ " ");
			//j++���� ����� ���⿡�ٰ� alphabets++; �ᵵ �ȴ�.(����.)
			}
		}

	}

}
