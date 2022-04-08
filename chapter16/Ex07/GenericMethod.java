package book.chapter16.Ex07;

// ���ʸ� Ŭ���� : Ŭ������ ������ �� Ÿ�Ժ����� ����<T> <<����>>, ��ü ������ T�� ������ Ÿ���� ����

// ���ʸ� �޼��� : �Ϲ� Ŭ���� ������ �޼��� ����� ���ʸ� Ÿ�Ժ����� ���

class ssGeneric{ 	//�Ϲ� Ŭ����
	
	//3���� ���ʸ� �޼���
	public <T> T method1 (T t) {
		return t;
	}
	
	public <T> boolean method2 (T t1, T t2) {
		return t1.equals(t2);
		// �ΰ��� �� true, false�� ����
		// �⺻ �ڷ����� ���� ���� ��, ���� �ڷ����� ���� ��ü�� �ּҸ� ��
		// *String�ϰ��, equals �� ������ �Ǿ������Ƿ� ���� ���Ѵ�.
			//String -> Integer, Double, equals�� ������ �Ǿ� �ִ�.
	}
	
	public <K,V> void method3 (K k, V v) { // 2���� Ÿ�� ����
		System.out.println(k + " : " + v);
	}
	public <K,V> void method4 () {
		System.out.println("�Ű� ������ ��ǲ������ ���� ��� ����");
	}
	
}

public class GenericMethod {

	public static void main(String[] args) {
		// 1. �Ϲ� Ŭ���� ��ü ���� �� ���ʸ� �޼��� ȣ��
		ssGeneric gmGeneric = new ssGeneric();
		String str1 = gmGeneric.<String>method1("�ȳ�"); // T -> String 
		// �޼��� ȣ���ϱ� ���� <Ÿ��>�����ؼ� ȣ��
		String  str2 = gmGeneric.method1("�ȳ�");
		// Ÿ���� �� �� �ִ� ��� <String>���� ����(�Ű������� ���� ���� ��������)
		System.out.println(str1);
		System.out.println(str2);
		
		Integer integer = gmGeneric.<Integer>method1(100);
		Integer integer2 = gmGeneric.method1(200);
		System.out.println(integer);
		System.out.println(integer2);
		
		Boolean boolean1 = gmGeneric.<Double>method2(2.55, 2.553);
		// method2�� ����Ÿ���� boolean
		Boolean boolean2 = gmGeneric.<Double>method2(1.5, 1.5);
		System.out.println(boolean1);
		System.out.println(boolean2);
		
		// method3�� ����Ÿ�� -> void(�ٷ� ��� ����)
		gmGeneric.<Integer, String> method3(500, "���������Դϴ�.");
		gmGeneric.method3(402, "������ ã�� �� �����ϴ�.");
		
		gmGeneric.method4();
		

	}

}
