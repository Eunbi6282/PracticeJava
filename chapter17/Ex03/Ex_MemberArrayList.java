package book.chapter17.Ex03;

import java.util.ArrayList;

class Member{
	private int memberid;  			//DTO, VO : �� �������� �����͸� �޾Ƽ� �������ִ� Ŭ����(private-> ������, getter, setter)
	private String memberName;
	
	public Member(int memberid, String memberName) { // ������ ���ؼ� �ʵ��� ���Ҵ�
		this.memberid = memberid;
		this.memberName = memberName;
	}

	public int getMemberid() {
		return memberid;
	}

	public String getMemberName() {
		return memberName;
	}
	
	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return memberName + "ȸ������ ���̵�� " + memberid + "�Դϴ�";
	}
}

class MemberArrayList{
	private ArrayList <Member> arrayList; // MemberŸ���� ��ü�� ���� �� ����!!
	
	// ���ʸ����� ��ü �������
	//List<Member> aList = new ArrayLsit<Member>();
	// ArrayList <Member> arrayList = new ArrayLsit<Member>();
	
	public MemberArrayList () { 
		// �⺻������(�Ű����� ��X) -> �⺻�������̹Ƿ� MemberArrayList�� ��ü�� ����� MemberŸ���� arraList��ü�� �������(Member�� ������ ��� ����)
		arrayList = new ArrayList<Member>();
	} 
	
	public void addMember(Member member){ //MemberŸ���� �Ű����� �ޱ�
		arrayList.add(member);
		
	}
	
	public void addMember2(int a, Member member) {   //�Ű����� 2���� �޾Ƽ� Ư�� index�� ��ȣ�� ���� �߰�
		try {
			
			arrayList.add(a, member);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("���ܰ� �߻��Ǿ����ϴ�. ���ȣ�� �°� �Է����ּ���");
		}
	}
	
	public boolean removeMember(int memberid) {
		//ArrayList�� ����� memberid�� �˻��ؼ� �ش� ��ü�� �����ϴ� �޼���
		
		for (int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i); // ���濡 ����� Member��ü�� member���������� �Ҵ�, -> ��ǲ���� ������ memberid
			//member�� MemberŸ����!!!! ->
			int temid = member.getMemberid(); // Member��ü �ȿ� �ִ� memberid���� get���� �ҷ���
			
			if (temid == memberid) {
				arrayList.remove(i);  // ���� ��ǲ���� int�� ���� ���鼭 ã�� memberid�� ���ٸ� �� ���� �����ض�
				System.out.println("ȸ������ " + memberid +"�� �����Ǿ����ϴ�.");
				return true;
			}
		}
		System.out.println("�ش��ϴ� " + memberid + "�� �����ϴ�.");
		return false;
		
	}
	
	public void showAllMember() {
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
			
		}
	}
	
}
public class Ex_MemberArrayList {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		// ��ü�� �����ϴ� ���� arrayList �ʵ尡 Ȱ��ȭ
		// �޼��� ȣ���ϱ� ���ؼ� ��ü ����
		// addMember(), addMember2(), removeMember(), showAllMember();
		
		//arraryList Ȱ��ȭ
		Member memberLee = new Member(1122, "���¹�"); // 1��ü�� 2���� ��, memberid, memberName
		Member memberPark = new Member(1234, "������");
		Member memberJung = new Member(1212, "������");
		Member memberSon = new Member(1581, "�����");
		Member memberHong = new Member(3344, "ȫ�浿");
		
		// �� ��ü�������ؼ� ArrayList�� ����
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberJung);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberHong);
		
		// Ư�� index�濡 �߰����� �����
		memberArrayList.addMember2(3, memberJung);
		memberArrayList.addMember2(10, memberLee); // IndexOutOfBoundsException �߻�
		
		// ��� ����� ���� ��� -> ArrayList�� for�� ���ؼ� ��� ���� �������� 
		memberArrayList.showAllMember();
		
		// Ư�� id�� ���� ����� ����
		memberArrayList.removeMember(3344);
		
		

	}

}
