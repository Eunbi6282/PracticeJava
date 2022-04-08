package book.chapter14.Ex05;
// 직접 생성한 객체에서 AutpCloseable 사용
	//try(객체 생성 구문){} catch{} : 자동으로 close() //
	// 1. AutoClosable 인터페이스의 close()메서드를 오버라이딩 구현해야 한다.
	// 2. java.lang.AutocClosable : java.lang <==import문을 사용하지 않아도 된다. 
	// java.lang.Object

	//예외 처리 방법
		// 1. try catch : 자신이 직접 예외 처리
		// 2. throws를 통해서 예외 처리하는 방법 : 예외를 내가 처ㅣ하지 않고 호출하는 곳에서 처리하도록 
		 //throw :강제로 발생시키다.
class A implements AutoCloseable{
	String resource;	//resource = null 
	
	//변수에 값 할당하기(1. 생성자 2. setter)
	
	A (String resource){	//생성자의 매개변수로 String값을 받아서 메모리로 로딩
		this. resource = resource;
	}

	@Override
	public void close() throws Exception {
		// close()가 자동으로 호출
		System.out.println(resource);
		
		if (resource != null) {
			resource = null;
			System.out.println("리소스가 해제되었습니다.");
			System.out.println(resource);
			// AutoClose인터페이스를 구현함으로써 resource의 값이 null이 아닌경우 resource값을 초기화
		}
	}
	
}
public class TryWithResource_2 {
	public static void main(String[] args) {
		// 1. 자동 리소스 해제 사용
		try (A a1 = new A("특정파일");){
			// finally 블락에 a1.close()메서드를 자동으로 호출
			//catch블락이 종료되면 자동으로 A클래스의 close()가 호출됨
			
		} catch (Exception e) {
			System.out.println("예외가 발생되었습니다. ");
		}
		
		//2. 수동으로 리소스 해제
		A a2 = null;
		try {
			a2 = new A("생성자 초기값 할당");
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(a2.resource != null) {
				// a2.close(); -> 호출하는 곳에서 exception예외 처리를 미뤘기 때문에 예외처리 해줘야 함.
				try {
					a2.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
