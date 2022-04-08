package book.chapter13.Ex04;

import chapter06_07.Ex05.Bb;

// 지역 이너 클래스 : 클래스의 메서드 내부에 선언된 클래스
	// 메서드 내부의 필드는 final키가 생략됨. 값을 수정할 수 없다.
	// 지역이너클래스에서 사용되는 지역변수는 자동으로 final로 선언된다.
	// 생략시 컴파일러가 자동으로 할당

class A{
	int a= 3;
	// 필드 : heap에 저장, 반드시 초기화 필요(초기화 강제 진행됨
	// 필드의 초기값을 할당후에 값을 수정할 때는 객체화해서 수정해야 함
	// 생성자나 setter를 통해서 초기값을 할당후에 객체를 생성(가능)
	A(){} // 다른 변수를 받는 생성자가 생기면 기본생성자 호출시 기본생성자가 있어야 함
	
	A( int a){		//생성자 통해서 a의 초기값 할당
		this.a = a;
	}
	public void setA(int a) {
		this.a =a;
	}
	void ccc() {
		//지역변수 : 메서드 내부에 있는 변수(메모리의 스택공간에 저장)
		int a = 3; // 지역변수 초기값 3
		a = 4; 	// 4로 변경
		a = 10; // 10으로 변경
		System.out.println(a);
		
		int b; // 지역변수이므로 수동으로 초기화 해줘야 함
	}
	void abc() {
		int b = 5; // 지역변수 : 메서드 내부에 선언된 변수 (지역 이너클래스에 선언되는 변수만 final키로 인해 값을 못바꿈)
		int c =10;
		c = 20;
		
		class B{
			void bcd() {
				System.out.println(a); // 필드
				System.out.println(b); // 지역변수, final이 생략됨, 값수정 불가
				a = 5; // 필드는 값수정 가능
				//  b = 7; 오류 -> 지역클래스내부에 선언된 지역변수는 자동으로 final키가 컴파일러에 의해서 할당됨
 			}
		}
		//객체 생성 -> 지역이너클래스의 객체는 클래스가 정의된 메서드 내에서만 객체를 생성할 수 있음(일반 클래스 객체 생성방법과 같음)
		B b2 = new B();
		b2.bcd();
	}
}
public class LocalInnerClass {

	public static void main(String[] args) {
		// 1. 객체 생성 후 메서드 호출
		A a = new A();
		a.abc();

	}

}
