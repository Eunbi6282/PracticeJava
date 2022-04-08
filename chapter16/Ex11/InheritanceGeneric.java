package book.chapter16.Ex11;


// ���ʸ� Ŭ������ ��� :�ڽ� Ŭ������ �θ� Ŭ������ ���ʸ� ���� (T,V,K,E)�� ���ų� �� ���ƾ� �Ѵ�. 

class Parent<T>{
	T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

class B extends Parent<T>{ // B�� <T>Ÿ���� �ް� ��������� ��
	
}

class Child1 <T> extends Parent<T>{  // ���ʸ� Ŭ������ ��ӹ޴� �ڽ�Ŭ������ �θ��� Ÿ���� ���ڰ����� ���ų� Ŀ���Ѵ�.
	// �θ� Ŭ������ ���׸� Ŭ������ �� �̸� ����� �ڽ� Ŭ������ ���׸� Ŭ������ �ȴ�. 
	
}

class Child2 <T ,V> extends Parent<T>{
	// �θ� Ŭ������ ���׸� Ŭ������ �� �̸� ����� �ڽ� Ŭ������ ���׸� Ŭ������ �ȴ�. 
	// ���� ���׸� Ÿ�� ������ �߰��� ������ ���� �ִ�.
	V v; 		// T�� �θ�Ŭ�������� ��ӹ����Ƿ� ����x

	public V getV() {
		return v;
	}

	public void setV(V v) {
		this.v = v;
	}
	
}
public class InheritanceGeneric {

	public static void main(String[] args) {
		// 1. �θ� ���ʸ� Ŭ���� ����
		Parent<String> parent = new Parent<String>();
//		Parent<String> parent2 = new Parent<>();  -> �̷��Ե� ����
		
		parent.setT("�θ� ���ʸ� Ŭ����");
		System.out.println(parent.getT());
		
		Parent<Integer> integerParent = new Parent<>();
		integerParent.setT(1);
		System.out.println(integerParent.getT());
		
		// 2. �ڽ� Ŭ����1
		Child1<String> child1 = new Child1<String>();
		child1.setT("�ڽ�1 ���ʸ� Ŭ����"); // �θ𿡼� ��ӵ� �޼���
		System.out.println(child1.getT());
		
		// 3. �ڽ� Ŭ���� 2
		Child2<String, Integer> child2 = new Child2<>(); 	// T�� �θ𿡼� ��ӵǾ ������, V�� �ڽĿ��� ����
		child2.setV(500); 	// �ڽ� Ŭ������ �޼���
		child2.setT("�ڽ�2 -���ʸ� Ŭ����"); //�θ� Ŭ������ �޼���
		System.out.println(child2.getV()); // �ڽ� �޼��� ���
		System.out.println(child2.getT()); // �θ�޼��� ���
	}

}
