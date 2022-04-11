package book.chapter18.Ex02;

// 람다식 문법
// 아래 4개의 인터페이스는 람다식으로 처리 가능 : 함수형 인터페이스(추상 메서드가 1개인 인터페이스)
// 람다식 문법 -> 함수형 인터페이스(추상 메서드가 2개인 인터페이스)를 구현할 때 축약해서 사용할 수 있는 문법

@FunctionalInterface // 함수형 인터페이스라고 선언(추상 메서드 1개만 올 수 있음)
interface A{   // 입력 매개변수X , 리턴타입X
	void method1();
}

@FunctionalInterface // 함수형 인터페이스라고 선언(추상 메서드 1개만 올 수 있음)
interface B{ 	// 입력 매개변수 O, 리턴타입X
	void method2(int a) ;
}

@FunctionalInterface  // 함수형 인터페이스라고 선언(추상메서드 1개만 올 수 있음)
interface C{  // 입력 매개변수 X, 리턴타입O
	int method3();
}

@FunctionalInterface  // 함수형 인터페이스라고 선언 (추상 메서드 1개만 올 수 있음)
interface D{      // 입력매개변수O, 리턴타입 O
	double method4 (int a, int b);  // 
}
public class FuctionToLamdaExpression {

	public static void main(String[] args) {
		// 인터페이스의 함수 구현 ---> 람다식
		// 1. A클래스 구현 (입력매개변수 X, 리턴타입X)
			// (1) 익명 이너클래스
		A a1 = new A() {

			@Override
			public void method1() {
				System.out.println("메서드1-1 : 익명 이너클래스");
			}
		};
		a1.method1();
		
			// (2) 람다식
				// 람다식은 리턴타입, 메서드명이 제거됨
		A a2 = () -> {System.out.println("메서드1-2 : 람다식");}; // 람자식 축약되지 않은 전체 구문
		A a3 = () -> System.out.println("메서드 1-3 : 람다식"); // 구현부에 한라인(;이 한개) 있을 때 중괄호 생략 가능
		a2.method1();
		a3.method1();
		
		// 2. B클래스 구현 (입력 매개변수O, 리턴타입X)
			// (1) 익명 이너클래스
		B b1 = new B() {

			@Override
			public void method2(int a) {
				System.out.println("메서드 2-1 - 익명 이너클래스 : " + a);
			}
		};
		
			// (2) 람다식
		B b2 = (int a) -> {System.out.println("메서드2-2 - 람다식 : " + a );}; // 전체구문
		B b3 = ( a) -> {System.out.println("메서드2-3 - 람다식 : " + a );}; // 축약구문 -> input타입 생략가능(B인터페이스에 모두 정의 해뒀기 때문)
		B b4 = ( a) -> System.out.println("메서드2-4 - 람다식 : " + a );  // 추걍ㄱ구문 -> 실행문이 한라인 (;이 하나일 떄) 중괄호 생략 가능
		B b5 = ( a) -> System.out.println("메서드2-5 - 람다식 : " + a ); //축약구문 -> 입력 매개변수가 하나일 떄 소괄호 생략 가능
		
		b2.method2(1);
		b2.method2(2);
		b3.method2(3);
		b4.method2(4);
		b5.method2(5);
		
		// 3. C클래스 구현(입력매개변수X,리턴타입 O)
			// (1) 익명 이너클래스
		C c1 = new C() {
			@Override
			public int method3() {
				// TODO Auto-generated method stub
				return 4;
			}
		};
		System.out.println(c1.method3());
		
			// (2) 람다식
		C c2 = () -> {return 5;}; // 전체 구문
		C c3 = () -> 8;  // 축약구문 -> return이 한라인으로 적용된 경우 : return생략가능  !!!반드시 중괄호와 함께 생략해야 함!!!
		System.out.println("돌려받은 값은 : " + c2.method3());
		System.out.println("돌려받은 값은 : " + c3.method3());
		
		// 4. D클래스 구현(입력매개변수 O, 리턴타입)
			// (1) 익명 이너클래스
		D d1 = new D() {

			@Override
			public double method4(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}
		};
		System.out.println("두수의 합은 : " + d1.method4(8, 10));
		
			// (2) 람다식
		D d2 = (int a, int b) -> {return a+b;}; // 전체구문
		D d3 = (a,b) -> {return a+b;};  // 축약구문 -> input타입 생략가능(D인터페이스에 정의되어있기 때문에)
		D d4 = (a,b) ->  a+b;   // 축약구문 -> return이 한 라인(;한개)으로 구성되어 있으면 return생략가능 !!!중괄호와 함께 생략하기!!!
		System.out.println("두수의 합은 : " + d1.method4(810, 10));
		
	}

}

