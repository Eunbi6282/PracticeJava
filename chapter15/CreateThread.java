package book.chapter15;

// 2��° ������
class SMFileThread extends Thread{
	@Override
	public void run() {
		String[] strArray = {"�ϳ�", "��","��","��","�ټ�"};
		// �������� �ణ ������ �ֱ� (���� ������ ���� ��� �� �ڸ���ȣ�� �ణ �ڿ� �������� ������ ��Ŵ)
		try {
			Thread.sleep(100);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for (int i = 0; i < strArray.length; i++) {
			System.out.println("-�ڸ���ȣ " + strArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
				
	}
}

//3��° ������
class VideoFileThread extends Thread{
	@Override
	public void run() {
		int[] intArray =  {1,2,3,4,5
	};
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.print("(���� ������) " + intArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
		}
	}
}
public class CreateThread {

	public static void main(String[] args) {
		// 1��° ������ : 
		SMFileThread  smFileThread = new SMFileThread();
		smFileThread.start();;
		
		VideoFileThread videoFileThread = new VideoFileThread();
		videoFileThread.start();
		

	}

}
