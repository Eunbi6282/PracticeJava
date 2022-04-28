package book.ExProject;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Scanner;

import javax.print.attribute.standard.PrinterInfo;

// 객체 간의 협업
/*				학생의 용돈 : 100,000
 	학생 	:   			버스를 탈 때 (가진돈 - 1000)  	지하철을 탈 때(-1500)
 	버스 	: 1000원   		승객수 증가, 수입 증가
 	지하철	: 1500원										승객수 증가, 수입 증가
 	
 */

class Student{
	String studentName;	// 학생이름
	int money;  // 학생이 가진 돈, 초기값 : 100,000
	
	public Student(String studentName , int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}


	public void takeBus(Bus bus) {	// 학생이 버스에 탔을 때?  버스에 돈을 지불해야 한다. 
		bus.take(1000);//1000원이 마이너스 됨
	}
	
	public void takeOutBus(Bus bus) {	// 버스에서 내림 =? 벗
		//bus.takeout();
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
	}
	
	public void takeOutSubwap (Subway subway) {	// 지하철에서 내림 =? 벗
		subway.takeOut();
	}
	
	@Override
	public String toString() {
		return studentName + "\t\t" + money  ;
	}
}

class Bus{
	int busName; 	// N번 버스		<= 인풋값을 받아서 생성자에서 매개변수로 버스 이름 지정
	int passenagerCount;  // 승객수 , 학생이 버스에 탈수록 승객수 늘어남
	int money;  // 버스의 수입
	
	
	
	public int getBusName() {
		return busName;
	}
	public int setBusName(int busName) {
		return this.busName = busName;
	}
	public int getPassenagerCount() {
		return passenagerCount;
	}
	public void setPassenagerCount(int passenagerCount) {
		this.passenagerCount = passenagerCount;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void take(int money) {		//  버스의 수입을 처리, 승객수 처리
		// 이 money는 버스의 수입,승객을 높여줌
		
	}
	public void takeOut(){	// 승객수만 감소
		
	}
}

class Subway{
	String lineNumber;  // 1호선 2호선 3호선
	int passengerCount;		// 승객수
	int money;		//수입
	
	// 생성자를 통해서 지하철 호선을 인풋받아서 활성화
	
	public void take (int money) {	//  지하철의 수입을 처리, 승객수 처리
		
	}
	
	public void takeOut(){	// 승객수만 감소
		
	}
}

public class CooperationBetweenObject {
	public static ArrayList<Student> students = new ArrayList();
	public static Scanner scanner = new Scanner(System.in);
	private static ArrayList<Bus> busarr = new ArrayList<Bus>();
	
	static String Sname = null;
	static int leftMoney = 0;
	static int originMoney = 0;
	static int BpassengerCount;
	static int Bincome;  // 버스의 수입
	static int busNum;  // 버스 번호 
	
	// 1번 메서드
	public static void create() {
		System.out.println("학생 이름을 입력하세요 >>>");
		String studentName = scanner.next();
		System.out.println("돈을 입력하세요 >>> ");
		int money = scanner.nextInt();
		
		students.add(new Student(studentName, money));
		System.out.println("잘 입력되었습니다. ");
	}
	
	// 2번 메서드
	public static void printerInfo() {
		System.out.println("=====학생정보 출력=====");
		System.out.println("학생이름\t\t 가진돈\t\t");
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
		
		System.out.println("학생을 선택하세요(이름 입력) >>>");
		Sname = scanner.next();
		Student student = searchMethod(Sname);
		
		if (searchMethod(Sname) == null) {
			System.out.println("선택한 이름의 학생은 없습니다. ");
		}else {
			System.out.println(student.getStudentName() + "의 정보를 선택했습니다.");
		}
		
	}
	
	//3번 메서드
	
	public static void takeBus() {
		Student student = searchMethod(Sname);
		System.out.println("버스번호를 입력하세요 >>> ");
		busNum = scanner.nextInt();
		Bus bus = new Bus();
		busNum = bus.setBusName(busNum);  
		System.out.println(student.getStudentName() + "님 " + busNum + " 번 버스를 탔습니다. 즐거운 하루되세요^^");
		
		for (int i = 0; i < students.size(); i++) {
			originMoney = students.get(i).getMoney();
			student.money = originMoney - 1000;
			leftMoney = student.money;
		}
		System.out.println(student.getStudentName() + "님의 남은 돈은 " + leftMoney + "입니다.");
		
		
		for (int i = 0; i < students.size(); i++) {
			if (Sname != students.get(i).studentName) { // 배열에 있는 이름과 외부에서 받는 이름이 다르면 승객수를  +1하려고 합니다. 
				busarr.add(/* 뭘 넣어야 할까요...?*/);
			}
			
		}
		
		Bincome = 1000 * busarr.size() ;
		
		System.out.println("버스 " + busNum + "번의 승객은 " + BpassengerCount + "명이고 수입은 " + Bincome  + "입니다. ");
		
	}
	
	// 4번 메서드
	public static void takeOffBus() {
		Student student = searchMethod(Sname);
		System.out.println("버스번호를 입력하세요 >>> ");
		System.out.println(student.getStudentName() + "님 " + busNum + " 번 버스를 내렸습니다. 굿바이~");
		
//		for (int i = 0; i < students.size(); i++) {
//			originMoney = students.get(i).getMoney();
//			leftMoney = originMoney - 1000;
//		}
//		System.out.println(Sname + "님의 남은 돈은 " + leftMoney + "입니다.");
		
//		BpassengerCount = students.size();
//		System.out.println(BpassengerCount);
//		
//		for (int i = 0; i < students.size(); i++) {
//			
//			Bincome += students.get(i).money ;
//		}
//		System.out.println("버스 " + busNum + "번의 승객은 " + BpassengerCount + "명이고 수입은 " + Bincome  + "입니다. ");
		
	}
	
	
	// 같은 학생 찾기 메서드
	public static Student searchMethod(String studentName) {
		Student student = null;
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i) != null) {
				String	name = students.get(i).getStudentName();
				if (name.equals(studentName)) {
					student = students.get(i);
					return student;
				}
			}
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		while (true) {
			System.out.println("========================================================================\r\n"
					+ "1. 학생객체 생성  | 2. 학생정보 출력 및 선택  \r\n"
					+ "3. 버스를 탐 |  4.  버스를 내림 5. 지하철을 탐 , 6. 지하철을 내림.   7. 종료  \r\n"
					+ "========================================================================");
			System.out.println("선택 >>> ");
			int selectNum = scanner.nextInt();
			if (selectNum == 1) {
				create();
			}else if (selectNum == 2) {
				printerInfo();
			}else if (selectNum == 3) {
				takeBus();
			}else if (selectNum == 4) {
				takeOffBus();
			}else if (selectNum == 5) {
				
			}else if (selectNum == 6) {
				
			}else if(selectNum == 7) {
				break;
			}
			
		}
		scanner.close();
		System.out.println("프로그램을 종료합니다. ");

	}

}
