package test;

import hiding.Student;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		
		studentLee.address = "����";
		
		//studentLee.studentName = "���ΰ�"; ���� ��Ʃ��Ʈ Ŭ�������鶧 ��Ʃ��Ʈ ������ private ��� -> �ܺ�Ŭ�������� ���Ұ�.
		studentLee.setStudentName("���ΰ�"); // ��� �ż�������ҋ� piblic���� �ؼ� �̸��ǵ������.
		
		
		System.out.println(studentLee.getStudnetName( ));

	}

}
