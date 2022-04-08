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
		// 1. Ŭ���� X, �������� O
		C c = new C();
		A a = new A() {	//�ڽ� Ŭ���� ���� �͸� �̳�Ŭ���� ���

			@Override
			public void cry() {
				System.out.println("±±");
			}

			@Override
			public void fly() {
				System.out.println("����");
				
			} 	
			
		};
		c.abc(a);
		
		//2. Ŭ���� X, �������� X
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
