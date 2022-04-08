package book.chapter13.Ex10.Ex01;

class A{
	B b; 	// B: 인터페이스타입, b : 참조변수 <값을 할당하는 방법>
				// b의 초기값 : null
					/*  <세가지 값을 할당하는 방법>
					 *  1. 객체 생성 후 값을 할당
					 *  2. 생성자를 통해서 값을 할당
					 *  3. setter를 통해서 값을 할당
					 */
	A (){}
	A (B b){	//B타입인변수b를 받아 활성화시킴
		this.b = b;
	}
	
	interface B{ 	
		void play(); 	//public abstract
		void stop();
	}
	//setter 통해서 값을 할당
	public void setB (B b) {
		this.b = b;
	}
		
	void abc() {
		b.play();
		b.stop();
		
	}

}
public class InnerInterface1_1 {

	public static void main(String[] args) {
		A a = new A(); 	//기본 생성자 필요
		// setter통해서 값을 할당
		a.setB(new A.B(){ 	// 클래스명ㅇ, 참조변수X(익명 이너클래스 사용)

			@Override
			public void play() {
				System.out.println("실행합니다");
			}

			@Override
			public void stop() {
				System.out.println("중지합니다.");
			}
		});
		a.abc();
		System.out.println("=========");
		
		// 1. 객체 생성 후 필드의 값을 할당
		A a2 = new A();
		//클래스 A의 b 필드 값에 A.B객체를 구현한 값 할당
		a2.b = (A.B) new A.B(){		//클래스 A객체 하위B 인터페이스

			@Override
			public void play() {
				System.out.println("play");
			}

			@Override
			public void stop() {
				System.out.println("stop");
				
			}		
		};
		
		// 2. 생성자를 이용해서 값을 할당
		A a3 = new A(		// A()안에 B타입을 받는 변수 할당
				new A.B() {
					
					@Override
					public void stop() {
						System.out.println("실행");
					}
					
					@Override
					public void play() {
						System.out.println("중지");
					}
				}
				); 	
		a3.abc();
	}

}
