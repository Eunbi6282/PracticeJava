package book;
class A350{
	void abc() {
		System.out.println("A클래스의 abc()");
	}
}

class B350 extends A350{
	void abc() {
		System.out.println("B클래스의 abc");
	}
	void bcd() {
		super.abc();
	}
}
public class P_350 {
	public static void main(String[] args) {
		B350 b350 = new B350();
		b350.abc();
		b350.bcd();
	}

}
