package book.chapter16.Ex02;
	/*
	 Object : ��� ��ü�� ������ �� ������, �ٿ�ĳ������ �ʿ��ϰ� ĳ���� �� ���ܰ� �߻��� �� �ִ�.(���� Ÿ�� üũ)
	 ���ʸ� Ŭ���� : �ϳ��� Ŭ�������� �پ��� ������ Ÿ���� ó���� �� �ִ�.
	 	���ʸ� Ÿ�� ���� : T(Type), K (Key), V (Value), N(Number), E (Element- �̾��)
	 		// A-Z���� ���Ƿ� ���� �� �ִ�.
	 		// Wrapper Ŭ���� : �⺻ Ÿ���� ��üȭ ���ѳ��� Ŭ����
	 		int -> Integer , boolean -> Boolean, char -> Char, double ->Double, float -> Float
	 		byte -> Byte , short -> Short , long -> Long
	 */
class MyClass<T>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

public class SingleGenericArgunment {
	public static void main(String[] args) {
		// 1. ���ʸ� Ŭ���� ��ü ����<String>�� �Է�
		MyClass<String> mc1 = new MyClass(); 	// WrapperŬ������ �Ҵ��ؾ� �Ѵ�.
		mc1.setT("�ȳ�");
		System.out.println(mc1.getT());
		
		// 2. ���ʸ� Ŭ���� ��ü ���� <Integer>�� �Է�
		MyClass<Integer> mc2 = new MyClass();
		mc2.setT(100);
		System.out.println(mc2.getT());
		
		// 3.���ʸ� Ŭ���� ��ü ���� <Double>�� �Է�
		MyClass<Double> mc3 = new MyClass();
		mc3.setT(33.3333);
		System.out.println(mc3.getT());
		
		// 4. ���� Ÿ�� üũ(������ �ܰ迡�� ������ ���)
		MyClass<Boolean> mc4 = new MyClass();
		mc4.setT(true); 
		// mc4.setT("�ȳ�"); -> ����, Boolean�� true false�� ����, 
			// ���� Ÿ��üũ -> ������ �ܰ迡�� ����ǥ��(������� ������ ���� ������)

	}

}
