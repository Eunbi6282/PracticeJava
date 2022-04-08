package book.chapter12;
class AA{
	/*
	 * 일반 클래스 : 객체 생성시 필드와 메서드는 heap메모리 영역에 저장
	 * Heap 영역 : 반드시 초기화 된 값을 가진다.
	 * 필드 : heap영역에 필드명과 값을 저장
	 * 인스턴스 메소드 : class영역의 인스턴스 메서드 영역에 메서드의 구현코드까지 저장
	 * 				heap 에는 포인터 정보만 가진다. 
	 */
	int a;
	double b;
	char c;
	boolean d;
	byte e;
	float f;
	String gString;
	
	void cry() {}	//완전한 메서드
	
	@Override
	public String toString() {
		return a + " , " + b + " , " + c + " , " + d + " , " + e +" , " + gString;
	}
}

/*
 1. 추상 클래스를 객체화해서 출력하는 방법 1
 -> 많은 객체 생성시 사용(계속 사용할 경우)
 -> 상속을 통해서 자식 클래스를 생성 후, 자식 클래스에서 추상메서드를 재정의하고, 
 자식 클래스를 객체로 생성후 출력
 
 2. 추상 클래스를 객체화해서 출력하는 방법 2
 -> 임시로 한번말 사용할 때 자식없이 임시로 사용할 경우
 -> 자식 클래스 생성없이 main메서드에서 익명 개체를 생성해서 출력하는 방법
 -> 이벤트를 처리할 대 (임시)
 */

abstract class A{		//추상 클래스 : 미완성 메서드를 포함하므로 객체 생성이 불가함
	abstract void abc();
}

class B extends A{
	@Override
	void abc() {
		System.out.println("방법 1 : 자식 클래스 생성 및 추상 클래스 구현");
	}
}
public class AbstractClass_1 {
	public static void main(String[] args) {
		//AA클래스는 일반 클래스므로 객체화가 가능
		AA aa = new AA();
		System.out.println(aa);
		
		// A a = new A(); -> 추상클래스는 객체 생성 불가
		
		//추상 클래스를 상속하는 자식 클래스를 이용해 객체 생성(객체를 여러개 생성할 때)
		A a1 = new B();
		A a2 = new B();
		A a3 = new B();
		
		a1.abc();
		a2.abc();
		a3.abc();
	}
}
