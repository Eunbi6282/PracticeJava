package book.chapter16.Ex08;
class A{}
class B extends A{}
class C extends B{}

// 제너릭 타입의 클래스 : 제너릭 타입에 들어오는 객체를 제한, <>외부에서 들어오는 타입을 지정
class D <T extends B>{ // T : classB, class C만 올 수 있다.
	// <T extends B> 의 의미 : T라는 타입에 접근을 제한
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
		// D<A> d1 = new D<A>(); 오류 -> <T extends B>로 인해서 B를 포함한 자식클래스만 접근 가능하다. A타입으로 객체를 만들 수 없다.
		D<B> d2 = new D<B>();
		D<C> d3 = new D<C>();
		
		D d4 = new D(); // = D(B), D(C) => 타입을 지정하지 않고 객체를 만들면 최상의 타입(B)으로 설정됨
		// = D<B> d2 = new D<B>();
		
		d2.setT(new B()); //B객체 저장 가능
		d2.setT(new C()); //C객체 저장 가능
		// d2.setT(new A()); -> 오류
		
		// d3.setT(new B()); -> 오류 : d3은 제너릭 타입으로 C를 지정했기 때문에 B객체는 입력 불가능
		d3.setT(new C());
		

	}

}
