package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		
		Student james = new Student ("James" , 5000); //��Ʃ��Ʈ �ν��Ͻ� �����
		Student tomas = new Student ("Tomas" , 10000);
		
		Bus bus1 = new Bus(3); //����,������ �ν��Ͻ� �����
		Subway subway1 = new Subway(1);
		
		james.takeBus(bus1); //�ѹ��� �¿�� �ż��� (����ũ���� �ż��� �ȿ� �� ����ũ �ż��� ����)
		tomas.takeSubway(subway1);
		
		james.showInfo();//��Ʃ��Ʈ ��� �ż���
		tomas.showInfo();
		
		bus1.showInfo(); //���� ������ ��� �ż���
		subway1.showInfo();
		
		

	}

}
