package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
	private static final long serialVersionID = -1503252402544036183L;
	String name;
	transient String job; //����ȭ���� �� ������ ���Կ�! ��� �ǹ�
	

	public Person() {}

	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + " , " + job;
	}
	
}



public class SerializationTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Person personAhn = new Person("�����", "��ǥ");
		Person personKim = new Person("��ö��", "��");
		
		try(FileOutputStream fos = new FileOutputStream("serial.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos))//try ������� 
		{
			oos.writeObject(personAhn); //���Ⱑ ����ȭ (�ν��Ͻ��� �ǽð� ������ ����Ʈ ���� ��Ʈ������ ����. �ø���.�ƿ� ���� ����)
			oos.writeObject(personKim);
				
		}
		catch(IOException e) {
			System.out.println(e);
		} 
		
		
		try(FileInputStream fis = new FileInputStream("serial.dat");
				ObjectInputStream ois = new ObjectInputStream(fis))//try ������� 
			{
				Person p1 = (Person)ois.readObject();
				Person p2 = (Person)ois.readObject(); //���Ⱑ ������ȭ (����ȭ�� ������ �ص�)
				
				System.out.println(p1);
				System.out.println(p2);
					
			}
			catch(IOException e) {
				System.out.println(e);
			} 
		
	}

}
