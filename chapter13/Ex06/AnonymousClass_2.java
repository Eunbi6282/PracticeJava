package book.chapter13.Ex06;

// 2. 익명 이너클래스를 사용하여 인터페이스 객체 생성
class A{
	C c = new C() {

		@Override
		public void bcd() {
			System.out.println("익명 이너클래스");
		}
		public void cde() {
			System.out.println("yyy");
		}
	};
	
	void abc() {
		c.bcd();
		// c.cde(); -> 오류 : c는 C클래스를 타입으로 가지기 때문에 interface C에 있는 메서드인 bcd()만 호출 가능하다. 
	}
}
interface C{
	public abstract void bcd();
}

class B implements C{

	@Override
	public void bcd() {
		System.out.println("z");
	}
	public void cde() {
		System.out.println("c");
	}
	
}
public class AnonymousClass_2 {

	public static void main(String[] args) {
		// 객체 생성 및 메서드 호출
		A a = new A();
		a.abc();
		
		B b = new B();
		b.bcd();
		b.cde();
		

	}

}
