package book.chapter19.Ex05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// InputStream : 추상 클래스 <= FileInputStream 구현한 클래스(읽어올 때)
// OutoutStream : 추상 클래스 <= FileOutStream 구현한 클래스 (쓰기)
// FileInputStream : byte() 단위 데이터 읽기
// FileOutpurStream : byte()단위 데이터 쓰기

// Windows 콘솔, 메모장 Enter을 넣으면 : \r\n

public class FileOutputStream_1 {

	public static void main(String[] args) {
		// 1. 입력파일 생성(존재하지 않음)
		File outFile = new File("src/book/chapter19/Ex05/FileOutput1.txt");
		
		// 2. 한바이트 읽기
		OutputStream os1 = null;
		OutputStream os2 = null;
		OutputStream os3 = null;
		try {
			os1 = new FileOutputStream(outFile);
				// FileOutPutStream에 존재하지 않는 파일을 넣으면 생성됨
			
			os1.write('J');
			os1.write('A');
			os1.write('V');
			os1.write('A');
			os1.write('\r');  // 엔터 -> byte13 <= 생략가능
			os1.write('\n');	// 엔터 -> byte11
				// !!!중요!!! : write() 메서드는 버퍼(RAM)에 쓰기<메모리에 올림>, 버퍼가 꽉차면 파일에 쓰게 함
				//			  flush() : 버퍼에 저장된 내용을 파일에 강제로 쓰게 할 때 사용
			os1.flush();	// 메모리의 내용을 파일에 쓰도록 강제로 적용, 버퍼가 꽉차지 않더라고 강제로 파일에 쓰도록 한다.
			os1.close(); 	// .close()호출시 flush() 먼저 작동 됨
			
		// 3. n-byte단위 쓰기(byte[]의 offset부터 length)
			os2 = new FileOutputStream(outFile); // 덮어쓰기
				// (file, false ) => 기본값 , 덮어쓰기
				// (file, true) => 이어쓰기
			byte[] byteArray = "Hello!".getBytes();	//Hello!(String)  => byte로 변환해 줘야 함
				// 문자열이 문자가 아닌 바이트 타입으로 배열안에 들어감
			
			os2.write(byteArray); // 덮어써짐
			os2.write('\n');	// \r은 생략가능, \n만 넣어도 enter처리 됨
			
			os2.flush();
			os2.close();
			
		// 4. n-byte 단위 쓰기 (byte[]의 offset붵 length 의 byte데이터 쓰기
			
			os3 = new FileOutputStream(outFile, true); // 이어쓰기
			byte[] byteArray2 = "Better the last smile tha the first".getBytes();
			os3.write(byteArray2,7,14);	// write일때 7byte뒤에서 8읽어서 저장
			os3.flush();
			os3.close();
					
		} catch (IOException e) {
			System.out.println("예외발생");
		}finally {
			try {
				os1.close();
				os2.close();
				os3.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
