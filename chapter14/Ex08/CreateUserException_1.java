package book.chapter14.Ex08;

// 사용자 정의 예외 Exception
	// 1. Exception을 상속하는 예외 : 일반예외(Checked Exception) -> 컴파일 단계에서 예외처리 필요
	// 2. RunTimeException을 상속하는 예외 : 실행예외(unCheckedException) -> 실행 시에 예외 발생
class MyException extends Exception{
	// 일반예외 상속
	public MyException () {	// 1. 기본 생성자 생성
		super(); // 부모클래스의 메서드 호출(Exception) 
	} 
	public MyException (String message) {  //예외 메세지 출력시 사용
		super(message);
	}
}

class MyRTException extends RuntimeException{
	// 실행 예외 상속
	public MyRTException () {
		super();	// 부모클래스의 메서드 호출(RuntimeException -> Exception) 
	}
	public MyRTException(String message) {
		super(message);
	}
}

//예외 처리 클래스
class A{
	// 1. 사용자 정의 예외 객체 생성(일반 예외 객체)
	MyException me1 = new MyException();
	MyException me2 = new MyException("예외 메세지 : MyException");
	// message가 String값으로 들어가서 부모클래스에서 String값을 매겨변수로 받는 경우 e.getMessage()출력
		
	// 2. 런타임 예외 객체
	MyRTException mre1 = new MyRTException();
	MyRTException mre2 = new MyRTException("예외 메세지 : MyRTException");
	
	//(1) 예외를 강제로 발생 시키기(throw) :
	void abc_1(int num) {
//		if (num > 70) {
//		System.out.println("정상 작동");
//		}else {
//			throw mel;	// 예외를 강제로 발생시킴
//		}
		try {
			if (num > 70) {
				System.out.println("정상 작동");
			}else {
				throw me1;	// me1에 throw를 사용해서 강제로 예외를 발생시킴
			}
		} catch (Exception e) {
			// me1이 기본생성자라서 예외가 생길 경우 e.getMessage()는 null값임
			// 기본생성자에 찍으면 값이 안찍히고 String을 받는 생성자를 찍으면 값이 찍힘
			System.out.println(e.getMessage());
		}
	}
	
	// (2) 예외를 전가 (throws) : abc_2()를 호출하는 곳에서 예외 처리를 해줘야 함
	void abc_2(int num) throws MyException {
		if(num > 70) {
			System.out.println("정상작동");
		}else {
			throw  me2;
		}
	}
	
	void bcd_1() {
		abc_1(65); 	//예외 발생
	}
	void bcd_2() {	//abc_2를 호출하는 곳에서 예외 처리를 해줘야 함
		try {
			abc_2(44);
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}
}
public class CreateUserException_1 {
	public static void main(String[] args) {
		A a = new A();
		a.bcd_1(); 	//예외를 직접구현
		a.bcd_2();	// throws로 예외를 전가시켜 호출하는 쪽에서 예외를 처리함

	}

}
