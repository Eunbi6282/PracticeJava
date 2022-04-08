package book.chapter15.Ex06;

public class ThreadProperties_1 {

	public static void main(String[] args) {
		// 1. ��ü ��������(currentThread())
			// Thread�� ����(activeCount())
		
			// static currentThread() < - static Ű�� ��ü���� ����(Ÿ��)������ �ٷ� �޼��� �ҷ��� �� ����.
		Thread curThread = Thread.currentThread();
		// Ŭ������.�޼����;
		
		//getName()�� �ν��Ͻ�ȭ �ؼ� �����;� ��
		System.out.println("���� �������� �̸� : " + curThread.getName());
		System.out.println("�����ϴ� ������ �� : " + Thread.activeCount()); //���θ޼��� �Ѱ�
		System.out.println("===============");
		
		// 2. ������ �̸� ���(�ڵ����) - JVM�� �̸��� �ڵ����� �Ҵ�
			//(1) 10�� �����غ���
		for (int i = 0; i < 10; i++) {	//������ 10���� �ڵ����� �������
			Thread thread = new Thread();
			System.out.println(thread.getName());	//������ �̸� ���
			thread.start();
		}
		
		// 3. ������ �̸� ���� ���� : ��ü��.setName();
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread();
			thread.setName(i + "��° ������");
			System.out.println(thread.getName());
			thread.start();
		}
			
		// 4. ������ �̸� �ڵ� ����(�ڵ� ���) - JVM�� �̸��פ� �ڵ����� �Ҵ�/�չ�ȣ���� �̾ ��ȣ�� �Ҵ� ��
			for (int j = 0; j < 10; j++) {
				Thread thread = new Thread();
				System.out.println(thread.getName());
				thread.start();
			}
			
		//5. ������ �� ����ϱ�
			System.out.println("�����ϴ� ������ �� : " + Thread.activeCount());

	}

}
