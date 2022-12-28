package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	
	public Class loadClass(String filename, String className) throws FileNotFoundException, ClassNotFoundException{
		//���� throws�� Ʈ����ĳġ �̵� ����Ѵ�(�̷��) ��� ��
		
		FileInputStream fis = new FileInputStream(filename);
		Class c = Class.forName(className);
		return c;
	}
	
	
	

	public static void main(String[] args) {
		
	ThrowsException ex = new ThrowsException(); //�Ʊ� throws �Ѱ� ���⼭ �ڵ鸵(Ʈ����ĳġ) �ؾ��� , �׷��� ������
	try {
		ex.loadClass("b.txt", "java.lang.String"); //b.txt������� �ڹٷ���Ʈ���־ Ĺġ����ȵȴ�
	} catch (FileNotFoundException e) {
		System.out.println(e);
	} catch (ClassNotFoundException e) {
		System.out.println(e);
	} /*� �ͼ��� Ŭ������ �ڵ鸵 �ؾ����� �𸣰ڴٸ�, �ֻ���Ŭ���� ���ܹ����� , �Ʒ��� ����� (�������� ���� �갡 �Ծ������ ������ �ͼ������� ���� x)
	  catch (Exception e) {
		System.out.println(e);
	}
	
	*/
	
	System.out.println("�߰��� ������ �ƴϰ�!");

  }

}
