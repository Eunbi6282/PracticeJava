package book.chapter13.Ex03;
// static 이너 클래스 : 외부 클래스의 인스턴스 필드, 인스턴스 메서드는 접근이 불가
	// 외부 클래스의 static 필드나 static 메서드는 접근 가능

class A{
	int a= 3; 	//인스턴스 필드(객체화 해야 사용가능)
	static int b = 4;	//정적 필드(객체 생성없이 클래스 이름으로 접근 간으)
	void method1() { // 인스턴스 메서드, 객체 생성 후 접근 가능
		System.out.println("인스턴스 메서드");
	}
	static void method2() { //static메서드, 객체 생성하지 않고 접근
		System.out.println("static메서드");
	}
	
	static class B{
		void bcd() {
			//외부 클래스의 정적 필드와 정적 메서드만 접근 가능
			System.out.println(b); 	//static 필드
			method2();	//static 메서드
		}
	}
}
public class StaticInnerClass {

	public static void main(String[] args) {
		// 1. static 이너클래스 객체 생성
		A.B b = new A.B(); //static 이너 클래스는 외부 객체 생성없이 객체 생성
		b.bcd();
		System.out.println();
		A.method2(); //static메서드 호출(객체 생성없이 클래스명 사용해서 호출가능)
		System.out.println(A.b); //static필드

	}

}
