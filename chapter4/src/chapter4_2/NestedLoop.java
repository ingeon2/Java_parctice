package chapter4_2;

public class NestedLoop {

	public static void main(String[] args) {
		int i , j;
		for(i=1 ; i<=9 ; i++) {
			System.out.println(i + "�� �Դϴ�");
			
			for(j=1 ; j<=9 ; j++) {
				System.out.println(i + "*" + j + "=" + i*j); //ex) i=1���� �ݺ�, i=2���� �ݺ�...
			}
			
		}
		
		System.out.println("�������� ���ƽ��ϴ�.");

	}

}
//��ø�� for�� (������)