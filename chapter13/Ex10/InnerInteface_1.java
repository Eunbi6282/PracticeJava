package book.chapter13.Ex10;

//이너 인터페이스 (InnerInterface) : 클래스 내부의 인터페이스가 선언, 외부 클래스 간단하게 사용할 목적
	// 클래스 내부에 선언
	// static이 자동으로 컴파일러에 의해서 생성

class A{
	static interface B{	//static이 컴파일러에 의해서 자동으로 추가됨
		void bcd();		//public abstract
	}
}

//이너 인터페이스를 구현한 클래스 C
class C implements A.B{	//A.B : A클래스의 이너 인터페이스 B

	@Override
	public void bcd() {
		System.out.println("이너 인터페이스를 구현한 클래스 C");
	} 	
	
}
public class InnerInteface_1 {

	public static void main(String[] args) {
		//1. 자식 객체를 직접 생성후 출력(자식 클래스가 구현된 경우)
		C c = new C();	//자신의 객체 통해 직접 호출
		A.B ab = new C();	//부모의 타입으로 업캐스팅 후 오버라이딩을 통해 출력
		c.bcd();
		ab.bcd();
		
		// 2. 익명 클래스로 출력 (자식 틀래스 없이 출력)
		A.B b = new A.B() {
			
			@Override
			public void bcd() {
				System.out.println("익명 이너클래스로 객체 생성후 출력");
				
			}
		};
		b.bcd();
	}

}
