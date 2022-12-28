package generics;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		
		ThreeDPrinter<Powder> printer1 = new ThreeDPrinter<Powder>(); //���ʸ�����, ������������ Ŭ������ �Ŀ�� �ڷ������� ����Ұ�! ��� ��
		
		printer1.setMaterial(new Powder()); //�����Ͱ� �Ŀ�� �ڷ����̴� �Ŀ�� �� �ż��� ��밡������. (Plastic������ Ʋ�ȴٰ���)
		
		Powder powder = printer1.getMaterial();
		
		System.out.println(printer1); //�ڵ����� .����Ʈ�� �̶�� ����������
		
		printer1.printing();
		
		
		
		
		
		
		ThreeDPrinter<Plastic> printer2 = new ThreeDPrinter<Plastic>(); //���ʸ�����, ������������ Ŭ������ �ö�ƽ �ڷ������� ����Ұ�! ��� ��
		
		printer2.setMaterial(new Plastic()); //�����Ͱ� �ö�ƽ �ڷ����̴� �Ŀ�� �� �ż��� ��밡������. (Powder������ Ʋ�ȴٰ���)
		
		Plastic plastic = printer2.getMaterial();
		
		System.out.println(printer2); ////�ڵ����� .����Ʈ�� �̶�� ����������
		
		printer2.printing();
			
		
		
		//ThreeDPrinter<Water> printer3 = new ThreeDPrinter<Water>(); ��� ��������, ���ϱ� ����!

	}

}
//�ö�ƽ, �Ŀ�� Ŭ������ ������������ �ν��Ͻ� printer1,printer2�� �ڷ�������.