package book.chapter13.Ex09.Ex01;
interface A{
	void cry();
	void fly();
}

class C{
	void abc(A a) {
		a.cry();
		a.fly();
	}
}
public class AnonymousClass4_1 {
	public static void main(String[] args) {
		// 1. 클래스 X, 참조변수 O
		C c = new C();
		A a = new A() {	//자식 클래스 없이 익명 이너클래스 사용

			@Override
			public void cry() {
				System.out.println("짹짹");
			}

			@Override
			public void fly() {
				System.out.println("날다");
				
			} 	
			
		};
		c.abc(a);
		
		//2. 클래스 X, 참조변수 X
		c.abc(new A() {

			@Override
			public void cry() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void fly() {
				// TODO Auto-generated method stub
				
			}
			
		});
	}
}
