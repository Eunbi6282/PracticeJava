package book.chapter15.Ex11;
/*
 ! 여러 쓰레드가 공유된 필드에 접근할 대 동시성의 문제가 발생 -> 동기화는 동시성 문제를 해결.
 동기화 : 여러 쓰레드가 공유된 필드를 접근할 때 하나의 쓰레드가 완성되면 다른 쓰레드에서 접근이 가능
 하나의 쓰레드가 사용둥인 경우 ;ock을 걸고 작업이 완료되면 다른 쓰레드가 접근할 수 있도록 lock헺
 	- 모든 동기화된 메서드는 this 라는 키만 가짐
 	- 여러 메서드가 동기화된 메서드일 경우 : 하나의 쓰레드만 접근 가능
 	
 	클래스 내부에 여러개의 동기화 메서드가 돈대할 경우 : 쓰레드가 접근하는 키가 모두 this다.
 	여러개의 동기화메서드 내에서 컬티 쓰레드를 처리하고자 할 경우 : 동기화 블락을 생성후 킬르 다르게 설정
 */
class A{}
// 공유객체 : 여러 쓰레드가 공유 객체에 접근
class MyData{
	
	synchronized void abc() {
		for (int i = 0; i < 3; i++) {
			System.out.println(i + "sec");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}		//1초 딜레이
		}
	}
	
	// 동기화 블럭
//	void bcd() {
//		synchronized (this) {	// this면 abc()와 같은 키라서 동시 처리x
//			for (int i = 0; i < 3; i++) {
//				System.out.println(i + "초");
//				try {Thread.sleep(1000);} catch (InterruptedException e) {}		//1초 딜레이
//			}
//		}
//	}
	void bcd() {
		synchronized (new Object()) {	// this면 abc()와 같은 키라서 동시 처리x
			for (int i = 0; i < 3; i++) {
				System.out.println(i + "초");
				try {Thread.sleep(1000);} catch (InterruptedException e) {}		//1초 딜레이
			}
		}
	}
	
	void cde() {
		synchronized (new A()) {	 
			for (int i = 0; i < 3; i++) {
				System.out.println(i + "번째");
				try {Thread.sleep(1000);} catch (InterruptedException e) {}		//1초 딜레이
			}
		}
	}
	
	

}
public class KeyObjet_3 {

	public static void main(String[] args) {
		MyData myData = new MyData();
		
		// Thread생성 -> 1. thread상속 2. thread run()오버라이딩
		new Thread() {
			@Override
			public void run() {
				myData.abc(); //첫번째 쓰레드 -> abc메서드 호출
			}
		}.start();
		
		new Thread() {
			@Override
			public void run() {
				myData.bcd(); //두번쩨 쓰레드 -> bcd메서드 호출
			}
		}.start();
		
		new Thread() {
			@Override
			public void run() {
				myData.cde(); //세번째 쓰레드 -> cde메서드 호출
			}
		}.start();
	}

}
