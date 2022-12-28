package object;

class Student{
	int studentID;
	String studentName;
	
	Student(int studentID , String studentName){
		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		
		if( obj instanceof Student) {   //��Ʃ��Ʈ �ν��Ͻ� �ƴϸ� �׳� �񱳵� ���ϴϱ�, (�ν��Ͻ� ���� ��Ʃ��Ʈ�� �´�!)
			Student std = (Student)obj;   //����Ʈ obj�� ��Ʃ��Ʈ std�� �ٿ�ĳ�����ϰ�
			if(studentID == std.studentID) 
				return true;  //���̵� ���ٸ� Ʈ�簥��
			else 
				return false;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return studentID;
		
	}
	
	
		
}


public class EqualsTest2 {

	public static void main(String[] args) {
		
		Student std1 = new Student(100, "�ڼ�ȣ");
		Student std2 = new Student(100, "�ڼ�ȣ");
		
		System.out.println(std1 == std2);
		System.out.println(std1.equals(std2)); //������ ���� ������! ������ �ϰ� ���� Ʈ��!
		
		System.out.println("=========�ؽ��ڵ�========");
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode()); //������ �����ż��� ��������������(���� ������), �������� ���������� �ؽ��ڵ� �ż��嵵 �������ؾ��� (�ڹ� �⺻)	
											 //������ �����ż��� ��������������(���� ������), �������� ���������� �ؽ��ڵ� �ż��嵵 �������ؾ��� (�ڹ� �⺻)	
											 //������ �����ż��� ��������������(���� ������), �������� ���������� �ؽ��ڵ� �ż��嵵 �������ؾ��� (�ڹ� �⺻)	
											 //������ �����ż��� ��������������(���� ������), �������� ���������� �ؽ��ڵ� �ż��嵵 �������ؾ��� (�ڹ� �⺻)	
											 //������ �����ż��� ��������������(���� ������), �������� ���������� �ؽ��ڵ� �ż��嵵 �������ؾ��� (�ڹ� �⺻)	
		

	}

}
