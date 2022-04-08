package book.chapter13.Ex01;

class A{
	public int a = 3;
	protected int b = 4;
	int c = 5;
	private int d = 6;
	void abc() {
		System.out.println("A클래스 메소드 abc()");
	}
	// 이너 클래스 : 아우터 클래스의 접근 지정자에 상관없이 접근 가능
	
	class B{	// 인스턴스 내부 클래스 : 외부 클래스가 객체화 되어야 사용 가능
		void bcd() {
			System.out.println(a); 	// 아우터 클래스의 필드 접근 가능 여부
			System.out.println(b);	//this.b
			System.out.println(c); 	// this.c
			System.out.println(d);
			abc(); //아우터 클래스의 메소드 접근 가능 여부
		}
	}
}


public class InstanceInnerClass_1 {

	public static void main(String[] args) {
		// 1. 아우터 클래스 객체 생성(1단계) -이너 클래서 사용하기 위해서 외부 클래스 먼저 객체화
		A a = new A();
		
		// 2. 이너 클래스 객체 생성(2단계)
		A.B ab = a.new B(); 	// ab : 내부 클래스 인스턴스 변수
		
		// 3. 메서드 , 필드 출려
		ab.bcd();

	}

}
