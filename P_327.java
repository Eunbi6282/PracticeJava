package book;
class AAA{}
class BBBB extends AAA{}	//B가 A상속


public class P_327 {

	public static void main(String[] args) {
		// instanceof
		
		AAA aaA = new AAA();
		AAA abA = new BBBB();	//abA는 A,B타입 포함하지만 업캐스팅으로 A만 사용 가능
		
		System.out.println(aaA instanceof AAA);
		System.out.println(abA instanceof AAA);
		System.out.println(aaA instanceof BBBB);	//false
		System.out.println(abA instanceof BBBB);
		
		
		if(aaA instanceof BBBB) {
			BBBB bb = (BBBB) aaA;
			System.out.println("aa를 B로 캐스팅 했습니다.");
		}else {
			System.out.println("aaA는 B타입으로 캐스팅 불가능!!");	//aa는 A타입만 내포하고 있으므로 Bx타빙븡로 다운캐스팅 불가
		}
		
		if (abA instanceof BBBB) {
			BBBB bbb = (BBBB) abA;
			System.out.println("abA를 B타입으로 캐스팅 했습니다.");
		}else {
			System.out.println("abA를 B타입으로 캐스팅 불가능!!!");
		}
		
		if ("안녕" instanceof String) {
			System.out.println("\"안녕\"은 String클래스 입니다. ");
		}

	}

}
