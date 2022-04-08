package book.chapter15.Ex15;
// Thread.yield() : �������� �������(Runnable)�� �ִ� Ư�� �����忡�� �ڽ��� ������� �Ͻ� �纸
	// ������� ���ο��� �ٸ� �����带 ���� �����ϵ��� �纸
	// ����ȭ���� key�� ���� �����ϴ� ������ �߻��Ǵµ�... Ű�� �纸�ؼ� �յ��ϰ� ó���ϵ��� �� �� ���

class MyThread extends Thread{
	boolean yieldFlag;
	public void run() {
		while (true) {	//���ѷ���
			if (yieldFlag == true) {	// yieldFlag�� true�϶� 
				Thread.yield();	//�����带 �纸����
			}else {
				System.out.println(getName() + "����");
				for (int i = 0; i < 1000000000L; i++) {}
				//0.5�� �ð� ����
			}
		}
	};
}

public class YieldInRunnableState {
	public static void main(String[] args) {
		//��ü ����
		MyThread thread1 = new MyThread();
		thread1.setName("thread1"); // ������ �̸� ����
		thread1.yieldFlag = false;	// yieldFlag���� false�� �ʱ�ȭ
		thread1.setDaemon(true); 	// ������ �����尡 ����� �� ����, while���� ������ ���������� ���ؼ�
		thread1.start();
		
		MyThread thread2 = new MyThread();
		thread2.setName("thread2");
		thread2.yieldFlag = true;
		thread2.setDaemon(true);
		thread2.start();
		
		//������ 6�� ����(1�ʸ��� �ѹ��� �纸)
		for (int i = 0; i < 6; i++) {
			try {Thread.sleep(1000);}catch(InterruptedException e) {}
			thread1.yieldFlag =! thread1.yieldFlag;
			// ���϶� ����, ������ �� �� ����, true�϶� �纸���ִϱ� ������ ��
			thread2.yieldFlag =! thread2.yieldFlag;
			
		}
		
		System.out.println(thread1.getState());
	}

}
