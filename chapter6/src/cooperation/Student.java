package cooperation;

public class Student {
	
	String studentName;
	int grade;
	int money;
	int Num;
	
	public Student(String studentName , int money ) { //���� �Ӵ� �޴� ������ (����Ʈ������ �ƴ�)
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus( Bus bus ) { //����Ÿ�� �ż���
		bus.take(1000); //���� �ڹٿ��� ���� �ż��� take ���̺κ��� ��ü�� ������ (�ż��� ���� �ż���!)
		money -= 1000;
		Num++;
	}
	
	public void takeSubway( Subway subway /*������ ������ �ν��Ͻ��� �� ��*/ ) { //������Ÿ�� �ż���
		subway.take(1500); //������ �ڹٿ��� ���� �ż��� take ���̺κ��� ��ü�� ������ (�ż��� ���� �ż���!)
		money -= 1500;
		Num++;
	}
		
	public void showInfo() { //���� �˷��ִ� �ż���
		System.out.println(studentName + "���� ���߱����� " + Num + "ȸ �̿��ϼ̰�, ���� �ݾ���" + money + "�� �Դϴ�");
	}
}
