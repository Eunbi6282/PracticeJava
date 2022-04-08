package book.chapter16.Ex09;

//���ʸ� �޼��� ���� ����:
class A{  		//�Ϲ� Ŭ���� ���� ���ʸ� �޼���
	
	//Number : Boolean, Chracter�� ������ 6���� Ÿ��(Byte, Integer, Long, Float, Double)
	public<T extends Number> void method1(T t) {
		System.out.println(t.intValue()); 	// NumberŸ���� �޼���(t�� ������ �������� ����ض�)
	}
}

interface MyInterface{
	void print();
}

class B{  	// ���ʸ� Ÿ�� ���ο��� �������̽��� ������ ���� extendsŰ�� ����Ѵ�.
	public <T extends MyInterface> void method2(T t) {
		//T�� �� �� �ִ� Ÿ�� => !!!!MyInterFace�� ������ Ŭ������ �� �� �ִ�.!!!!!!!!
		t.print();
	}
}

class C implements MyInterface{ // �������̽��� ������ Ŭ���� 

	@Override
	public void print() {
		System.out.println("�������̽��� ������ Ŭ���� - ���");
	}
}

class D{
	public <T extends String> void abc(T t) {
		// T�� String���� ���� �� �ִ�.
		System.out.println(t); //String�� toString()�� ������ �Ǿ�����. ���� toString()���� ���ص� ��
		// ��ü�� �� toString()�� ����Ǿ� �� ���
		System.out.println(t.toString()); // = System.out.println(t);
	}
}
public class BoundedTypeOfGenericMethod {
	public static void main(String[] args) {
		A a= new A(); //�Ϲ�Ŭ���� ��ü ���� �� ���ʸ� �޼��� ȣ��( ���ʸ� �޼���� �Ϲ� Ŭ���� �ȿ� �ֱ� ������)
		// A�� ���ʸ� �޼���� Number�� extends�ϰ� �ֱ� ������ �� ���� 6�� �� Ÿ�Ը� �� �� �ִ�. 
		a.<Double>method1(3.4);
		a.method1(22.5); // �Ű������� ������ ���� Ÿ���� �ĺ��� �� �ִ� ��� ���� ����
		a.<Long>method1(100000L);
//		a.<String>method1("�ȳ�");
//		a.<Boolean>method1(true); => ���� : Boolean, Character�� NumberŸ�Կ� ���� ���� �ʴ�. 
		
		B b = new B(); // �Ϲ� Ŭ���� ��ü ���� �� ���ʸ� �޼��� ȣ��
		// b.<MyInterface>method2(); // method2�� �Ű������� �� �� �ִ� ���� �������̽� Ÿ��, 
			// but ��üȭ�� ����Ű�Ƿ� �������̽��� ������ �ڽ�Ŭ���� ��� -> �͸��� Ŭ���� ���
		
		//���1. �������̽��� ������ ���� �͸� Ŭ���� ��� => ���� ���� ���
		b.<MyInterface> method2(new MyInterface() {
			
			@Override
			public void print() {
				System.out.println("print()�޼��� ����");
			}
		});
		
		//���2. �ڽ� Ŭ���� C���� ���
		b.<MyInterface> method2(new C()); // �Ű������� �������̽��� ������ �ڽİ�ü ����
		
		System.out.println("===================");
		
		//�͸� Ŭ������ ���ʸ� �޼��� ȣ�� �� �Ű������� �����ֱ� => ���� ���� ���
		b.<MyInterface> method2(new MyInterface() {
			
			@Override
			public void print() {
				System.out.println("�͸����� ó���� Ŭ���� - ���");
			}
		});
		
		D d = new D();
		d.<String>abc("�ȳ�");
		d.<String>abc("�ϼ���");
		
	}

}
