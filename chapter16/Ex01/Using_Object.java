package book.chapter16.Ex01;

import book.chapter15.Ex14.NewRunnableTerminated;

/* Object�� ��� ��ü�� ������ �� �ִ�.
	  - ��ǰ�� �����ϴ� Ŭ��������  ObjectŸ������ ���夾�� ��� ��ü�� ���� �� �ִ�. 
	  Object�� ����ؼ� ��� ��ǰ�� ������ �� �ִ�.
	  ���� : ��� ��ü�� ���� �� �ִ�.(ĳ���� ����)
	  ���� : �Ź� �ٿ� ĳ������ �ؼ� ����ؾ� �Ѵ�. (���� Ÿ�� üũ�� �ϱ� ������ ����� ������ ���� �� �ִ�(
	 */

class Apple{
	String name;
	int price;
	
	public Apple(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void abc() {
		System.out.println("abc()�޼��� ���");
	}
	@Override
	public String toString() {	//apple ��ü ��ü�� ��½� ��ü�� �ּҰ� �����Ƿ� �ʵ��� ���� �������� toString()
		 return "�̸� : " + name + " , ���� : " + price;
	}
}

class Pencil{
	String name;
	int price;
	
	public Pencil(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	public void abc() {
		System.out.println("abc()�޼��� ���");
	}
	@Override
	public String toString() {	//pencil ��ü ��ü�� ��½� ��ü�� �ּҰ� �����Ƿ� �ʵ��� ���� �������� toString()
		 return "�̸� : " + name + " , ���� : " + price;
	}
}

class Goods{	//Object�� ����ؼ� ��� ��ǰ�� ������ �� �ִ�. 
	private Object object = new Object(); // Object : ��� Ŭ������ ObjectŸ������ ��ȯ����

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {  // set�� ���� ���� �Ҵ��ϸ� ObjectŸ������ ��ĳ���� �� -> �ٿ�ĳ���� �ʿ�(but ���� Ÿ�� üũ)
		this.object = object;
	}
	
	
}

public class Using_Object {

	public static void main(String[] args) {
		// 1. Apple�� ������ ��� Object
		Goods goods1 = new Goods();
		goods1.setObject(new Apple("���", 3000)); // setter�� �� �Ҵ�
		System.out.println((Apple)goods1.getObject());
		((Apple)goods1.getObject()).abc(); //abc()�� Ȱ���Ϸ��� -> �ٿ�ĳ����,
			// toString()�� Object�� toString()�� �������̵��� �� �ű� ������ ��µƴ�����. �ٵ� �� �������� �ٿ�ĳ���� �� ��!!!
		
		// 2. Pencil�� ������ ��� Object
		Goods goods2 = new Goods();
		goods2.setObject(new Pencil("����", 5000));
		System.out.println((Pencil)goods2.getObject()); 
		//Getter�� ��ü�� ��� : ObjectŸ���� ��ü�� �޾� ���� ������ Apple�� �ٿ� ĳ����
		
		// 3. �߸��� ĳ������ �� ���(���� Ÿ�� üũ) : Object�� ������
		Goods goods3 = new Goods();
		goods3.setObject(new Apple("���2", 2000));
		System.out.println((Pencil)goods3.getObject()); // ���� -> ����Ÿ��üũ : ����� ���� �߻�
		

	}

}
