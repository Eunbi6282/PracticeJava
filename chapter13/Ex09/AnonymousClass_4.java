package book.chapter13.Ex09;

// �Ű������� �޾Ƽ� ó�� : �������̽��� ������ Ŭ������ ����
// 4. �ڽ� Ŭ������ �������� �ʴ´�.

interface A{
	void abc();
}

class C{
	void cde(A a) {
		a.abc();	//aŸ���� abc()ȣ��
	}
}
public class AnonymousClass_4 {

	public static void main(String[] args) {
		C c = new C();
		// 3. Ŭ����(�������̽��� ������ Ŭ����)x , �������� ���� O
		A a = new A() {	//�������̽��� ������ �ڽ� �͸� ��ü ���� �� Ÿ���� A�� ������ �������� ����
			@Override
			public void abc() {
				System.out.println("Ŭ����X ,��������O");
			}	 	
		};
		c.cde(a);
	
		// 4. Ŭ����(�������̽��� ������ Ŭ����)X , ������������X <- ���� ���� ���(�ӽ÷� �ѹ��� ����� ��
		c.cde(new A() {
			@Override
			public void abc() {
				System.out.println("Ŭ����X, ��������X");
			}
			
		});
	}
}
