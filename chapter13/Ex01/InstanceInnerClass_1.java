package book.chapter13.Ex01;

class A{
	public int a = 3;
	protected int b = 4;
	int c = 5;
	private int d = 6;
	void abc() {
		System.out.println("AŬ���� �޼ҵ� abc()");
	}
	// �̳� Ŭ���� : �ƿ��� Ŭ������ ���� �����ڿ� ������� ���� ����
	
	class B{	// �ν��Ͻ� ���� Ŭ���� : �ܺ� Ŭ������ ��üȭ �Ǿ�� ��� ����
		void bcd() {
			System.out.println(a); 	// �ƿ��� Ŭ������ �ʵ� ���� ���� ����
			System.out.println(b);	//this.b
			System.out.println(c); 	// this.c
			System.out.println(d);
			abc(); //�ƿ��� Ŭ������ �޼ҵ� ���� ���� ����
		}
	}
}


public class InstanceInnerClass_1 {

	public static void main(String[] args) {
		// 1. �ƿ��� Ŭ���� ��ü ����(1�ܰ�) -�̳� Ŭ���� ����ϱ� ���ؼ� �ܺ� Ŭ���� ���� ��üȭ
		A a = new A();
		
		// 2. �̳� Ŭ���� ��ü ����(2�ܰ�)
		A.B ab = a.new B(); 	// ab : ���� Ŭ���� �ν��Ͻ� ����
		
		// 3. �޼��� , �ʵ� ���
		ab.bcd();

	}

}
