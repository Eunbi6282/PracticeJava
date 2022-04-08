package book.chapter15.Ex11;
/*
 ! ���� �����尡 ������ �ʵ忡 ������ �� ���ü��� ������ �߻� -> ����ȭ�� ���ü� ������ �ذ�.
 ����ȭ : ���� �����尡 ������ �ʵ带 ������ �� �ϳ��� �����尡 �ϼ��Ǹ� �ٸ� �����忡�� ������ ����
 �ϳ��� �����尡 ������ ��� ;ock�� �ɰ� �۾��� �Ϸ�Ǹ� �ٸ� �����尡 ������ �� �ֵ��� lock�h
 	- ��� ����ȭ�� �޼���� this ��� Ű�� ����
 	- ���� �޼��尡 ����ȭ�� �޼����� ��� : �ϳ��� �����常 ���� ����
 	
 	Ŭ���� ���ο� �������� ����ȭ �޼��尡 ������ ��� : �����尡 �����ϴ� Ű�� ��� this��.
 	�������� ����ȭ�޼��� ������ ��Ƽ �����带 ó���ϰ��� �� ��� : ����ȭ ����� ������ ų�� �ٸ��� ����
 */
class A{}
// ������ü : ���� �����尡 ���� ��ü�� ����
class MyData{
	
	synchronized void abc() {
		for (int i = 0; i < 3; i++) {
			System.out.println(i + "sec");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}		//1�� ������
		}
	}
	
	// ����ȭ ��
//	void bcd() {
//		synchronized (this) {	// this�� abc()�� ���� Ű�� ���� ó��x
//			for (int i = 0; i < 3; i++) {
//				System.out.println(i + "��");
//				try {Thread.sleep(1000);} catch (InterruptedException e) {}		//1�� ������
//			}
//		}
//	}
	void bcd() {
		synchronized (new Object()) {	// this�� abc()�� ���� Ű�� ���� ó��x
			for (int i = 0; i < 3; i++) {
				System.out.println(i + "��");
				try {Thread.sleep(1000);} catch (InterruptedException e) {}		//1�� ������
			}
		}
	}
	
	void cde() {
		synchronized (new A()) {	 
			for (int i = 0; i < 3; i++) {
				System.out.println(i + "��°");
				try {Thread.sleep(1000);} catch (InterruptedException e) {}		//1�� ������
			}
		}
	}
	
	

}
public class KeyObjet_3 {

	public static void main(String[] args) {
		MyData myData = new MyData();
		
		// Thread���� -> 1. thread��� 2. thread run()�������̵�
		new Thread() {
			@Override
			public void run() {
				myData.abc(); //ù��° ������ -> abc�޼��� ȣ��
			}
		}.start();
		
		new Thread() {
			@Override
			public void run() {
				myData.bcd(); //�ι��� ������ -> bcd�޼��� ȣ��
			}
		}.start();
		
		new Thread() {
			@Override
			public void run() {
				myData.cde(); //����° ������ -> cde�޼��� ȣ��
			}
		}.start();
	}

}
