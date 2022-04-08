package book.chapter15.Ex06;

public class ThreadProperties_1 {

	public static void main(String[] args) {
		// 1. 객체 가져오기(currentThread())
			// Thread의 개수(activeCount())
		
			// static currentThread() < - static 키라서 객체생성 없이(타입)명으로 바로 메서드 불러올 수 있음.
		Thread curThread = Thread.currentThread();
		// 클래스명.메서드명;
		
		//getName()은 인스턴스화 해서 가져와야 함
		System.out.println("현재 쓰레드의 이름 : " + curThread.getName());
		System.out.println("동작하는 스레드 수 : " + Thread.activeCount()); //메인메서드 한개
		System.out.println("===============");
		
		// 2. 쓰레드 이름 출력(자동출력) - JVM이 이름을 자동으로 할당
			//(1) 10개 생성해보기
		for (int i = 0; i < 10; i++) {	//스레드 10개가 자동으로 만들어짐
			Thread thread = new Thread();
			System.out.println(thread.getName());	//스레드 이름 출력
			thread.start();
		}
		
		// 3. 쓰레드 이름 직접 지정 : 객체명.setName();
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread();
			thread.setName(i + "번째 스레드");
			System.out.println(thread.getName());
			thread.start();
		}
			
		// 4. 스레드 이름 자동 지정(자동 출력) - JVM이 이르믕ㄹ 자동으로 할당/앞번호에서 이어서 번호가 할당 됨
			for (int j = 0; j < 10; j++) {
				Thread thread = new Thread();
				System.out.println(thread.getName());
				thread.start();
			}
			
		//5. 스레스 수 출력하기
			System.out.println("동작하는 스레스 수 : " + Thread.activeCount());

	}

}
