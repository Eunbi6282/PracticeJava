package book.chapter16.Ex10;

// ���ʸ� �޼��忡�� �Ű��������� ���� ����
class A{}
class B extends A{}
class C extends B{}
class D extends C{}

class Goods<T>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

class Test{
	// �Ϲ� �޼���, �Ű������� ������ Ÿ���� ���ʸ� Ÿ��
		// ���ʸ� �޼��� �ƴ�! �׳� �Ű������� ������ Ÿ���� ���ʸ� Ÿ���� ��
	void method1 (Goods<A> g) {} // g�� �Ű������� �� �� �ִ� �� -> AŬ���� Ÿ�Ը� ����
	void method2 (Goods<?> g) {} // g�� �Ű������� �� �� �ִ� �� -> A,B,C,D Ŭ���� Ÿ�Ը� ����
	void method3 (Goods<? extends B> g) {} // g�� �Ű������� B,C,D Ŭ���� Ÿ�Ը� ����
	void method4 (Goods<? super B> g) {}  // g�� �Ű������� A,BŬ���� Ÿ�Ը� ���۰���
	
}
public class BoundedTypeOfInputArgument {
	public static void main(String[] args) {
		Test test = new Test();
		
		// 1. method1 : Goods<A> g -> AŬ���� Ÿ�Ը� ����
		test.method1(new Goods<A>()); // �����۵� -> AŬ���� ��ü
		// test.method1(new Goods<B>()); // ����
		
		// 2. method2 : Goods<?> g : ��� Ÿ�� ����
		test.method2(new Goods<A>());
		test.method2(new Goods<B>());
		test.method2(new Goods<C>());
		test.method2(new Goods<D>());
		
		// 3. method3 : Goods<? extends B> g : B�� �� �ڽ� Ŭ���� Ÿ�Ը� ����
		// test.method3(new Goods<A>()); ����
		test.method3(new Goods<B>());
		test.method3(new Goods<C>());
		test.method3(new Goods<D>());
		
		// 4. method4 : Goods<? super B> g : B�� �� �θ� Ŭ���� Ÿ�Ը� ����
		test.method4(new Goods<A>());
		test.method4(new Goods<B>());
		

	}

}
