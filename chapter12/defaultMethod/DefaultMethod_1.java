package book.chapter12.defaultMethod;
interface A{
	void abc();		//public abstract ���� -> �̿ϼ��� �޼ҵ�
	
	default void bcd() {
		System.out.println("A�������̽��� bcd()");
	}
}

class B implements A{
	@Override
	public void abc() {
		System.out.println("BŬ������ abc()");
	}
}

class C implements A{
	@Override
	public void abc() {			//�߻�޼��� �������̵��ؼ� �Ϻ��� �޼���� ����
		System.out.println("CŬ������ abc()");
	}
	
	@Override
	public void bcd() {			// default�޼��� �������̵�
		System.out.println("CƲ������ bcd()");
	}
}

public class DefaultMethod_1 {
	public static void main(String[] args) {
		//��ü ����
		A a1 = new B();
		A a2 = new C();
		
		//�޼��� ȣ��
		a1.abc();
		a2.abc();
		
		a1.bcd();		//BŬ������ default �޼��� �������̵� ���� �ʾ���
		a2.bcd();		//CŬ������ default �޼��� �������̵� ��
	}	
}
