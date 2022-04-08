package book.chapter16.Ex07;

// ���ʸ� �޼��� ���ο��� ��� ������ �޼��� : ObjectŬ������ �޼��常 ��� �����ϴ�.
class A{
	public <T> void method(T t) { // ���ʸ� �޼��� -> �Ϲ� Ŭ���� �ȿ��� ����, ����Ÿ�Ծտ�<�Ű����� Ÿ������>
		// System.out.println(t.length()); ���� -> ���ʸ� �޼��� ���ο��� ObjectŬ������ �޼��常 ��� �����ϴ�. 
		// but .length()�� StringŬ������ �޼����̴�.
		System.out.println(t.equals("�ȳ�")); // .equals()�� ObjectŬ������ �޼����̹Ƿ� ����
	}
	
	public <T extends Object> void method2(T t) { // T [extends Object]�� �����Ǿ� �ִ�. 
		System.out.println(t.equals("�ݰ����ϴ�")); //ObjectŬ������ �޼��常 ��� ����
	}
	public <T extends String> void method3(T t) { //String Ÿ������ �����Ǿ� .length()��� ����
		System.out.println(t.length());
	}
}

public class AvailableMethodInGenericMethod {

	public static void main(String[] args) {
		A a = new A();
		a.<String>method("�ȳ�");
		a.<String>method2("�氡");
		a.<String>method3("�ݰ����ϴ�.");

	}

}
