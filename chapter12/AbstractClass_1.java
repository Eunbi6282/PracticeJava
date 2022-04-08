package book.chapter12;
class AA{
	/*
	 * �Ϲ� Ŭ���� : ��ü ������ �ʵ�� �޼���� heap�޸� ������ ����
	 * Heap ���� : �ݵ�� �ʱ�ȭ �� ���� ������.
	 * �ʵ� : heap������ �ʵ��� ���� ����
	 * �ν��Ͻ� �޼ҵ� : class������ �ν��Ͻ� �޼��� ������ �޼����� �����ڵ���� ����
	 * 				heap ���� ������ ������ ������. 
	 */
	int a;
	double b;
	char c;
	boolean d;
	byte e;
	float f;
	String gString;
	
	void cry() {}	//������ �޼���
	
	@Override
	public String toString() {
		return a + " , " + b + " , " + c + " , " + d + " , " + e +" , " + gString;
	}
}

/*
 1. �߻� Ŭ������ ��üȭ�ؼ� ����ϴ� ��� 1
 -> ���� ��ü ������ ���(��� ����� ���)
 -> ����� ���ؼ� �ڽ� Ŭ������ ���� ��, �ڽ� Ŭ�������� �߻�޼��带 �������ϰ�, 
 �ڽ� Ŭ������ ��ü�� ������ ���
 
 2. �߻� Ŭ������ ��üȭ�ؼ� ����ϴ� ��� 2
 -> �ӽ÷� �ѹ��� ����� �� �ڽľ��� �ӽ÷� ����� ���
 -> �ڽ� Ŭ���� �������� main�޼��忡�� �͸� ��ü�� �����ؼ� ����ϴ� ���
 -> �̺�Ʈ�� ó���� �� (�ӽ�)
 */

abstract class A{		//�߻� Ŭ���� : �̿ϼ� �޼��带 �����ϹǷ� ��ü ������ �Ұ���
	abstract void abc();
}

class B extends A{
	@Override
	void abc() {
		System.out.println("��� 1 : �ڽ� Ŭ���� ���� �� �߻� Ŭ���� ����");
	}
}
public class AbstractClass_1 {
	public static void main(String[] args) {
		//AAŬ������ �Ϲ� Ŭ�����Ƿ� ��üȭ�� ����
		AA aa = new AA();
		System.out.println(aa);
		
		// A a = new A(); -> �߻�Ŭ������ ��ü ���� �Ұ�
		
		//�߻� Ŭ������ ����ϴ� �ڽ� Ŭ������ �̿��� ��ü ����(��ü�� ������ ������ ��)
		A a1 = new B();
		A a2 = new B();
		A a3 = new B();
		
		a1.abc();
		a2.abc();
		a3.abc();
	}
}
