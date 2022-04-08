package book.chapter15;

// 2번째 쓰레드
class SMFileThread extends Thread{
	@Override
	public void run() {
		String[] strArray = {"하나", "둘","셋","넷","다섯"};
		// 실행전에 약간 딜레이 주기 (비디오 프레임 먼저 출력 후 자막번호가 약간 뒤에 찍히도록 딜레이 시킴)
		try {
			Thread.sleep(100);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for (int i = 0; i < strArray.length; i++) {
			System.out.println("-자막번호 " + strArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
				
	}
}

//3번째 쓰레드
class VideoFileThread extends Thread{
	@Override
	public void run() {
		int[] intArray =  {1,2,3,4,5
	};
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.print("(비디오 프레임) " + intArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
		}
	}
}
public class CreateThread {

	public static void main(String[] args) {
		// 1번째 쓰레드 : 
		SMFileThread  smFileThread = new SMFileThread();
		smFileThread.start();;
		
		VideoFileThread videoFileThread = new VideoFileThread();
		videoFileThread.start();
		

	}

}
