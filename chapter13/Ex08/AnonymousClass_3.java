package book.chapter13.Ex08;

// Ŭ���� ���� �� ���� ������ ��� , ���� ������ ������� ���� ��� �Ű������� ��ü ����
interface A{
	public abstract void abc();
}
class C{		
	void cde(A a) {		//AŸ���� ��ü�� �Ű������� �޴� �޼��� cde()
		a.abc();			// -> �Է� �Ű� ������ ���� �������̽��� ��ü �����ʿ�(�ڽ�Ŭ������ �͸� �̳�Ŭ���� �ʿ�)
	}
}

// 1. �ڽ� Ŭ���� ���� ����
class B implements A{

	@Override
	public void abc() {
		System.out.println("�Ű����� ����");
		
	}
}

public class AnonymousClass_3 {

	public static void main(String[] args) {
		//��� 1 : Ŭ������O + ���������� O
		C c = new C();  // C���� �޼��� ����Ϸ��� CŸ�԰�ü ���� �ʿ�
		A ab = new B(); // Ŭ������(A), ��������(a) -> �� �� ����
		c.cde(ab); 	// �Ű������� ��ü a�� �����ؼ� ������
		
		//��� 2 : Ŭ������O + ���������� X
		C c2 = new C();
		c2.cde(new B()); //��ü�� �ٷ� �������� ������ ������
			//��ü B�� ��������鼭 �ڵ����� ��ĳ����
	}

}
