package book.chapter16.Ex07;

// 제너릭 메서드 내부에서 사용 가능한 메서드 : Object클래스의 메서드만 사용 가능하다.
class A{
	public <T> void method(T t) { // 제너릭 메서드 -> 일반 클래스 안에서 선언, 리턴타입앞에<매개변수 타입정의>
		// System.out.println(t.length()); 오류 -> 제너릭 메서드 내부에선 Object클래스의 메서드만 사용 가능하다. 
		// but .length()는 String클래스의 메서드이다.
		System.out.println(t.equals("안녕")); // .equals()는 Object클래스의 메서드이므로 가능
	}
	
	public <T extends Object> void method2(T t) { // T [extends Object]가 생략되어 있다. 
		System.out.println(t.equals("반갑습니다")); //Object클래스의 메서드만 사용 가능
	}
	public <T extends String> void method3(T t) { //String 타입으로 지정되어 .length()사용 가능
		System.out.println(t.length());
	}
}

public class AvailableMethodInGenericMethod {

	public static void main(String[] args) {
		A a = new A();
		a.<String>method("안녕");
		a.<String>method2("방가");
		a.<String>method3("반갑습니다.");

	}

}
