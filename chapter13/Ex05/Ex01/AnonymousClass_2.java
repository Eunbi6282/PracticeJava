package book.chapter13.Ex05.Ex01;
// 1. 인터페이스의 추상 메서드를 구현한 <<<클래스를 생성>>>후 호출: 빈번하게 사용하는 경우

interface A{
	public abstract void cry();
	public abstract void fly();
}

class B{
	A a = new C();
	
	void abc() {
		a.cry();
		a.fly();
	}
	
	class C implements A{

		@Override
		public void cry() {
			System.out.println("멍멍");
			
		}

		@Override
		public void fly() {
			System.out.println("못난다");
			
		}
		
	}
}
public class AnonymousClass_2 {

	public static void main(String[] args) {
		// 객체 생성
		B b = new B();	//B클래스에 있는 메서드 abc()쓸거임
		b.abc();

	}

}
