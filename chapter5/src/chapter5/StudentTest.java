package chapter5;

public class StudentTest {

	public static void main(String[] args) {
		Student studentAhn = new Student();
		studentAhn.studentName = "����ȯ";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());

	}

}
//������ ��Ʃ��Ʈ ���� �л� Ŭ������ �������, ���� ��Ű���� �ִ� ��Ʃ��Ʈ �׽�Ʈ�� �л� Ŭ������ ����� �� �־� ����� ���̴�.
//��Ʃ��Ʈ�� ��Ʃ��Ʈ��, ��Ʃ��Ʈ�׽�Ʈ�� ��Ʃ��Ʈ�� ���� �ٸ���. (��������!)
//Ŭ������ ��Ʃ��Ʈ, �ν��Ͻ��� ��Ʃ��Ʈ��