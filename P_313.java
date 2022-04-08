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
	//Human 객체 생성
		Human human= new Human();
		human.nameString = "박은비";
		human.age = 25;
		human.eat();
		human.sleep();
	
	//Student 객체 생상
		Student student = new Student();
		student.nameString = "정재현";
		student.age = 26;
		student.studentId = 19960214;
		student.eat();
		
	//Worker 객체 생성
		Worker worker = new Worker();
		worker.workerId = 20170033;
		worker.nameString = "박은비";
		worker.goToWork();
		

	}
}
