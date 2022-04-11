package book.chapter18.Ex02;

// ���ٽ� ����
// �Ʒ� 4���� �������̽��� ���ٽ����� ó�� ���� : �Լ��� �������̽�(�߻� �޼��尡 1���� �������̽�)
// ���ٽ� ���� -> �Լ��� �������̽�(�߻� �޼��尡 2���� �������̽�)�� ������ �� ����ؼ� ����� �� �ִ� ����

@FunctionalInterface // �Լ��� �������̽���� ����(�߻� �޼��� 1���� �� �� ����)
interface A{   // �Է� �Ű�����X , ����Ÿ��X
	void method1();
}

@FunctionalInterface // �Լ��� �������̽���� ����(�߻� �޼��� 1���� �� �� ����)
interface B{ 	// �Է� �Ű����� O, ����Ÿ��X
	void method2(int a) ;
}

@FunctionalInterface  // �Լ��� �������̽���� ����(�߻�޼��� 1���� �� �� ����)
interface C{  // �Է� �Ű����� X, ����Ÿ��O
	int method3();
}

@FunctionalInterface  // �Լ��� �������̽���� ���� (�߻� �޼��� 1���� �� �� ����)
interface D{      // �Է¸Ű�����O, ����Ÿ�� O
	double method4 (int a, int b);  // 
}
public class FuctionToLamdaExpression {

	public static void main(String[] args) {
		// �������̽��� �Լ� ���� ---> ���ٽ�
		// 1. AŬ���� ���� (�Է¸Ű����� X, ����Ÿ��X)
			// (1) �͸� �̳�Ŭ����
		A a1 = new A() {

			@Override
			public void method1() {
				System.out.println("�޼���1-1 : �͸� �̳�Ŭ����");
			}
		};
		a1.method1();
		
			// (2) ���ٽ�
				// ���ٽ��� ����Ÿ��, �޼������ ���ŵ�
		A a2 = () -> {System.out.println("�޼���1-2 : ���ٽ�");}; // ���ڽ� ������ ���� ��ü ����
		A a3 = () -> System.out.println("�޼��� 1-3 : ���ٽ�"); // �����ο� �Ѷ���(;�� �Ѱ�) ���� �� �߰�ȣ ���� ����
		a2.method1();
		a3.method1();
		
		// 2. BŬ���� ���� (�Է� �Ű�����O, ����Ÿ��X)
			// (1) �͸� �̳�Ŭ����
		B b1 = new B() {

			@Override
			public void method2(int a) {
				System.out.println("�޼��� 2-1 - �͸� �̳�Ŭ���� : " + a);
			}
		};
		
			// (2) ���ٽ�
		B b2 = (int a) -> {System.out.println("�޼���2-2 - ���ٽ� : " + a );}; // ��ü����
		B b3 = ( a) -> {System.out.println("�޼���2-3 - ���ٽ� : " + a );}; // ��౸�� -> inputŸ�� ��������(B�������̽��� ��� ���� �صױ� ����)
		B b4 = ( a) -> System.out.println("�޼���2-4 - ���ٽ� : " + a );  // �߰������� -> ���๮�� �Ѷ��� (;�� �ϳ��� ��) �߰�ȣ ���� ����
		B b5 = ( a) -> System.out.println("�޼���2-5 - ���ٽ� : " + a ); //��౸�� -> �Է� �Ű������� �ϳ��� �� �Ұ�ȣ ���� ����
		
		b2.method2(1);
		b2.method2(2);
		b3.method2(3);
		b4.method2(4);
		b5.method2(5);
		
		// 3. CŬ���� ����(�Է¸Ű�����X,����Ÿ�� O)
			// (1) �͸� �̳�Ŭ����
		C c1 = new C() {
			@Override
			public int method3() {
				// TODO Auto-generated method stub
				return 4;
			}
		};
		System.out.println(c1.method3());
		
			// (2) ���ٽ�
		C c2 = () -> {return 5;}; // ��ü ����
		C c3 = () -> 8;  // ��౸�� -> return�� �Ѷ������� ����� ��� : return��������  !!!�ݵ�� �߰�ȣ�� �Բ� �����ؾ� ��!!!
		System.out.println("�������� ���� : " + c2.method3());
		System.out.println("�������� ���� : " + c3.method3());
		
		// 4. DŬ���� ����(�Է¸Ű����� O, ����Ÿ��)
			// (1) �͸� �̳�Ŭ����
		D d1 = new D() {

			@Override
			public double method4(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}
		};
		System.out.println("�μ��� ���� : " + d1.method4(8, 10));
		
			// (2) ���ٽ�
		D d2 = (int a, int b) -> {return a+b;}; // ��ü����
		D d3 = (a,b) -> {return a+b;};  // ��౸�� -> inputŸ�� ��������(D�������̽��� ���ǵǾ��ֱ� ������)
		D d4 = (a,b) ->  a+b;   // ��౸�� -> return�� �� ����(;�Ѱ�)���� �����Ǿ� ������ return�������� !!!�߰�ȣ�� �Բ� �����ϱ�!!!
		System.out.println("�μ��� ���� : " + d1.method4(810, 10));
		
	}

}

