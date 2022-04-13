package book.chapter19.Ex05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class FileOutputStream_2 {

	// FileOutputStream사용해서 한글처리 => .getBytes("MS949")encoding타입 지정해주기
	public static void main(String[] args) {
		// 1. 저장할 파일 생성
		File outfile = new File("src/book/chapter19/Ex05/FileOutput2.txt");
			// 기본적으로 이클립스의 default charactorset으로 지저장
		
		OutputStream os1 = null;
		OutputStream os2 = null;
		
		try {
			
			// 2. n-byte 단위 쓰기 처리(byte[]의 처음부터 끝까지 쓰기, 한글처리)
				os1 = new FileOutputStream(outfile);
				byte [] byteArray1 = "안녕하세요".getBytes("MS949");  //String ==> byte[]에 저장, byte타입
					// 한글이라서 2byte씩 처리됨
				os1.write(byteArray1);
				os1.write('\n');
				os1.flush();
				
			// 3. n-byte 쓰기 (byte[], offset, length)
				os2 = new FileOutputStream(outfile, true);  // 이어서 쓰기
				byte[] arr2 = "반갑습니다.".getBytes(Charset.forName("MS949")); //MS949로 가져오기
				os2.write(arr2,2,9); // 2byte띄고 9byte출력		한글2byte, 특수문자 1byte 갑습니다.
					// 영어 숫자 특수문자 : 1byte
				os2.flush();
				
				
			
		} catch (IOException e) {
			// TODO: handle exception
		}finally {
			try {
				os1.close();
				os2.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
