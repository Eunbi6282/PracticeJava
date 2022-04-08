package book.chapter14.Ex08;
//--사용자 정의 예외 만들기--
//ID의 값을 NULL일 경우 Exception 발생
//userID가 8자 이상 , 20자가 아닌 경우 Exception

class IdInfoException extends Exception{
	// 1. 기본생성자
	public IdInfoException() {
		super();
	};
	
	// 2. 매개변수 1개 받는 생성자 -> 예외 메세지 매개변수로 받아서 출력 e.getmessage()
	public IdInfoException(String message){
		super(message);
	};
}

class OverException extends Exception{
	public OverException(){
		super();
	}
	public OverException(String message){
		super(message);
	}
}

public class IDFormatTest {
	private String userId = null;
	private String studentId = null;
	// 각 필드들은 private로 캡슐화되어있음 -> 객체 생성 후 바로 접근하지 못하도록
		//setter나 생성자로 값할당
	
	//setter로 값을 할당할 때 조건을 넣어서 control할 수 있음.
	public void setUserId(String userId) {		//받은 변수 값을 값으로 활성화
		if(userId == null) {
			//try catch
			try {
				throw new IdInfoException();
				
			} catch (Exception e) {
				System.out.println("아이디는 null일 수 없습니다.");
			}
		}else {
			System.out.println("정상작동");
		}
		this.userId = userId;
	}	
	
	public void setStudentId(String studentId) throws OverException {
		if(studentId.length() < 7 || studentId.length() > 20) {
			// throws로 예외를 전가해야 합니다. 
			throw new OverException("8자 이상, 20자 이내여야 합니다.");
		}else {
			System.out.println("정상 작동");
		}
		this.studentId = studentId;
	}
	
	public static void main(String[] args) {
		
	IDFormatTest test = new IDFormatTest();
	test.setUserId(null);
	// throws로 받아서 예외 처리 필요
		try {
			test.setStudentId("22222");
		} catch (OverException e) {
			System.out.println(e.getMessage());
		}
	}
}
