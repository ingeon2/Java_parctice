package P562;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class P562 {

	public static void main(String[] args) {
		
		try(OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("a.txt"));){
			osw.write("������ ������ ���ݱ��� ����ϼ̽��ϴ�");
		}
		catch(IOException e) {
			System.out.println(e);
		}
		
	}

}
