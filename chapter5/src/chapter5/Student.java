package chapter5;

public class Student {  //�л� Ŭ���� ����� (�⺻ �Լ��� ������ �ʾ��� �ۺ����̵� ��¼��~)
	int studentID; 
	String studentName;
	int grade;
	String address;
	
		public String getStudentName() { //�л� �̸��� �������� �޼���
		return studentName;
	} 
	
	public static void main(String[] args) {
		Student studentAhn = new Student(); // studentŬ���� ����
		studentAhn.studentName = "�ȹ���";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
