package book.chapter16.Ex10;

// 제너릭 메서드에서 매개변수에서 값의 제한
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
	// 일반 메서드, 매개변수로 들어오는 타입이 제너릭 타입
		// 제너릭 메서드 아님! 그냥 매개변수로 들어오는 타입이 제너릭 타입일 뿐
	void method1 (Goods<A> g) {} // g의 매개변수로 올 수 있는 것 -> A클래스 타입만 전송
	void method2 (Goods<?> g) {} // g의 매개변수로 올 수 있는 것 -> A,B,C,D 클래스 타입만 전송
	void method3 (Goods<? extends B> g) {} // g의 매개변수로 B,C,D 클래스 타입만 전송
	void method4 (Goods<? super B> g) {}  // g의 매개변수로 A,B클래스 타입만 전송가능
	
}
public class BoundedTypeOfInputArgument {
	public static void main(String[] args) {
		Test test = new Test();
		
		// 1. method1 : Goods<A> g -> A클래스 타입만 가능
		test.method1(new Goods<A>()); // 정상작동 -> A클래스 객체
		// test.method1(new Goods<B>()); // 오류
		
		// 2. method2 : Goods<?> g : 모든 타입 가능
		test.method2(new Goods<A>());
		test.method2(new Goods<B>());
		test.method2(new Goods<C>());
		test.method2(new Goods<D>());
		
		// 3. method3 : Goods<? extends B> g : B와 그 자식 클래스 타입만 가능
		// test.method3(new Goods<A>()); 오류
		test.method3(new Goods<B>());
		test.method3(new Goods<C>());
		test.method3(new Goods<D>());
		
		// 4. method4 : Goods<? super B> g : B와 그 부모 클래스 타입만 가능
		test.method4(new Goods<A>());
		test.method4(new Goods<B>());
		

	}

}
