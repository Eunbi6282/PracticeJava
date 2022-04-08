package book.chapter13.Ex06;

// 2. �͸� �̳�Ŭ������ ����Ͽ� �������̽� ��ü ����
class A{
	C c = new C() {

		@Override
		public void bcd() {
			System.out.println("�͸� �̳�Ŭ����");
		}
		public void cde() {
			System.out.println("yyy");
		}
	};
	
	void abc() {
		c.bcd();
		// c.cde(); -> ���� : c�� CŬ������ Ÿ������ ������ ������ interface C�� �ִ� �޼����� bcd()�� ȣ�� �����ϴ�. 
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
		// ��ü ���� �� �޼��� ȣ��
		A a = new A();
		a.abc();
		
		B b = new B();
		b.bcd();
		b.cde();
		

	}

}
