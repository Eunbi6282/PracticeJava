package book.chapter12;
interface Apple{
	int a = 3;		//public static final 생략
	void abc();		//public abstract 생략(추상메서드)
}

class Banana implements Apple{
	public void abc() {
		System.out.println("방법1 : 자식 클래스 생성자로 객체 생성");
	}
}

public class CreateObjectOfInterface {
	public static void main(String[] args) {
		System.out.println("====자식클래싀 이용(인터페이스는 타입으로만 선언)");
		// 객체 생성 / interface와 abstract 클래스는 객체를 직접 생성할 수 없지만 타입선언은 가능
		Apple a = new Banana();
		Apple a2 = new Banana();
		
		//메서드 호출
		a.abc();
		a2.abc();
		
		System.out.println("======이너 클래스 사용(직접객체 선언가능)=====");
		Apple apple = new Apple() {
			
			@Override
			public void abc() {
				System.out.println("방법2 : 익명 이너 클래스를 이용한 객체 생성");
			}
		};
		Apple apple2 = new Apple() {
			public void abc() {
				System.out.println("방법2 : 익명 이너 클래스를 이용한 객체 생성");
			}
		};
		
		// 메서드 호출
		apple.abc();
		apple2.abc(); 
	}

}
