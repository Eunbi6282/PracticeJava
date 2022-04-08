package book.chapter14.Ex05;
// 자동 리소스(객체)제거
	// 1. AutoCloseable 인터페이스 구현
	// 2. close()재정의
// 필드의 값 할당 -> 생성자 호출시 값 할당
class Abc implements AutoCloseable{
	String name;
	int studentID;
	int kor;
	int eng;
	double avg;
	
	Abc(String name, int studentID, int kor, int eng){
		this.name = name;
		this.studentID = studentID;
		this.kor = kor;
		this.eng = eng;
		this.avg = (double) (kor + eng)/3;
	}
	
	
	@Override
	public void close() throws Exception {
		if(name != null || studentID != 0 || kor != 0 || eng != 0) {
			System.out.println("이름 : " + name + " 학번 : " + studentID + " 국어 점수 : " + kor + " 영어 점수 : " + eng  + " 평균 : " + avg);	
			//초기화
			name = null;
			studentID = 0;
			kor = 0;
			eng = 0;
			avg = 0.0;
			System.out.println("이름 : " + name + " 학번 : " + studentID + " 국어 점수 : " + kor + " 영어 점수 : " + eng  + " 평균 : " + avg);	
		}
			System.out.println("리소스가 해제되었습니다.");
		}
}
	

public class Ex_TryWithResource {

	public static void main(String[] args) {
		//1. 객체의 모든 필드를 초기화 하고 자동으로 close()호출
			//-> AutoClosable인터페이스를 상속하고 그 메서드를 구현했으므로 가능 -> finally에서 자동으로 close()를 구현해 준다. 
	try (Abc a1 = new Abc("박은비", 20170033, 88, 95)){
	} catch (Exception e) {
		System.out.println("예외가 발생되었습니다.");
	}
	
	//2. 수동으로 close(); => finally블락에서 close()호출
	Abc a2 = null;
	try {
		a2 = new Abc("박은비", 55, 55, 55);
	} catch (Exception e) {
		 
	}

	}

}
