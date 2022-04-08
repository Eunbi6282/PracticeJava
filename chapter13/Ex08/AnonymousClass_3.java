package book.chapter13.Ex08;

// 클래스 정의 및 참조 변수를 사용 , 참조 변수를 사용하지 않을 경우 매개변수로 객체 전달
interface A{
	public abstract void abc();
}
class C{		
	void cde(A a) {		//A타입의 객체를 매개변수로 받는 메서드 cde()
		a.abc();			// -> 입력 매개 변수로 사용될 인터페이스의 객체 생성필요(자식클래스나 익명 이너클래스 필요)
	}
}

// 1. 자식 클래스 직접 생성
class B implements A{

	@Override
	public void abc() {
		System.out.println("매개변수 전달");
		
	}
}

public class AnonymousClass_3 {

	public static void main(String[] args) {
		//방법 1 : 클래스명O + 참조변수명 O
		C c = new C();  // C안의 메서드 사용하려면 C타입객체 생성 필요
		A ab = new B(); // 클래스명(A), 참조변수(a) -> 둘 다 존재
		c.cde(ab); 	// 매개변수에 객체 a를 생성해서 던져줌
		
		//방법 2 : 클래스명O + 참조변수명 X
		C c2 = new C();
		c2.cde(new B()); //객체를 바로 참조변수 명으로 던져중
			//객체 B가 만들어지면서 자동으로 업캐스팅
	}

}
