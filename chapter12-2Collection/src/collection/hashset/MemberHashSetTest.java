package collection.hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(101, "�̼���"); //����Ʈ �ʿ��� (��Ű�� �޶�)
		Member memberKim = new Member(102, "������");
		Member memberLee2 = new Member(101, "�̸���");
		Member memberShin = new Member(103, "�Ż��Ӵ�");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberShin);
		memberHashSet.showAll();
		
		memberHashSet.addMember(memberLee2);
		memberHashSet.showAll(); //������̵� �������� �ߺ��� �ڷ�. (������� �������̵� �ΰ� �Ѱ�)

	}

}
