package chapter2;

public class ImplicitConversion {

	public static void main(String[] args) {
		byte bNum = 10;
		int iNum = bNum; //���� ���� �ٲٱ�
		
		System.out.println(bNum);  //byte
		System.out.println(iNum);  //int
		
		int iNum2 = 20;
		float fNum = iNum2; //���� ���� �ٲٱ�
		
		System.out.println(iNum);  //int
		System.out.println(fNum);  //float
		
		double  dNum;
		dNum = fNum + iNum; //int �� float -> float���� �ٲ�
		System.out.println(dNum); //double
		
		

	}

}
