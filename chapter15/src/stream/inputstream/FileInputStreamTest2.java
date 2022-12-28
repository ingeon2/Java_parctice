package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {
		
		
		try(FileInputStream fis = new FileInputStream("input.txt")){
			int i;
			while((i = fis.read()) != -1) { //'fis���� �о���°��� i' �̷��� �����ؾ��� fis.read()�� ����Ʈ��� 0��°,1��° �̷������� �о�� (�׽�Ʈ1���� ����)
				System.out.println((char)i);
				}
			System.out.println("end");
			} 
		catch (FileNotFoundException e) {
			System.out.println(e);
			}
		catch (IOException e) {
			System.out.println(e);
			}
		

	}

}
