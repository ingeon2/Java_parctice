package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("a.txt");
		} catch(FileNotFoundException e) { //a.txt �����ϱ� Ĺġ���� ����
			System.out.println(e); //���� Ŭ����(Ĺġ)�� toString�ż��� ȣ��
		}
		
		System.out.println("���⵵ ���ؿ����ϴ�.");

	}

}
