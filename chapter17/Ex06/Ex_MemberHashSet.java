package book.chapter17.Ex06;
// Member클래스의 memberid를 equals(), hashCode()로 비교해서 설정 -> 동일한 코드인지 확인

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
	
	// memberid의 중복을 방지하기 위한 메서드 equals(), hashCode()정의
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
	
	//toString()정의
	@Override
	public String toString() {
		return memberName + "회원님의 아이디는 " + memberid + "입니다.";
	}
}

class MemberHashSet{
	private Set<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}
	
	// 받은 매개변수의 값을 Set에 저장하는 메서드 
	public void addMember(Member member) { //Member의 객체를 받아서 맨 마지막방에 값을 추가하는 메서드
		hashSet.add(member);
	}
	
	// memberid를 비교하고 같은 memberid를 제거하는 메서드
	public boolean removeMember(int memberid) {
		// 방을 돌면서 같은 memberid가 있으면 삭제
		Iterator<Member> iterator = hashSet.iterator();
		
		while (iterator.hasNext()) {
			Member member = iterator.next(); //Member타입의 변수를 만듬-> 객체에 저장된 값을 member변수에 담음
			int member2 = member.getMemberid(); // Member타입으로 저장한 member변수에서 get을 통해 memberid를 가져온다. 
				// Set에 저장된 값들중에서 getMemberid를 통해 Set에 저장된 Memberid만 가지고 옴
			
			if (member2 == memberid) {
				hashSet.remove(hashSet.iterator().next());
				System.out.println("회원님의 " + memberid + " 는 삭제되었습니다. ");
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
		// MemberHashSet의 객체를 만들면 MemberHashSet에 있는 객체 이용 가능
		MemberHashSet memberHashSet = new MemberHashSet();
		
		//Member의 생성자 불러와서 변수에 값 할당 -> 이걸 이용해서 
		Member memberLee = new Member(7111, "이은비"); // 1객체에 2개의 값 , memberid membername
		Member memberSon = new Member(1581, "손흥민");
		Member memberPark = new Member(3333, "박은비");
		Member memberHong = new Member(3344, "홍길동");
		Member memberJung = new Member(5555, "정재현");
		
		// MemberHashSet객체에 각 객체의 값을 저장 .addMember()
		memberHashSet.addMember(memberJung);
		memberHashSet.addMember(memberHong);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberPark);
		
		
		// 모든 값 출력 메서드
		memberHashSet.showAllMember();

		//특정 아이디를 삭제하는 메서드
		memberHashSet.removeMember(5555);
		
		memberHashSet.showAllMember();
		
		
	}

}
