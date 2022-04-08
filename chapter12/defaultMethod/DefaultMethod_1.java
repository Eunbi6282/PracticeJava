package book.chapter12.defaultMethod;
interface A{
	void abc();		//public abstract 생략 -> 미완성된 메소드
	
	default void bcd() {
		System.out.println("A인터페이스의 bcd()");
	}
}

class B implements A{
	@Override
	public void abc() {
		System.out.println("B클래스의 abc()");
	}
}

class C implements A{
	@Override
	public void abc() {			//추상메서드 오버라이딩해서 완벽한 메서드로 구현
		System.out.println("C클래스의 abc()");
	}
	
	@Override
	public void bcd() {			// default메서드 오버라이딩
		System.out.println("C틀래스의 bcd()");
	}
}

public class DefaultMethod_1 {
	public static void main(String[] args) {
		//객체 생성
		A a1 = new B();
		A a2 = new C();
		
		//메서드 호출
		a1.abc();
		a2.abc();
		
		a1.bcd();		//B클래스는 default 메서드 오버라이딩 하지 않았음
		a2.bcd();		//C클래스는 default 메서드 오버라이딩 함
	}	
}
