package arraylist74;

import java.util.ArrayList;

public class Student {
	
	private int studentID;
	private String studentName;
	private ArrayList<Subject> subjectList; //�̰� �߿�
	
	
	public Student (int studentID , String studentName ) { //���̵� ���� ��������, ������Ʈ����Ʈ �����϶�� ������.
		this.studentID = studentID;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>(); //�̰� �߿� (SubjectŬ������ ���� ������ ArrayList)
	}
	
	public void addSubject(String name , int score) {//������Ʈ �����ϰ�, ������ ������Ʈ�� �л��� ������Ʈ ����Ʈ(��̸���Ʈ, �ν��Ͻ��� ����)�� �߰���Ű�� �ż���
									
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		
		subjectList.add(subject);
	}
	
	public void studentInfo( ) {
		int total = 0;
		for(Subject subject : subjectList) {
			total += subject.getScorePoint();
			
			System.out.println("�л� " + studentName + "����" + subject.getName() + "������ ������" +
								subject.getScorePoint() + "�� �Դϴ�");	
		}
		
		System.out.println("�л� " + studentName + "���� ������" + total + "�� �Դϴ�");	
		
	}
	
	
	
}
