package book;
class Human{
	String nameString;
	int age;
	void eat() {}
	void sleep() {}
}

class Student extends Human{
	int studentId;
	void goToSchool() {}
}

class Worker extends Human{
	int workerId;
	void goToWork() {}
}


public class P_313 {
	public static void main(String[] args) {
	//Human ��ü ����
		Human human= new Human();
		human.nameString = "������";
		human.age = 25;
		human.eat();
		human.sleep();
	
	//Student ��ü ����
		Student student = new Student();
		student.nameString = "������";
		student.age = 26;
		student.studentId = 19960214;
		student.eat();
		
	//Worker ��ü ����
		Worker worker = new Worker();
		worker.workerId = 20170033;
		worker.nameString = "������";
		worker.goToWork();
		

	}
}
