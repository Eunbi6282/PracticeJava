package book.chapter13.Ex05;
	//1. 인터 페이스를 상속한 이너클래스를 생성해서 객체 출력

interface C {
	abstract void bcd();
}

class A{
	C c = new B();
	void abc() {
		c.bcd();
	}
	
	class B implements C{

		@Override
		public void bcd() {
			System.out.println("인스턴스 이너 클래스");
		}
	}
}

public class AnonymousClass_1 {

	public static void main(String[] args) {
		// 객체 생성 및 메서드 호출
		A a = new A();
		a.abc();

	}

}
