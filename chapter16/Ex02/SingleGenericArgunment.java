package book.chapter16.Ex02;
	/*
	 Object : 모든 객체를 저장할 수 있지만, 다운캐스팅이 필요하고 캐스팅 시 예외가 발생될 수 있다.(약한 타입 체크)
	 제너릭 클래스 : 하나의 클래스에서 다양한 데이터 타입을 처리할 수 있다.
	 	제너릭 타입 변수 : T(Type), K (Key), V (Value), N(Number), E (Element- ㅜ언소)
	 		// A-Z까지 임의로 넣을 수 있다.
	 		// Wrapper 클래스 : 기본 타입을 객체화 시켜놓은 클래스
	 		int -> Integer , boolean -> Boolean, char -> Char, double ->Double, float -> Float
	 		byte -> Byte , short -> Short , long -> Long
	 */
class MyClass<T>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

public class SingleGenericArgunment {
	public static void main(String[] args) {
		// 1. 제너릭 클래스 객체 생성<String>을 입력
		MyClass<String> mc1 = new MyClass(); 	// Wrapper클래스를 할당해야 한다.
		mc1.setT("안녕");
		System.out.println(mc1.getT());
		
		// 2. 제너릭 클래스 객체 생성 <Integer>를 입력
		MyClass<Integer> mc2 = new MyClass();
		mc2.setT(100);
		System.out.println(mc2.getT());
		
		// 3.제너릭 클래스 객체 생성 <Double>을 입력
		MyClass<Double> mc3 = new MyClass();
		mc3.setT(33.3333);
		System.out.println(mc3.getT());
		
		// 4. 강한 타입 체크(컴파일 단계에서 오류를 출력)
		MyClass<Boolean> mc4 = new MyClass();
		mc4.setT(true); 
		// mc4.setT("안녕"); -> 오류, Boolean엔 true false만 가능, 
			// 강한 타입체크 -> 컴파일 단계에서 오류표시(실행시의 오류를 방지 시켜줌)

	}

}
