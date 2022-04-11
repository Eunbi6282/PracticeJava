package book.chapter19.Ex01;

import java.io.File;
import java.io.IOException;

// 주의 : 이클립스에서 파일생성시 C:\\에 생성할 때 권한 문제로 인한 오류가 생길 수 있다.
	// 문제해결 첫번째 방법1 : 이클립스를 <<관리자 권한>>으로 실행
	// 방법 2. 폴더 내부에 파일을 생성 ex) "C:/ temp001/ newFile.txt"

// File객체 내의 폴더 식별자를 적용할 경우
	// C:\abc\abc.txt

	// 1. Windows인 경우 : String path = "C:\\abc.\\abc.txt" (역슬래시 두번처리)  ""내에 특수문자를 처리하기 위한 기호\ <= \를 처리해주기 위해서 \를 하나 더 붙임
	//    Windows10인 경우 : String path = "C:/abc/abc.txt"
	// 2. Mac인 경우 : String path = "C:/abc/abc.txt"

// 호환을 위해서 공통적으로 사용할 수 있는 코드 작성 <슬래시가 들어가는 부분을 File.separator 사용>
	// String path = "C:" + File.separator + "abc" + File.separator + "abc.txt"




public class CreateFileObject {

	public static void main(String[] args) { //thorws 사용해서 예외처리 미룸 -> 예외 처리 필요
		// 1. File객체 사용해서 폴더 생성. 해당 파일이나 폴더가 존재하지 않는 경우
		File tempDir = new File("C:/temp002");  //temp002폴더 tempDir
		if (!tempDir.exists()) {  //.exist() 해당 결로에 파일이나 폴더가 존재하면 true, 존재하지 않는다면 false
			tempDir.mkdir();  // tempDir에 "C:/temp002" 폴더나 파일이 없으면 .mkdir(폴더 만들어라)
		}
		System.out.println(tempDir.exists()); //.exist() 해당 결로에 파일이나 폴더가 존재하면 true, 존재하지 않는다면 false
		
		// 2. File객체를 사용해서 파일 생성
		File newFile = new File("C:/temp002/newFile.txt"); // C드라이브에 파일을 바로 만들 경우 권한 문제로 오류가 생길 수 있음 <= 이클립스를 관리자 권한으로 실행
		if(!newFile.exists()) {   // newFile이 존재하지 않는다면
			try {
				newFile.createNewFile();  // 파일을 생성할 때 예외가 발생될 수 있다.
			} catch (IOException e) {
				e.printStackTrace();
			} 	
		}
		System.out.println(newFile.exists());
		System.out.println("==============");
		
		//3. 파일 구분자
		File newFile2 = new File("C:\\temp002\\newfile01.txt");  //Windows10하위버전
		File newFile3 = new 
		
		
		
		
	}

}
