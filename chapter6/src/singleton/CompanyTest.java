package singleton;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company c1 = Company.getinstance(); //�̰� ���� ����ϱ�. private �����ڿ� static �ż��� �����ٰ� ������ �ʿ��� ��.
											// c1�� ���۴� Ŭ������ �� �ν��Ͻ� �Լ��Ἥ �Ҵ������.
		
		Company c2 = Company.getinstance();
		
		System.out.println(c1); //instance ��ȯ �޼��带 ����Ʈ�����ض� = instance ����Ʈ�ƿ� �϶�� �� = instance �ּ�(�̱����̶� ����)
		System.out.println(c2);
		
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		
		System.out.println(cal1);
		System.out.println(cal2); //��׵��� �⺻���� �̱���Ÿ��.(�����̺� ����ƽ���� ���������൵)

	}

}
//�̱��� = �ν��Ͻ���! �����ϰ�. Ŭ���� �Ʒ��� �ν��Ͻ� ���鶧, �����̺� ����ƽ!