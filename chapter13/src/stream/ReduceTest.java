package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) { //����ª�� String
		
		if(s1.getBytes().length <= s2.getBytes().length)
			return s1;
		else return s2;
	}
	
}




public class ReduceTest {

	public static void main(String[] args) {
		
		String [] greetings = {"�ȳ��ϼ���~~~~~", "hello", "Good morning", "�ݰ����ϴ�"};
		
		System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) ->{ //greetings�� ArrayList���ٸ� greetings.stream().forEach �̷������� ������
			if(s1.getBytes().length >= s2.getBytes().length)
				return s1;
			else return s2;}	
		)); //11����� 14������� ��������.
		
		
		//������ ���� �Ʒ��� ���� CompareString Ŭ���� �������̽� �����Ű�� �ż��� �������ؼ� ��������� ����°�.
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str);
		
		
		

	}

}