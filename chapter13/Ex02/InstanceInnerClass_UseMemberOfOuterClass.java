package book.chapter13.Ex02;
// 이너 클래스에서 외부 클래스의 필드와 메서드 접근 방법

import book.chapter13.Ex02.A.B;

/* 오버라이딩 : 1. 부모와 자식이 상속관계가 있어야 한다.
 * 			2. 인스턴스 메서드 오버라이딩
 * 			3. 인스턴스 필드, static필드, static메서드는 오버라이딩 불가
 */

class A{
	int a=3;
	int b = 4;
	int c = 33;
	int d =44;
	void abcd() {	//오버 라이딩이 아님. 외부 내부 클래스의 동일한 메서드는 별개의 공간에 위치
		System.out.println("A클래스의 메서드 abcd()");	
	}
	
	class B{ 	// 이너클래스에서 외부 클래스의 중복된 필드나 메서드를 호출하는 경우
		int a = 5;
		int b = 66;
		
		void abcd() {	//오버라이딩이 아닌 별개의 메서드(오버라이딩이 되려면 두 클래스가 상속관계에 있어야 함)
			System.out.println("B클래스의 abcd()");
			
		}
		void bcd() {
			//1. 자기 자신의 필드와 메서드 호출(B클래스)
			System.out.println(a); //this.a 5
			System.out.println(b); // this.b  66
			abcd(); //this.abcd
			
			//2. 아우터클래스의 필드와 메서드 호출
			System.out.println(A.this.a); //3
			System.out.println(A.this.b); //4
			A.this.abcd(); //아우터클래스(A클래스의 메서드호출)
			
			//3. 아우터클래스의 필드와 메서드 호출
			System.out.println(c); 	// 얘네는 중복된 필드 이름, 메서드 없음
			System.out.println(d);
			
		}
		
	}
}
public class InstanceInnerClass_UseMemberOfOuterClass {

	public static void main(String[] args) {
		//1. 객체 생성
		A a = new A();	// 아우터 클래스의 객체 먼저 생성
		
		A.B ab = a.new B(); //B클래스 A.B타입
		ab.abcd();
		a.abcd();
		System.out.println("============");
		
		//3. 내부 클래스의 필드와 메서드 호출
		System.out.println(ab.a);
		System.out.println(ab.b);
		ab.bcd();
		

	}

}
