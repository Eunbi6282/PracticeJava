package book.chapter17.Ex06;
// MemberŬ������ memberid�� equals(), hashCode()�� ���ؼ� ���� -> ������ �ڵ����� Ȯ��

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Member {
	private int memberid;
	private String memberName;
	
	public Member(int memberid, String memberName) {
		this.memberid = memberid;
		this.memberName = memberName;
	}

	public int getMemberid() {
		return memberid;
	}

	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	// memberid�� �ߺ��� �����ϱ� ���� �޼��� equals(), hashCode()����
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			if (this.memberid == ((Member)obj).memberid) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(memberid);
	}
	
	//toString()����
	@Override
	public String toString() {
		return memberName + "ȸ������ ���̵�� " + memberid + "�Դϴ�.";
	}
}

class MemberHashSet{
	private Set<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}
	
	// ���� �Ű������� ���� Set�� �����ϴ� �޼��� 
	public void addMember(Member member) { //Member�� ��ü�� �޾Ƽ� �� �������濡 ���� �߰��ϴ� �޼���
		hashSet.add(member);
	}
	
	// memberid�� ���ϰ� ���� memberid�� �����ϴ� �޼���
	public boolean removeMember(int memberid) {
		// ���� ���鼭 ���� memberid�� ������ ����
		Iterator<Member> iterator = hashSet.iterator();
		
		while (iterator.hasNext()) {
			Member member = iterator.next(); //MemberŸ���� ������ ����-> ��ü�� ����� ���� member������ ����
			int member2 = member.getMemberid(); // MemberŸ������ ������ member�������� get�� ���� memberid�� �����´�. 
				// Set�� ����� �����߿��� getMemberid�� ���� Set�� ����� Memberid�� ������ ��
			
			if (member2 == memberid) {
				hashSet.remove(hashSet.iterator().next());
				System.out.println("ȸ������ " + memberid + " �� �����Ǿ����ϴ�. ");
				return true;
			}
			
		}
		return false;
	}
	
	public void showAllMember(){
		Iterator<Member> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
	}
	
}

public class Ex_MemberHashSet {
	public static void main(String[] args) {
		// MemberHashSet�� ��ü�� ����� MemberHashSet�� �ִ� ��ü �̿� ����
		MemberHashSet memberHashSet = new MemberHashSet();
		
		//Member�� ������ �ҷ��ͼ� ������ �� �Ҵ� -> �̰� �̿��ؼ� 
		Member memberLee = new Member(7111, "������"); // 1��ü�� 2���� �� , memberid membername
		Member memberSon = new Member(1581, "�����");
		Member memberPark = new Member(3333, "������");
		Member memberHong = new Member(3344, "ȫ�浿");
		Member memberJung = new Member(5555, "������");
		
		// MemberHashSet��ü�� �� ��ü�� ���� ���� .addMember()
		memberHashSet.addMember(memberJung);
		memberHashSet.addMember(memberHong);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberPark);
		
		
		// ��� �� ��� �޼���
		memberHashSet.showAllMember();

		//Ư�� ���̵� �����ϴ� �޼���
		memberHashSet.removeMember(5555);
		
		memberHashSet.showAllMember();
		
		
	}

}
