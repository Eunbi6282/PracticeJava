package book.chapter13.Ex05.Ex01;
// 1. �������̽��� �߻� �޼��带 ������ <<<Ŭ������ ����>>>�� ȣ��: ����ϰ� ����ϴ� ���

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
			System.out.println("�۸�");
			
		}

		@Override
		public void fly() {
			System.out.println("������");
			
		}
		
	}
}
public class AnonymousClass_2 {

	public static void main(String[] args) {
		// ��ü ����
		B b = new B();	//BŬ������ �ִ� �޼��� abc()������
		b.abc();

	}

}
