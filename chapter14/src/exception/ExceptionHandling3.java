package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
			
			try {
				fis = new FileInputStream("a.txt");
			} 
			catch(FileNotFoundException e) { //a.txt �����ϱ� Ĺġ���� ����
				System.out.println(e); //���� Ŭ����(Ĺġ)�� toString�ż��� ȣ��
				return;
			} 
			finally {
				if( fis != null) {
					try {
						fis.close();
					}
					catch (IOException e) {
						e.printStackTrace();
					}
				}
				System.out.println("�׻� ����˴ϴ�.");

			}
			
			System.out.println("���⵵ ���ؿ����ϴ�.");


	}

}
