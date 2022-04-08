package book.chapter14.Ex07;
// Exception - Checked Exception : ������ ����, �ݵ�� ����ó��
		//  - unCheckd Exception(Runtime Exception) : ����ÿ� ����

// 1. Exception�� �߻��� �޼��� ���ο��� �ڽ��� �������� ó��
class A{
	void abc() {
		bcd();
	}
	void bcd() {
//		Class cls = Class.forName("java.lang.Object");
//		Thread.sleep(1000); 
		// Class.forName : ���� �� Ŭ���� ������ ������ ���� �ְ� �������� �������� �ֱ� ������ ���� ó���� ���־�� �Ѵ�.!!!
		try {
			Class cls = Class.forName("java.lang.Object");
			Thread.sleep(1000); 
		} catch (ClassNotFoundException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

// 2. throw�� ����ؼ� Exception�� �̷�� ���
class B{
	void abc() {
		try {
			bcd();
		} catch (ClassNotFoundException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void bcd() throws ClassNotFoundException, InterruptedException {
		Class cls = Class.forName("java.lang.Object");
		Thread.sleep(1000);
	}
	
}
public class ThrowsException_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
