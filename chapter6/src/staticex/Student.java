package staticex;
public class Student {
	
	
	static int serialNum = 10000;
	static int cardNum = serialNum + 100;
	
	int studentID;
	int cardID;
	String studentName;
	
	public Student() { // Student studentJ = new Student(); �̷��� �����ڰ� ȣ��ɶ����� (�ø����++, ��Ʃ��ƮID = �ø����) �ض�
		serialNum ++;
		studentID = serialNum;
		cardNum ++;
		cardID = cardNum;
	}
	

	public static int getSerialNum() {
		int i = 0; //��������
		
		/*studentName = "ȫ�浿";   ---  �ν��Ͻ����� , �ν��Ͻ����� (�������� = �ν��Ͻ��� ���µ� �̸��� ȫ�浿�� ���ɳֳ�? 
											�ø��� ���� �ν��Ͻ���� �⺻�޸𸮿� ����Ǿ� ���� �� �ִ�) */
		
		return serialNum; //����ƽ ����
	}
	
	
	
} // �����̺� ������ ���ɻ���ϴ�������? - ��Ʃ��Ʈ�׽�Ʈ2.�ڹ�
