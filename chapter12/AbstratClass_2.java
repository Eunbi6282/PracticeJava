package book.chapter12;

// 2. 추상 메서드를 사용하는 2번째 방법 : 자식 객체 생성없이 익명 클래스를 활용
// 			-> 한번만 임시적으로 사용할 대, 이벤트 처리시 사용
// 			장점 : 자식 클래스를 생성하지 않는다. 임시적으로 사용할 경우 유용
//			단점 : 여러개의 객체를 생성해야 할 경우 코드가 길어짐

abstract class AAA{
	abstract void abc();
}
public class AbstratClass_2 {

	public static void main(String[] args) {
		// 1. 익명 개체 생성 -> 생성자 뒤에 {}넣어서 익명 클래스 생성
		AAA aaa  = new AAA() {
			void abc() {
				System.out.println("방법2 : 객체 생성없이 익명클래스로 추상메서드 구현");
			}
		};
		AAA aaa2 = new AAA() { 
			/*
			 이때 AAA()의 클래스는 AAA의 생성자를 호출하는 것이 아니라 컴파일러가 클래스 AAA를
			 상속받아 abc()를 오버라이딩 한 익명 클래스의 생성자를 호출
			 */
			
			@Override
			void abc() {
				System.out.println("방법2 : 객체 생성없이 익명클래스로 추상메서드 구현");
				
			}
		};
		
		AAA aaa3 = new AAA() {
			
			@Override
			void abc() {
				System.out.println("방법2 : 객체 생성없이 익명클래스로 추상메서드 구현");
			}
		};
		
		aaa.abc();
		aaa2.abc();
		aaa3.abc();
	}
	

}
