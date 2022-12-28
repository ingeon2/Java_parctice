package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(101, "�̼���"); //����Ʈ �ʿ��� (��Ű�� �޶�)
		Member memberKim = new Member(102, "������");
		Member memberPark = new Member(104, "�ڼ�ȣ");
		Member memberShin = new Member(103, "�Ż��Ӵ�");
		
		memberArrayList.addMember(memberLee); //0
		memberArrayList.addMember(memberKim); //2
		memberArrayList.addMember(memberShin); //3
		memberArrayList.insertMember(memberPark, 1); //1
		
		memberArrayList.showAll();
		
		//��������
		
		memberArrayList.removeMember(memberKim.getMemberId());
		
		memberArrayList.showAll();
		

	}

}
