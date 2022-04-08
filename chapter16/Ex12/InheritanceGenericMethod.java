package book.chapter16.Ex12;


class Parent{
	<T extends Number> void print (T t) { // 제너릭 메서드 : 일반 클래스 내에 있어야 함
		System.out.println(t);
	}
}

class Child extends Parent{
	// 제너릭메서드를 포함한 일반 클래스르 상속해 부모 클래스의 제너릭 메서드는 그대로 자식 클래스로 상속됨
}

public class InheritanceGenericMethod {
	public static void main(String[] args) {
		// 1. 부모 클래스의 제너릭 메서드 사용
		Parent parent = new Parent();
		parent.<Integer>print(200);
		parent.<Double>print(100.85);
		parent.print(300); // 매개변수로 들어가는 값의 타입을 알 수 있는 경우 생략 가능
		
		System.out.println();
		
		// 2. 자식클래스에서 제너릭 메서드 사용
		Child child = new Child();
		child.<Integer>print(200);
		child.<Double>print(200.39);
		

	}

}
