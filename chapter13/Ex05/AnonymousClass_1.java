package book.chapter13.Ex05;
	//1. ���� ���̽��� ����� �̳�Ŭ������ �����ؼ� ��ü ���

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
			System.out.println("�ν��Ͻ� �̳� Ŭ����");
		}
	}
}

public class AnonymousClass_1 {

	public static void main(String[] args) {
		// ��ü ���� �� �޼��� ȣ��
		A a = new A();
		a.abc();

	}

}
