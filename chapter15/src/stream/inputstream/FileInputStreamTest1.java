package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("input.txt");
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e);
			}
			catch (NullPointerException e) { //�׳� �� ����Ŭ����Exception���ܵ� �Ǵµ�, � �������� ���� �� �ϱ� ���� �̷������� ���.
				System.out.println(e); 		 //Exception ��ġ Ʋ���� ��������
			}
		}
			System.out.println("end");
	}

}
//��ǲ �ؽ�Ʈ �������� Ʈ���� �ȵǰ�, 17��� 25���� ĳġ�� �ɸ�
//������ ��ǲ �ؽ�Ʈ ���� ABC���� ����, ����� ABC�� �ƽ�Ű�ڵ尪����.