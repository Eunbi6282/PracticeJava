package book.chapter13.Ex08.Ex01;

//3. 메서드의 매개변수로 전달
	// 3-1 : 객체 생성 후 매개변수로 전달 (클래스명 O, 참조변수 O)
	// 3-2 : 객체 생성 후 매개변수로 전달 (클래스명 O , 참조변수 X)

interface A{
	public abstract void cry();
	public abstract void fly();
}

class C {
	void abc(A a) {		//하위자식 클래스가 매개변수로 들어올 경우 A타입으로 자동 업캐스팅이 된다. 
		a.cry();
		a.fly();
	}
}

// A의 객체를 생성하기 위한 자식클래스 생성
class B implements A{

	@Override
	public void cry() {
		System.out.println("멍멍");
	}

	@Override
	public void fly() {
		System.out.println("날다");
		
	}
	
}
public class AnonymousClass_3_1 {

	public static void main(String[] args) {
		// 1. 클래스명 O , 참조변수 O
		C c = new C();
		A ab = new B();
		c.abc(ab); // A타입의 객체를 매개변수로
		
		//2. 클래스명 O , 참조변수 X
		C c2 = new C();
		c2.abc(new B()); //객체 B가 만들어 지면서 A타입으로 자동 업캐스팅 -> A타입 객체가 매개변수로 들어감

	}

}
