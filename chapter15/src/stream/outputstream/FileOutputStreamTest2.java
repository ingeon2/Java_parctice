package stream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("output2.txt", true); //Ʈ��� �̾����� ���
		
		try(fos){
			byte [] bs = new byte[26];
			byte data = 65; //A�ƽ�Ű��
			
			for(int i = 0 ; i < bs.length ; i++) { //bs �迭�� 65���� ����ֱ�
				bs[i] = data;
				data++;
			}
			fos.write(bs); //�迭���
			}
		catch(IOException e) {
			System.out.println(e);
		}
		
		System.out.println("��� ��");

	}

}
