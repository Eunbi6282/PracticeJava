package book.chapter16.Ex11;


// 제너릭 클래스의 상속 :자식 클래스는 부모 클래스의 제너릭 변수 (T,V,K,E)와 같거나 더 많아야 한다. 

class Parent<T>{
	T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

class B extends Parent<T>{ // B도 <T>타입을 받게 설정해줘야 함
	
}

class Child1 <T> extends Parent<T>{  // 제너릭 클래스를 상속받는 자식클래스는 부모의 타입인 인자개수와 같거나 커야한다.
	// 부모 클래스가 제네릭 클래스일 때 이를 상속한 자식 클래스도 제네릭 클래스가 된다. 
	
}

class Child2 <T ,V> extends Parent<T>{
	// 부모 클래스가 제네릭 클래스일 때 이를 상속한 자식 클래스도 제네릭 클래스가 된다. 
	// 또한 제네릭 타입 변수를 추가해 정의할 수도 있다.
	V v; 		// T는 부모클래스에서 상속받으므로 굳이x

	public V getV() {
		return v;
	}

	public void setV(V v) {
		this.v = v;
	}
	
}
public class InheritanceGeneric {

	public static void main(String[] args) {
		// 1. 부모 제너릭 클래스 생성
		Parent<String> parent = new Parent<String>();
//		Parent<String> parent2 = new Parent<>();  -> 이렇게도 가능
		
		parent.setT("부모 제너릭 클래스");
		System.out.println(parent.getT());
		
		Parent<Integer> integerParent = new Parent<>();
		integerParent.setT(1);
		System.out.println(integerParent.getT());
		
		// 2. 자식 클래스1
		Child1<String> child1 = new Child1<String>();
		child1.setT("자식1 제너릭 클래스"); // 부모에서 상속된 메서드
		System.out.println(child1.getT());
		
		// 3. 자식 클래스 2
		Child2<String, Integer> child2 = new Child2<>(); 	// T는 부모에서 상속되어서 내려옴, V는 자식에서 만듬
		child2.setV(500); 	// 자식 클래스의 메서드
		child2.setT("자식2 -제너릭 클래스"); //부모 클래스이 메서드
		System.out.println(child2.getV()); // 자식 메서드 출력
		System.out.println(child2.getT()); // 부모메서드 출력
	}

}
