package stream.inputstream;

import java.io.IOException;

public class SystemInTest2 {

	public static void main(String[] args) {
		
		System.out.println("���ĺ� �������� ������ ���� ������");
		
		int i;
		
		
		try {
			while((i = System.in.read()) != '\n') { //   '�Է¹��� i�� ����Ű�� �ƴϴ�' �� Ʈ���϶�����
				System.out.print((char)i);
			}
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
