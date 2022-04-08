package book.chapter15.Ex15;
// Thread.yield() : 쓰레드의 실행상태(Runnable)에 있는 특정 쓰레드에게 자신의 쓰레드는 일시 양보
	// 실행상태 내부에서 다른 쓰레드를 먼저 실행하도록 양보
	// 동기화에서 key를 서로 점유하는 현상이 발생되는데... 키를 양보해서 균등하게 처리하도록 할 때 사용

class MyThread extends Thread{
	boolean yieldFlag;
	public void run() {
		while (true) {	//무한루프
			if (yieldFlag == true) {	// yieldFlag가 true일때 
				Thread.yield();	//쓰레드를 양보해줌
			}else {
				System.out.println(getName() + "실행");
				for (int i = 0; i < 1000000000L; i++) {}
				//0.5초 시간 지연
			}
		}
	};
}

public class YieldInRunnableState {
	public static void main(String[] args) {
		//객체 생성
		MyThread thread1 = new MyThread();
		thread1.setName("thread1"); // 쓰레드 이름 생성
		thread1.yieldFlag = false;	// yieldFlag값을 false로 초기화
		thread1.setDaemon(true); 	// 마지막 쓰레드가 종료될 때 종료, while무한 루프를 빠져나오기 위해서
		thread1.start();
		
		MyThread thread2 = new MyThread();
		thread2.setName("thread2");
		thread2.yieldFlag = true;
		thread2.setDaemon(true);
		thread2.start();
		
		//쓰레드 6초 지연(1초마다 한번씩 양보)
		for (int i = 0; i < 6; i++) {
			try {Thread.sleep(1000);}catch(InterruptedException e) {}
			thread1.yieldFlag =! thread1.yieldFlag;
			// 참일때 거짓, 거짓일 때 참 저장, true일땐 양보해주니까 딜레이 줌
			thread2.yieldFlag =! thread2.yieldFlag;
			
		}
		
		System.out.println(thread1.getState());
	}

}
