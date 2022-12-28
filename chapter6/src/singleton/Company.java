package singleton;

public class Company {
	
	private static Company instance = new Company(); //�̷��� �����ϸ� �̱���. ���� ���۴� Ŭ�������� �ٸ� �ν��Ͻ� �������
	
	private Company () {} // �����̺� ����Ʈ ������

	public static Company getinstance() { //����ƽ �޼���� �ν��Ͻ� �������� ��밡��
		if (instance == null)
			instance = new Company();
		return instance;
	}
		
}
