package book.chapter13.Ex03;
// static �̳� Ŭ���� : �ܺ� Ŭ������ �ν��Ͻ� �ʵ�, �ν��Ͻ� �޼���� ������ �Ұ�
	// �ܺ� Ŭ������ static �ʵ峪 static �޼���� ���� ����

class A{
	int a= 3; 	//�ν��Ͻ� �ʵ�(��üȭ �ؾ� ��밡��)
	static int b = 4;	//���� �ʵ�(��ü �������� Ŭ���� �̸����� ���� ����)
	void method1() { // �ν��Ͻ� �޼���, ��ü ���� �� ���� ����
		System.out.println("�ν��Ͻ� �޼���");
	}
	static void method2() { //static�޼���, ��ü �������� �ʰ� ����
		System.out.println("static�޼���");
	}
	
	static class B{
		void bcd() {
			//�ܺ� Ŭ������ ���� �ʵ�� ���� �޼��常 ���� ����
			System.out.println(b); 	//static �ʵ�
			method2();	//static �޼���
		}
	}
}
public class StaticInnerClass {

	public static void main(String[] args) {
		// 1. static �̳�Ŭ���� ��ü ����
		A.B b = new A.B(); //static �̳� Ŭ������ �ܺ� ��ü �������� ��ü ����
		b.bcd();
		System.out.println();
		A.method2(); //static�޼��� ȣ��(��ü �������� Ŭ������ ����ؼ� ȣ�Ⱑ��)
		System.out.println(A.b); //static�ʵ�

	}

}
