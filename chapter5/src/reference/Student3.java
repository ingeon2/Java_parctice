package reference;

public class Student3 {
	int studentID;
	String studentName;
	Subject korean;
	Subject math;				/* �ٲ�� = ������ ��Ʃ��Ʈ2���� �ڸ��ƽ��ھ� �ڸ��Ƽ��� �ΰ����� �����ߴ� ������
	 							�����̶�� Ŭ������ ���� �ΰ����� �ϳ��� ����.	
	 							���� �ΰ���(���ھ� , ����)�� ���� Ŭ�������� �����Է°���*/
	
	/*public Student3() {
		korean = new Subject();
		math = new Subject();
	} */
	
	public Student3(int id , String name) { //������ �ٸ��������� ����
		studentID = id;
		studentName = name;
		
		korean = new Subject();
		math = new Subject();
	}
	
	
	public void setKorean(String name , int score) { //���� �ż���
		korean.setSubjectName(name);
		korean.setScorePoint(score);
	}
	
	public void setMath(String name , int score) { //���� �ż���
		math.setSubjectName(name);
		math.setScorePoint(score);
	}
	
	//���ݱ��� �� ����, �������� ����� �ż��� �����
	
	public void showStudentInfo() {
		int total = korean.getScorePoint() + math.getScorePoint();
		System.out.println("�л��� ������ " + total + "�� �Դϴ�.");
	}

}
