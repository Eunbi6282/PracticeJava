package book.chapter12;
interface Apple{
	int a = 3;		//public static final ����
	void abc();		//public abstract ����(�߻�޼���)
}

class Banana implements Apple{
	public void abc() {
		System.out.println("���1 : �ڽ� Ŭ���� �����ڷ� ��ü ����");
	}
}

public class CreateObjectOfInterface {
	public static void main(String[] args) {
		System.out.println("====�ڽ�Ŭ���� �̿�(�������̽��� Ÿ�����θ� ����)");
		// ��ü ���� / interface�� abstract Ŭ������ ��ü�� ���� ������ �� ������ Ÿ�Լ����� ����
		Apple a = new Banana();
		Apple a2 = new Banana();
		
		//�޼��� ȣ��
		a.abc();
		a2.abc();
		
		System.out.println("======�̳� Ŭ���� ���(������ü ���𰡴�)=====");
		Apple apple = new Apple() {
			
			@Override
			public void abc() {
				System.out.println("���2 : �͸� �̳� Ŭ������ �̿��� ��ü ����");
			}
		};
		Apple apple2 = new Apple() {
			public void abc() {
				System.out.println("���2 : �͸� �̳� Ŭ������ �̿��� ��ü ����");
			}
		};
		
		// �޼��� ȣ��
		apple.abc();
		apple2.abc(); 
	}

}
