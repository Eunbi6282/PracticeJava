package book.chapter18.Ex04;
	// ���ٽ��� Ȱ��
		// 1. �͸� �̳�Ŭ������ Ȱ���ϴ� ���
		// 2. �޼��� ���� (1. �ν��Ͻ� �޼��� ����, 2. ���� �޼��� ����)
			// �޼��� ���� : �����Ǿ� �ִ� �޼��带 ����
			// �޼��带 �����ϱ� ���ؼ��� return Ÿ�԰� �Ű������� �����ؾ� �Ѵ�. 

interface A{
	void abc();
}

class B{
	void bcd() {   // �ν��Ͻ� �޼��� : ��üȭ�ؾ� ȣ���� ����
		System.out.println("�޼���");
	}
}

// ���ٽ��� Ȱ�� -> AŬ������ abc�޼��带 ȣ���ϸ� BŬ������ bcd�� �����ؼ� ����.
public class RefOfInstanceMethod_Type_1 {
	public static void main(String[] args) {
		// 1. �ν��Ͻ� �޼��� ���� Type1
		A a1 = new A() {
			@Override
			public void abc() {
				B b = new B();
			}
		};

	}

}
