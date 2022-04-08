package book.chapter15.Ex14;

public class NewRunnableTerminated {

	public static void main(String[] args) {
		// 쓰레드의 상태를 저장해놓은 클래스. 총 6개의 쓰레드 상태 저장 가능
		Thread.State state;		//상수6개 저장 가능
		
		//  1. 객체 생성(NEW) -- 익명 내부 클래스 생성
			// NEW : 쓰레드 객체 생성후 .start()가 호출되기 전까지
		Thread myThread = new Thread() {
			@Override
			public void run() {
				for (long i = 0; i < 10000000000L; i++) {}
				// 1씩 증가해서 10억번
			}
		};
		state = myThread.getState(); // 쓰레드의 상태를 가지고 와서 state변수에 담는다. 
		System.out.println("myThread state : " + state);
		//myThread state : NEW
		
		// 2. myThread시작(Runnable)
		myThread.start(); // Thread타입으로 객체 생성후 start()
		state = myThread.getState(); //myThread state : NEW
		System.out.println("myThread state : " + state);
		//myThread state : RUNNABLE
		
		//3. myThread 쓰레드 종료
			//myThread.join(); 내 쓰레드{main}는 대기하고, myThread를 처리하라
		try {
			myThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		state = myThread.getState();
		System.out.println("myThread state : " + state);
		//myThread state : TERMINATED

	}

}
