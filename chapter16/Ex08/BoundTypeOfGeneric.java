package book.chapter16.Ex08;
class A{}
class B extends A{}
class C extends B{}

// ���ʸ� Ÿ���� Ŭ���� : ���ʸ� Ÿ�Կ� ������ ��ü�� ����, <>�ܺο��� ������ Ÿ���� ����
class D <T extends B>{ // T : classB, class C�� �� �� �ִ�.
	// <T extends B> �� �ǹ� : T��� Ÿ�Կ� ������ ����
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

public class BoundTypeOfGeneric {

	public static void main(String[] args) {
		// D<A> d1 = new D<A>(); ���� -> <T extends B>�� ���ؼ� B�� ������ �ڽ�Ŭ������ ���� �����ϴ�. AŸ������ ��ü�� ���� �� ����.
		D<B> d2 = new D<B>();
		D<C> d3 = new D<C>();
		
		D d4 = new D(); // = D(B), D(C) => Ÿ���� �������� �ʰ� ��ü�� ����� �ֻ��� Ÿ��(B)���� ������
		// = D<B> d2 = new D<B>();
		
		d2.setT(new B()); //B��ü ���� ����
		d2.setT(new C()); //C��ü ���� ����
		// d2.setT(new A()); -> ����
		
		// d3.setT(new B()); -> ���� : d3�� ���ʸ� Ÿ������ C�� �����߱� ������ B��ü�� �Է� �Ұ���
		d3.setT(new C());
		

	}

}
