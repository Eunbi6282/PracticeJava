package book.chapter16.Ex01;

import org.w3c.dom.NameList;

import book.chapter15.Ex14.NewRunnableTerminated;

// 4���� ��ü�� ObjectŸ���� ����ؼ� �����ϰ� ���
class Student{
	String name;
	String id;
	int pw;
	
	public Student(String name, String id, int  pw) {
		this.name = name;
		this.id =  id;
		this.pw = pw;
	}
	
	@Override
	public String toString() {
		return "�̸��� : " + name + " , ���̵� : " + id + " , �н����� : " + pw;
	}
}

class Professor{
	String name;
	int year;
	String email;
	
	public Professor(String name, int year, String email) {
		this.name = name;
		this.year = year;
		this.email = email;
	}
	
	public void abc() {
		System.out.println("Professor()");
	}
	
	@Override
	public String toString() {
		return "�̸��� : " + name + " , �ٹ� ���� �⵵ : " + year + " , �̸��� : " + email;
	}
}

class Tiger{
	String name;
	String run;
	
	public Tiger(String name, String run) {
		this.name = name;
		this.run = run;
	}
	
	@Override
	public String toString() {
		return "�̸��� : " + name + " , �ٸ����� : " + run;
	}
}

class Banana{
	String name;
	String color;
	int price;
	
	public Banana(String name, String color, int price) {
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "�̸��� : " + name + " , �� : " + color + " , ���� : " + price;
	}
}

class Total{ // Object�� ����ؼ� ��� ��ǰ�� ������ �� �ִ�. 
	private Object object = new Object(); //private -> setter�� �� �Ҵ�, getter�� �� ���

	public Object getObject() {
		return object;  // setter�� ���ؼ� ObjectŸ������ ��ĳ���õǾ �ٿ� ĳ���� �ʿ�
	}

	public void setObject(Object object) {
		this.object = object;
	}
	
}

public class Ex_UsingObject {
	public static void main(String[] args) {
		// 1. Student 
		Total total1 = new Total();
		total1.setObject(new Student("������", "20170033", 6282)); // ��� class�� ObjectŬ������ ����ϰ� ����
		System.out.println((Student)total1.getObject()); // Student Ÿ������ �ٿ�ĳ���� �ʿ�
		
		// 2. Professor
		Total total2 = new Total();
		total2.setObject(new Professor("������", 2017, "eun6282"));
		System.out.println((Professor)total2.getObject());
		((Professor)total2.getObject()).abc();
		
		

	}

}
