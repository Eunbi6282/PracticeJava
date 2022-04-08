package book.chapter16.Ex01;

import org.w3c.dom.NameList;

import book.chapter15.Ex14.NewRunnableTerminated;

// 4개의 객체를 Object타입을 사용해서 저장하고 출력
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
		return "이름은 : " + name + " , 아이디 : " + id + " , 패스워드 : " + pw;
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
		return "이름은 : " + name + " , 근무 시작 년도 : " + year + " , 이메일 : " + email;
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
		return "이름은 : " + name + " , 다리개수 : " + run;
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
		return "이름은 : " + name + " , 색 : " + color + " , 가격 : " + price;
	}
}

class Total{ // Object를 사용해서 모든 상품을 저장할 수 있다. 
	private Object object = new Object(); //private -> setter로 값 할당, getter로 값 출력

	public Object getObject() {
		return object;  // setter를 통해서 Object타입으로 업캐스팅되어서 다운 캐스팅 필요
	}

	public void setObject(Object object) {
		this.object = object;
	}
	
}

public class Ex_UsingObject {
	public static void main(String[] args) {
		// 1. Student 
		Total total1 = new Total();
		total1.setObject(new Student("박은비", "20170033", 6282)); // 모든 class는 Object클래스를 상속하고 있음
		System.out.println((Student)total1.getObject()); // Student 타입으로 다운캐스팅 필요
		
		// 2. Professor
		Total total2 = new Total();
		total2.setObject(new Professor("박은비", 2017, "eun6282"));
		System.out.println((Professor)total2.getObject());
		((Professor)total2.getObject()).abc();
		
		

	}

}
