package book;
class A{}
class B extends A{}
class C extends B{}
class D extends B{}


public class P_322 {

	public static void main(String[] args) {
		// ��ĳ����(�ڵ����� ��ȯ)
		A ac = new C();		// C�� A��.
		A ab = new B();		// B�� Aek.
		A ad = new D();	// D�� A��.
		B bd = new D(); // D�� B��.
		C c = new C();
			
		//��ü ������ �� ���� ���
//		C c2 = new B();
//		B b = new A();	//BŸ���� �ǵ� A���� BŸ���� ����� ������ �� ����
//		D d = new B();
		
		//�ٿ�ĳ���� : �θ𿡼� �ڽĵ����� Ÿ������ ��ȯ(������ȯ)
		A aaA = new A();
		// B bbB = new aaA;  //�ٿ�ĳ���� �Ұ�
		
		//�ٿ�ĳ���� ����
		A ac3 = new C();
		//B ac4 = new ac3;
		
	}

}
