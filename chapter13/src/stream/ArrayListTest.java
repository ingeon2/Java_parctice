package stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> sList = new ArrayList();
		
		sList.add("2");
		sList.add("1");
		sList.add("3");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s -> System.out.println(s));
		
		sList.stream().forEach(s -> System.out.println(s)); //16 17��� �Ȱ��� ���.
		
		/*for(String s : sList) {
			System.out.println(s);
		} �̰� �츮�� ��ҿ� ������ */
		
		
		
		sList.stream().sorted().forEach(s -> System.out.println(s)); //��Ƽ�� 

	}

}
//sList.stream()