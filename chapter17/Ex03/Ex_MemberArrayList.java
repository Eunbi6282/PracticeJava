package book.chapter17.Ex03;

import java.util.ArrayList;

class Member{
	private int memberid;  			//DTO, VO : 각 계층간의 데이터를 받아서 전달해주는 클래스(private-> 생성자, getter, setter)
	private String memberName;
	
	public Member(int memberid, String memberName) { // 생성자 통해서 필드의 값할당
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
		return memberName + "회원님의 아이디는 " + memberid + "입니다";
	}
}

class MemberArrayList{
	private ArrayList <Member> arrayList; // Member타입의 객체가 들어올 수 있음!!
	
	// 제너릭에서 객체 생성방법
	//List<Member> aList = new ArrayLsit<Member>();
	// ArrayList <Member> arrayList = new ArrayLsit<Member>();
	
	public MemberArrayList () { 
		// 기본생성자(매개변수 값X) -> 기본생성자이므로 MemberArrayList의 객체를 만들면 Member타입의 arraList객체가 만들어짐(Member의 변수들 사용 가능)
		arrayList = new ArrayList<Member>();
	} 
	
	public void addMember(Member member){ //Member타입의 매개변수 받기
		arrayList.add(member);
		
	}
	
	public void addMember2(int a, Member member) {   //매개변수 2개를 받아서 특정 index방 번호에 값을 추가
		try {
			
			arrayList.add(a, member);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("예외가 발생되었습니다. 방번호에 맞게 입력해주세요");
		}
	}
	
	public boolean removeMember(int memberid) {
		//ArrayList에 저장된 memberid를 검색해서 해당 객체를 삭제하는 메서드
		
		for (int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i); // 각방에 저장된 Member객체를 member참조변수에 할당, -> 인풋으로 들어오는 memberid
			//member가 Member타입임!!!! ->
			int temid = member.getMemberid(); // Member객체 안에 있는 memberid값을 get으로 불러옴
			
			if (temid == memberid) {
				arrayList.remove(i);  // 만약 인풋받은 int가 방을 돌면서 찾은 memberid와 같다면 그 방을 삭제해라
				System.out.println("회원님의 " + memberid +"는 삭제되었습니다.");
				return true;
			}
		}
		System.out.println("해당하는 " + memberid + "가 없습니다.");
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
		// 객체를 생성하는 순간 arrayList 필드가 활성화
		// 메서드 호출하기 위해서 객체 생성
		// addMember(), addMember2(), removeMember(), showAllMember();
		
		//arraryList 활성화
		Member memberLee = new Member(1122, "이태민"); // 1객체에 2개의 값, memberid, memberName
		Member memberPark = new Member(1234, "박은비");
		Member memberJung = new Member(1212, "정재현");
		Member memberSon = new Member(1581, "손흥민");
		Member memberHong = new Member(3344, "홍길동");
		
		// 각 객체를생성해서 ArrayList에 저장
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberJung);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberHong);
		
		// 특정 index방에 추가적인 사용자
		memberArrayList.addMember2(3, memberJung);
		memberArrayList.addMember2(10, memberLee); // IndexOutOfBoundsException 발생
		
		// 모든 사용자 정보 출력 -> ArrayList는 for문 통해서 모든 정보 가져오기 
		memberArrayList.showAllMember();
		
		// 특정 id를 가진 사용자 제거
		memberArrayList.removeMember(3344);
		
		

	}

}
