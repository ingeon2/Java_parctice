package reference;

public class Student3Test {

	public static void main(String[] args) {
		Student3 studentJames = new Student3(100, "James");
																						/*public Student3(int id , String name) { //������ �ٸ��������� ����
																						studentID = id;
																						studentName = name;
																						
																						korean = new Subject();
																						math = new Subject();
																					}    */
		
		studentJames.setKorean("����", 100);
		studentJames.setMath("����", 90);
		
		
																					/*public void setKorean(String name , int score) { //���� �ż���
																							korean.setSubjectName(name);
																							korean.setScorePoint(score);
																						}
								
																					public void setMath(String name , int score) { //���� �ż���
																						math.setSubjectName(name);
																						math.setScorePoint(score);
																					}    */
		
		studentJames.showStudentInfo();
		
																						/* public void showStudentInfo() {
																						int total = korean.getScorePoint() + math.getScorePoint();
																						System.out.println("�л��� ������ " + total + "�� �Դϴ�.");
																					} */
	}

}
