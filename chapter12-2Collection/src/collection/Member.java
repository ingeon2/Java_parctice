package collection;

public class Member {
	
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	
	//���� �ټ�
	public String toString() {
		return memberName + "���� ȸ����ȣ�� " + memberId + "�Դϴ�.";
	}
	
	//������ʹ� �ؽ��ڵ嶧����, ��� Ŭ�������� ���� ��ü�� ó���ϴ� ��� ����. (set�� �ߺ����� �ʾƾ� ���ݾ�)

	@Override
	public int hashCode() {
		return memberId; //���� ������̵�� ���� �ؽ��ڵ�(�ּ�, �ĺ���)
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Member) { //obj ����ν��Ͻ����
			Member member = (Member)obj; //member������ obj�ٿ�ĳ�����ؼ� �ְ�
			
			if(this.memberId == member.memberId) //member������ ���̵� ���� ���̵� ������ ���� �ż��尡 Ʈ���̴�
				return true; //���� �ż��尡 Ʈ���̴�
			else //�ƴϸ�
				return false; //���� �ż��尡 �����̴�
		}
		return false; //obj�� Member�� �ν��Ͻ� �ƴ϶�� �׳� ���͵����� ���� ������  ��� �������̵���
	}

	
	
	
}
