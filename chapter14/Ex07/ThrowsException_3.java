package book.chapter14.Ex07;
// Exception - Checked Exception : 컴파일 오류, 반드시 예외처리
		//  - unCheckd Exception(Runtime Exception) : 실행시에 예외

// 1. Exception이 발생한 메서드 내부에서 자신이 직접예외 처리
class A{
	void abc() {
		bcd();
	}
	void bcd() {
//		Class cls = Class.forName("java.lang.Object");
//		Thread.sleep(1000); 
		// Class.forName : 실행 시 클래스 파일이 존재할 수도 있고 존재하지 않을수도 있기 때문에 예외 처리를 해주어야 한다.!!!
		try {
			Class cls = Class.forName("java.lang.Object");
			Thread.sleep(1000); 
		} catch (ClassNotFoundException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

// 2. throw를 사용해서 Exception을 미루는 경우
class B{
	void abc() {
		try {
			bcd();
		} catch (ClassNotFoundException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void bcd() throws ClassNotFoundException, InterruptedException {
		Class cls = Class.forName("java.lang.Object");
		Thread.sleep(1000);
	}
	
}
public class ThrowsException_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
