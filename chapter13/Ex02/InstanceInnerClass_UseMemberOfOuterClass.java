package book.chapter13.Ex02;
// �̳� Ŭ�������� �ܺ� Ŭ������ �ʵ�� �޼��� ���� ���

import book.chapter13.Ex02.A.B;

/* �������̵� : 1. �θ�� �ڽ��� ��Ӱ��谡 �־�� �Ѵ�.
 * 			2. �ν��Ͻ� �޼��� �������̵�
 * 			3. �ν��Ͻ� �ʵ�, static�ʵ�, static�޼���� �������̵� �Ұ�
 */

class A{
	int a=3;
	int b = 4;
	int c = 33;
	int d =44;
	void abcd() {	//���� ���̵��� �ƴ�. �ܺ� ���� Ŭ������ ������ �޼���� ������ ������ ��ġ
		System.out.println("AŬ������ �޼��� abcd()");	
	}
	
	class B{ 	// �̳�Ŭ�������� �ܺ� Ŭ������ �ߺ��� �ʵ峪 �޼��带 ȣ���ϴ� ���
		int a = 5;
		int b = 66;
		
		void abcd() {	//�������̵��� �ƴ� ������ �޼���(�������̵��� �Ƿ��� �� Ŭ������ ��Ӱ��迡 �־�� ��)
			System.out.println("BŬ������ abcd()");
			
		}
		void bcd() {
			//1. �ڱ� �ڽ��� �ʵ�� �޼��� ȣ��(BŬ����)
			System.out.println(a); //this.a 5
			System.out.println(b); // this.b  66
			abcd(); //this.abcd
			
			//2. �ƿ���Ŭ������ �ʵ�� �޼��� ȣ��
			System.out.println(A.this.a); //3
			System.out.println(A.this.b); //4
			A.this.abcd(); //�ƿ���Ŭ����(AŬ������ �޼���ȣ��)
			
			//3. �ƿ���Ŭ������ �ʵ�� �޼��� ȣ��
			System.out.println(c); 	// ��״� �ߺ��� �ʵ� �̸�, �޼��� ����
			System.out.println(d);
			
		}
		
	}
}
public class InstanceInnerClass_UseMemberOfOuterClass {

	public static void main(String[] args) {
		//1. ��ü ����
		A a = new A();	// �ƿ��� Ŭ������ ��ü ���� ����
		
		A.B ab = a.new B(); //BŬ���� A.BŸ��
		ab.abcd();
		a.abcd();
		System.out.println("============");
		
		//3. ���� Ŭ������ �ʵ�� �޼��� ȣ��
		System.out.println(ab.a);
		System.out.println(ab.b);
		ab.bcd();
		

	}

}
