package array;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		for(String a : list) { //���� for
			System.out.println(a);
		}
		
		for(int i = 0 ; i < list.size() ; i++) { //�׳� for
			System.out.println(list.get(i)); //list[i]�� �������� (ArrayList�� �޶�)
		}

	}

}
//ArrayList Ŭ���� �̿��ϱ� (������ �������� �Լ� ����Ѵٰ� �����ϸ� ����.)