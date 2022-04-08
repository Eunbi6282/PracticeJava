package book;
class A{}
class B extends A{}
class C extends B{}
class D extends B{}


public class P_322 {

	public static void main(String[] args) {
		// 업캐스팅(자동으로 변환)
		A ac = new C();		// C는 A다.
		A ab = new B();		// B는 Aek.
		A ad = new D();	// D는 A다.
		B bd = new D(); // D는 B다.
		C c = new C();
			
		//객체 생성할 수 없는 경우
//		C c2 = new B();
//		B b = new A();	//B타입이 되도 A에서 B타입의 멤버에 접근할 수 없음
//		D d = new B();
		
		//다운캐스팅 : 부모에서 자식데이터 타입으로 변환(수동변환)
		A aaA = new A();
		// B bbB = new aaA;  //다운캐스팅 불가
		
		//다운캐스팅 가능
		A ac3 = new C();
		//B ac4 = new ac3;
		
	}

}
