package stream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {

	public static void main(String[] args) throws IOException {
		
			
			FileOutputStream fos = new FileOutputStream("output3.txt", true); //Ʈ��� �̾����� ���
			
			
			byte [] bs = new byte[26];
			byte data = 65; //A�ƽ�Ű��
			for(int i = 0 ; i < bs.length ; i++) { //bs �迭�� 65���� ����ֱ�
				bs[i] = data;
				data++;
			}
			
			
			
			try(fos){
				fos.write(bs, 2, 10); //�迭��� bs�� �ι�° �ڸ����� 10�� �Է��ϰڴ�!
				}
			catch(IOException e) {
				System.out.println(e);
			}
			
			System.out.println("��� ��");


	}

}
