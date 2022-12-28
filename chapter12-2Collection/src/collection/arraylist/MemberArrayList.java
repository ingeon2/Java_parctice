package collection.arraylist;

import java.util.ArrayList; //��Ʈ�� ����Ʈ ��!
import java.util.Iterator;

import collection.Member; //��� Ŭ������ ���� ��Ű���� ��� �����°�. (�ڷ������� ������ݾ�)

public class MemberArrayList {
	
	private ArrayList<Member> arrayList;
	
	public MemberArrayList () {
		arrayList = new ArrayList<Member>(); //��̸���Ʈ ������
	}
	
	
	//�Ʒ� ���� �޼���
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	//alone
	public void insertMember(Member member, int index) {
		arrayList.add(index, member);
	}
	
	
	
	/*public boolean removeMember(int memberId) { //�ż��� �����غ� ����... + �Ҹ����� �̾Ƴ��� �ż��� ���� + �� �� �� ������ ��ġ ���� (for�� ������ ���� ���� ����)
		
		for(int i = 0 ; i < arrayList.size() ; i++) {
			Member member = arrayList.get(i);
			int id = member.getMemberId();
					if(id == memberId) {
						arrayList.remove(i);
						return true;
					}
		}
		System.out.println("�ʰ� ���� ������̵� ���ڴ� ���µ�..?");
		return false;
	}*/
	
	//���� �Ȱ��� �ż������� ���ͷ��ͷ� Ǫ�¸ż��� �ٷ� �Ʒ���
	
	
	public boolean removeMember(int memberId) {
		Iterator<Member> iterator = arrayList.iterator();
		while ( iterator.hasNext()) {
			Member member = iterator.next();
		
			int id = member.getMemberId();
			if(memberId == id) {
				arrayList.remove(member);
				return true;
		}
	}
		System.out.println("�ʰ� ���� ������̵� ���ڴ� ���µ�..?");
		return false;
			
}
	
	
	
	
	
	public void showAll() {
		
		for(Member member : arrayList) {
			System.out.println(member.toString());
		}
		System.out.println(); //���پ� ���� ����� �Ϸ���!
		//System.out.println(arrayList); ��� ��� ��µɱ�? [�̼��Ŵ��� ȸ����ȣ�� 101�Դϴ�., �����Ŵ��� ȸ����ȣ�� 102�Դϴ�., �Ż��Ӵ���� ȸ����ȣ�� 103�Դϴ�.]
	}
	
}
