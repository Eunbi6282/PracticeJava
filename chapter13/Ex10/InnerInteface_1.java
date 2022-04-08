package book.chapter13.Ex10;

//�̳� �������̽� (InnerInterface) : Ŭ���� ������ �������̽��� ����, �ܺ� Ŭ���� �����ϰ� ����� ����
	// Ŭ���� ���ο� ����
	// static�� �ڵ����� �����Ϸ��� ���ؼ� ����

class A{
	static interface B{	//static�� �����Ϸ��� ���ؼ� �ڵ����� �߰���
		void bcd();		//public abstract
	}
}

//�̳� �������̽��� ������ Ŭ���� C
class C implements A.B{	//A.B : AŬ������ �̳� �������̽� B

	@Override
	public void bcd() {
		System.out.println("�̳� �������̽��� ������ Ŭ���� C");
	} 	
	
}
public class InnerInteface_1 {

	public static void main(String[] args) {
		//1. �ڽ� ��ü�� ���� ������ ���(�ڽ� Ŭ������ ������ ���)
		C c = new C();	//�ڽ��� ��ü ���� ���� ȣ��
		A.B ab = new C();	//�θ��� Ÿ������ ��ĳ���� �� �������̵��� ���� ���
		c.bcd();
		ab.bcd();
		
		// 2. �͸� Ŭ������ ��� (�ڽ� Ʋ���� ���� ���)
		A.B b = new A.B() {
			
			@Override
			public void bcd() {
				System.out.println("�͸� �̳�Ŭ������ ��ü ������ ���");
				
			}
		};
		b.bcd();
	}

}
