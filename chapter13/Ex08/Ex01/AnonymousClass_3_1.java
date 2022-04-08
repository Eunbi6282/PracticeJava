package book.chapter13.Ex08.Ex01;

//3. �޼����� �Ű������� ����
	// 3-1 : ��ü ���� �� �Ű������� ���� (Ŭ������ O, �������� O)
	// 3-2 : ��ü ���� �� �Ű������� ���� (Ŭ������ O , �������� X)

interface A{
	public abstract void cry();
	public abstract void fly();
}

class C {
	void abc(A a) {		//�����ڽ� Ŭ������ �Ű������� ���� ��� AŸ������ �ڵ� ��ĳ������ �ȴ�. 
		a.cry();
		a.fly();
	}
}

// A�� ��ü�� �����ϱ� ���� �ڽ�Ŭ���� ����
class B implements A{

	@Override
	public void cry() {
		System.out.println("�۸�");
	}

	@Override
	public void fly() {
		System.out.println("����");
		
	}
	
}
public class AnonymousClass_3_1 {

	public static void main(String[] args) {
		// 1. Ŭ������ O , �������� O
		C c = new C();
		A ab = new B();
		c.abc(ab); // AŸ���� ��ü�� �Ű�������
		
		//2. Ŭ������ O , �������� X
		C c2 = new C();
		c2.abc(new B()); //��ü B�� ����� ���鼭 AŸ������ �ڵ� ��ĳ���� -> AŸ�� ��ü�� �Ű������� ��

	}

}
