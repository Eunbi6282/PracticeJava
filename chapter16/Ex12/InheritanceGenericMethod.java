package book.chapter16.Ex12;


class Parent{
	<T extends Number> void print (T t) { // ���ʸ� �޼��� : �Ϲ� Ŭ���� ���� �־�� ��
		System.out.println(t);
	}
}

class Child extends Parent{
	// ���ʸ��޼��带 ������ �Ϲ� Ŭ������ ����� �θ� Ŭ������ ���ʸ� �޼���� �״�� �ڽ� Ŭ������ ��ӵ�
}

public class InheritanceGenericMethod {
	public static void main(String[] args) {
		// 1. �θ� Ŭ������ ���ʸ� �޼��� ���
		Parent parent = new Parent();
		parent.<Integer>print(200);
		parent.<Double>print(100.85);
		parent.print(300); // �Ű������� ���� ���� Ÿ���� �� �� �ִ� ��� ���� ����
		
		System.out.println();
		
		// 2. �ڽ�Ŭ�������� ���ʸ� �޼��� ���
		Child child = new Child();
		child.<Integer>print(200);
		child.<Double>print(200.39);
		

	}

}
