package P123;

public class Q3 {

	public static void main(String[] args) {
		int i;
		int j;
		
		for(i=1 ; i<=9 ; i++) {
			if(i%2 != 0) continue;
			System.out.println("========="+ i +"���Դϴ�========");
			for(j=1 ; j<=9 ; j++) {
				System.out.println(i + "*" + j + "=" + i*j);
				
			}
		}
	
		System.out.println("¦�� �ܸ� �ִ±������� ���ƽ��ϴ�.");

	}

}
