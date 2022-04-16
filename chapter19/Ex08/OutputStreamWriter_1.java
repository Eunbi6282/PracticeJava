package book.chapter19.Ex08;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

// InputStreamReader : byte => char
// OutputStreamWriter : byte => char, CharSet을 저장해서 file을 저장할 수 있다. 

// 이클립스 외부에 저장하면 잘 적용됨
	// - 이클립스 폴더 하위에 설정하면 타입을 지정하더라도 상위 폴더의 인코딩 타입을 상속받아서 파일이 만들어짐




public class OutputStreamWriter_1 {
	public static void main(String[] args) {
		// 1. FileWriter을 통해서 데이터 쓰기(Default : MS949)
		File osw1 = new File("C:\\Temp\\osw1.txt");  //MS949
			
		// Writer 추상 클래스 이용해서 파일에 값 입력
		try (Writer writer = new FileWriter(osw1);){  // FileWriter => char배열처리, encoding 타입 지정 불가,Default Charset(UTF-8)
			writer.write("OutputStreamWriter1 예제 파일입니다.\n" .toCharArray());  //String을 char배열안에 저장 //배열
			writer.write("한글과 영문이 모두 포함되어 있습니다.");  // String
			writer.write('\n');  // char저장
			writer.write("Good Bye!!! \n\n");
			writer.flush();
		} catch (IOException e) {}		
		
		// 2. FileWrite를 사용해서 (Default(MS(949) ==> UTF-8 파일 쓰기)
			//OutputStreamReader
		File osw2 = new File("C:\\Temp\\osw2.txt");		//UTF-8
		
		try (OutputStream os = new FileOutputStream(osw2); 
				//outoutStream 통해 byte로 입력했음 Writer 추상 메서드의 OutputStreamWriter 이용해서 byte을 char로 변환
				Writer osw = new OutputStreamWriter(os,"UTF-8");){ // OutputStreamWriter : byte를 char로 변환{
			osw.write("OutputStreamWriter1 예제 파일입니다.\n" .toCharArray());  // String을 char배열안에 저장 // 배열
			osw.write("한글과 영문이 모두 포함되어 있습니다.");  // String
			osw.write('\n');  // char저장
			osw.write("Good Bye!!! \n\n");
			osw.flush();
		}catch (Exception e) {}
	}
}
