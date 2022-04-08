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
		
		// 3. 
	}

}
