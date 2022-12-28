package stream.decorator;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		
		try(InputStreamReader isr = new InputStreamReader (new FileInputStream("reader.txt"))) {
			
			int i;
			while((i = isr.read()) != -1) {
				System.out.print((char)i);
			}
			
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
//��ǲ��Ʈ������(������Ʈ��)�� ��Ʈ��(������ǲ��Ʈ��)�ε� �ѱ� �о�� �� �ִ°�.
//���� ���ϸ��� ����ϸ�Ǵµ�, ��ǲ��Ʈ������(������Ʈ��) ����غ����� �̷��� �Ѱ�.