package book.chapter16.Ex07;

// 제너릭 클래스 : 클래스를 선언할 때 타입변수는 선언<T> <<정의>>, 객체 생성시 T에 적용할 타입을 지정

// 제너릭 메서드 : 일반 클래스 내부의 메서드 선언시 제너릭 타입변수를 사용

class ssGeneric{ 	//일반 클래스
	
	//3개의 제너릭 메서드
	public <T> T method1 (T t) {
		return t;
	}
	
	public <T> boolean method2 (T t1, T t2) {
		return t1.equals(t2);
		// 두값을 비교 true, false를 리턴
		// 기본 자료형일 때는 값을 비교, 참조 자료형일 때는 객체의 주소를 비교
		// *String일경우, equals 가 재정의 되어있으므로 값을 비교한다.
			//String -> Integer, Double, equals가 재정의 되어 있다.
	}
	
	public <K,V> void method3 (K k, V v) { // 2개의 타입 들어옴
		System.out.println(k + " : " + v);
	}
	public <K,V> void method4 () {
		System.out.println("매개 변수가 인풋값으로 없는 경우 오류");
	}
	
}

public class GenericMethod {

	public static void main(String[] args) {
		// 1. 일반 클래스 객체 생성 후 제너릭 메서드 호출
		ssGeneric gmGeneric = new ssGeneric();
		String str1 = gmGeneric.<String>method1("안녕"); // T -> String 
		// 메서드 호출하기 전에 <타입>지정해서 호출
		String  str2 = gmGeneric.method1("안녕");
		// 타입을 알 수 있는 경우 <String>생략 가능(매개변수로 값이 들어갈때 생략가능)
		System.out.println(str1);
		System.out.println(str2);
		
		Integer integer = gmGeneric.<Integer>method1(100);
		Integer integer2 = gmGeneric.method1(200);
		System.out.println(integer);
		System.out.println(integer2);
		
		Boolean boolean1 = gmGeneric.<Double>method2(2.55, 2.553);
		// method2의 리턴타입이 boolean
		Boolean boolean2 = gmGeneric.<Double>method2(1.5, 1.5);
		System.out.println(boolean1);
		System.out.println(boolean2);
		
		// method3의 리턴타입 -> void(바로 출력 가능)
		gmGeneric.<Integer, String> method3(500, "서버에러입니다.");
		gmGeneric.method3(402, "파일을 찾을 수 없습니다.");
		
		gmGeneric.method4();
		

	}

}
