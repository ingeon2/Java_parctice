package chapter4;

public class P100HW {

	public static void main(String[] args) {
		int score = 55;
		char grade;
			if (score >= 90){
				grade = 'A';
				System.out.println("�Ǹ��մϴ�.");
			}
			else if (score >= 80){
				grade = 'B';
				System.out.println("��ȣ�մϴ�.");
			}
			else if (score >= 70){
				grade = 'C';
				System.out.println("�ָ��մϴ�.");
			}
			else if (score >= 60){
				grade = 'D';
				System.out.println("�ƽ����ϴ�.");
			}
			else{
				grade = 'F';
				System.out.println("��������ϴ�.");
			}
			
			System.out.println("������ " + grade + "�Դϴ�.");


	}

}
