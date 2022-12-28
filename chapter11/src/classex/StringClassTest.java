package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class strClass = Class.forName("java.lang.String"); //��������x �����ִ� ��Ʈ�� Ŭ���� �����ͼ� strClass�ν��Ͻ� ����
		
		Constructor[] cons = strClass.getConstructors(); //���� srtClass�� ����Ʈ���� �θ��� �ż���� Constructor[]Ŭ������ cons�ν��Ͻ� ����
		
		for(Constructor c : cons) { //������ ���ɸ������ ������
			System.out.println(c);
			}
		
		Field[] fields = strClass.getFields();
		
		for(Field f : fields) {
			System.out.println(f); //public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER(��� �����������)
		}
		
		Method[] methods = strClass.getMethods();
		
		for(Method m : methods) {
			System.out.println(m);//��� �޼���� ������ IN "java.lang.String"
		}

	}

}//String Ŭ���� ������ Class Ŭ������ �˾ƺ���.
