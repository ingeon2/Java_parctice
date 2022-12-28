package collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import collection.Member;

public class MemberHashMap {
	
	private HashMap<Integer,Member> hashmap;
	
	public MemberHashMap(){
		hashmap = new HashMap<Integer,Member>();
	}
	
	public void addMember(Member member) {
		hashmap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if(hashmap.containsKey(memberId)) {
		hashmap.remove(memberId);
		return true;
		}
		System.out.println(memberId + " ���µ��");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir = hashmap.keySet().iterator();
		
		while(ir.hasNext()) {
			int key = ir.next();
			
			Member member = hashmap.get(key);
			System.out.println(member); //��� Ŭ������ toString�̹� �������̵� ���ݾ�.
			
		}
	}

}
