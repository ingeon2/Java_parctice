package thisex; 


//this �ǹ� �˱� ���� �ڵ�
//��� Ŭ���� �ۺ��̶� �׳����� �ΰ�����
//���⼭�� this �� �ڽ��� �޸𸮸� ����Ű�� this �̴�. ����Ʈ�� �Լ��� �޸� �ּҸ� ��Ÿ���� ���ݾ�!!


class BirthDay{
	int day;
	int month;
	int year;


	public void setYear(int year) { //���� ���� �ż���
	this.year = year; //this.year�� �������� Ŭ������ �̾� , ���� year�� setYear ���� int year 
	}
	
	public void printThis() { // this ��� �ż���
		System.out.println(this);
	}
}



public class ThisExample {

	public static void main(String[] args) {
		BirthDay b1 = new BirthDay();
		BirthDay b2 = new BirthDay();
		b1.setYear(2000);
		System.out.println(b1);
		System.out.println(b2);
		b1.printThis(); //������ this��
		b2.printThis(); //������ this �� �ٸ��� (�ٸ� �ν��Ͻ��̱� ������ �� �޸��� �ٸ� �κп��� ����Ǳ� ����.)

	}

}
