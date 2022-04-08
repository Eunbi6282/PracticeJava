package book.chapter13.Ex10.Ex01;

class A{
	B b; 	// B: �������̽�Ÿ��, b : �������� <���� �Ҵ��ϴ� ���>
				// b�� �ʱⰪ : null
					/*  <������ ���� �Ҵ��ϴ� ���>
					 *  1. ��ü ���� �� ���� �Ҵ�
					 *  2. �����ڸ� ���ؼ� ���� �Ҵ�
					 *  3. setter�� ���ؼ� ���� �Ҵ�
					 */
	A (){}
	A (B b){	//BŸ���κ���b�� �޾� Ȱ��ȭ��Ŵ
		this.b = b;
	}
	
	interface B{ 	
		void play(); 	//public abstract
		void stop();
	}
	//setter ���ؼ� ���� �Ҵ�
	public void setB (B b) {
		this.b = b;
	}
		
	void abc() {
		b.play();
		b.stop();
		
	}

}
public class InnerInterface1_1 {

	public static void main(String[] args) {
		A a = new A(); 	//�⺻ ������ �ʿ�
		// setter���ؼ� ���� �Ҵ�
		a.setB(new A.B(){ 	// Ŭ������, ��������X(�͸� �̳�Ŭ���� ���)

			@Override
			public void play() {
				System.out.println("�����մϴ�");
			}

			@Override
			public void stop() {
				System.out.println("�����մϴ�.");
			}
		});
		a.abc();
		System.out.println("=========");
		
		// 1. ��ü ���� �� �ʵ��� ���� �Ҵ�
		A a2 = new A();
		//Ŭ���� A�� b �ʵ� ���� A.B��ü�� ������ �� �Ҵ�
		a2.b = (A.B) new A.B(){		//Ŭ���� A��ü ����B �������̽�

			@Override
			public void play() {
				System.out.println("play");
			}

			@Override
			public void stop() {
				System.out.println("stop");
				
			}		
		};
		
		// 2. �����ڸ� �̿��ؼ� ���� �Ҵ�
		A a3 = new A(		// A()�ȿ� BŸ���� �޴� ���� �Ҵ�
				new A.B() {
					
					@Override
					public void stop() {
						System.out.println("����");
					}
					
					@Override
					public void play() {
						System.out.println("����");
					}
				}
				); 	
		a3.abc();
	}

}
