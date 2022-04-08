package book.chapter15.Ex14;

public class NewRunnableTerminated {

	public static void main(String[] args) {
		// �������� ���¸� �����س��� Ŭ����. �� 6���� ������ ���� ���� ����
		Thread.State state;		//���6�� ���� ����
		
		//  1. ��ü ����(NEW) -- �͸� ���� Ŭ���� ����
			// NEW : ������ ��ü ������ .start()�� ȣ��Ǳ� ������
		Thread myThread = new Thread() {
			@Override
			public void run() {
				for (long i = 0; i < 10000000000L; i++) {}
				// 1�� �����ؼ� 10���
			}
		};
		state = myThread.getState(); // �������� ���¸� ������ �ͼ� state������ ��´�. 
		System.out.println("myThread state : " + state);
		//myThread state : NEW
		
		// 2. myThread����(Runnable)
		myThread.start(); // ThreadŸ������ ��ü ������ start()
		state = myThread.getState(); //myThread state : NEW
		System.out.println("myThread state : " + state);
		//myThread state : RUNNABLE
		
		//3. myThread ������ ����
			//myThread.join(); �� ������{main}�� ����ϰ�, myThread�� ó���϶�
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
