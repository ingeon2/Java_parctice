package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import collection.Member;

public class MemberHashSet {
			
			private HashSet<Member> hashSet;
			
			public MemberHashSet () {
				hashSet = new HashSet<Member>(); //�ؽ��� ������
			}
			
			
			//�Ʒ� ���� �޼���
			public void addMember(Member member) {
				hashSet.add(member);
			}
			
			
			public boolean removeMember(int memberId) {
				Iterator<Member> iterator = hashSet.iterator();
				
				while ( iterator.hasNext()) {
					Member member = iterator.next();
				
					int id = member.getMemberId();
					if(memberId == id) {
						hashSet.remove(member);
						return true;
				}
			}
				System.out.println("�ʰ� ���� ������̵� ���ڴ� ���µ�..?");
				return false;
					
		}
			
			
			
			
			
			public void showAll() {
				
				for(Member member : hashSet) {
					System.out.println(member.toString());
				}
				System.out.println(); //���پ� ���� ����� �Ϸ���!
				//System.out.println(arrayList); ��� ��� ��µɱ�? [�̼��Ŵ��� ȸ����ȣ�� 101�Դϴ�., �����Ŵ��� ȸ����ȣ�� 102�Դϴ�., �Ż��Ӵ���� ȸ����ȣ�� 103�Դϴ�.]
			}

}