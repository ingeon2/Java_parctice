package cooperationEx;

public class TakeTrans {

	public static void main(String[] args) {
		
		Student ��ȣ = new Student("��ȣ" , 100000);
		Student ���� = new Student("����" , 5000);
		
		Bus bus1 = new Bus(3);
		Subway subway1 = new Subway(1);
		Taxi taxi1 = new Taxi(6680);
		
		��ȣ.takeBus(bus1);
		��ȣ.takeTaxi(taxi1);
		����.takeSub(subway1);
		
		bus1.businfo();
		subway1.subinfo();
		taxi1.taxiinfo();
		
		��ȣ.showInfo();
		����.showInfo();

	}

}
