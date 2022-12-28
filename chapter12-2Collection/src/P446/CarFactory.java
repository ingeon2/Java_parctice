package P446;

import java.util.HashMap;

public class CarFactory {
	
	private static CarFactory instance = new CarFactory(); //�ν��Ͻ���� ī���丮�ڷ��� �������� ����.
	HashMap<String, Car> carMap = new HashMap<String, Car>(); //ī���̶�� �ؽ����ڷ��� ���� ����.
	
	private CarFactory () {} //������
	
	public Car createCar(String name) {
		if( carMap.containsKey(name) ) {
			return carMap.get(name);
		}
		Car car = new Car();
		carMap.put(name, car);
		return car;
	}
	
	public static CarFactory getInstance() { //������ ����ѵ�..? instance��� ī���丮 �ڷ��� ���� ��������� ���ο� ī���丮 �Ҵ������.
		
		if (instance == null)
			instance = new CarFactory();
		return instance;
	}

}
