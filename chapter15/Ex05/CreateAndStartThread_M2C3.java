package book.chapter15.Ex05;
// ��ü �������� �͸�ü�� ����ؼ� ������ ����!!���� ���� ���!!
	// Ŭ����x , ��ü ����x
public class CreateAndStartThread_M2C3 {

	public static void main(String[] args) {
		//ThreadŸ������ Runnable�������̽��� ���� -> Runnable()�� start()�� ���� ������
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				String[] strArrary = {"�ϳ�","��","��","��","�ټ�"};
			}
		});
	}
}