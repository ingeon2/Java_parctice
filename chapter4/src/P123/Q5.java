package P123;

public class Q5 {

	public static void main(String[] args) {
		 int linecount = 4;
		 int spacecount = linecount/2 + 1;
		 int starcount = 1;
		 //int j;
		 for(int i = 0 ; i < linecount ; i++) {  // ���� for�� ���� j�� ���� �ٸ��� �ٷ� �� ����ó�� ������ ���� �� ���� j�� �ȴ�.
			 for(int j = 0 ; j < spacecount ; j++) { // left �����
				 System.out.print(' ');
			 }
			 for(int j = 0 ; j < starcount ; j++) { // *
				 System.out.print('*');
			 }
			 for(int j = 0 ; j < spacecount ; j++) { // right �����
				 System.out.print(' ');
			 }
			 spacecount -= 1;
			 starcount += 2;
			 System.out.println();
			 
		 }

	}

}
