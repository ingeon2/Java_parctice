package staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		
		Student studentJ = new Student();
		System.out.println(studentJ.studentID); //�긦 ���鶧! �ø���� 10001�� �ǰ�, �¸� ��Ʃ��ƮID�� �Ҵ�������
		
		Student studentT = new Student();
		System.out.println(studentT.studentID); //�긦 ���鶧! �ø���� 10002�� �ǰ�, �¸� ��Ʃ��ƮID�� �Ҵ�������
												//���� �ø������ �л� �� �ȸ�������� 10002 �״�� ����.
		
		/*Student studentL = new Student(); �� �߰��ϸ� �ø���� 10003 �ñ��ϸ� �غ�! */
		
		System.out.println(studentJ.serialNum); //��� ���� 10002�� ������ �л��θ����� �ø������ 10002�� �Ǿ���, ����ƽ ������ �ΰ��� �ν��Ͻ��� �������� ����
		System.out.println(studentT.serialNum);
		
		System.out.println(Student.serialNum); //���ٽ��� Ŭ�������� ����ƽ����(�ø����)������ ������
		
		// ����ƽ���� = Ŭ���������� �׷��� ���� �������, �� ��Ʃ��ƮŬ�������� �������� �ϳ��� �ν��Ͻ����� �̾ҳ�? ��� �����
		

	}

}
