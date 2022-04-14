package book.chapter19.Ex07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

// 추가 기능을 제공하는 스트림 : 기반 스트림이 존재해야 한다. 단독으로 사용할 수 없다.
// BufferedInputStream : InputStream의 필터를 장착해서 읽기 성능을 아주 빠르게 한 스트림, 기반 스트림의 추가 기능이어서 단독으로 사용 못함.
// BufferedOutputStream : OutputStream의 필터를 장착해서 쓰기 성능을 아주 빠르게 한 스트림, 기반 스트림의 추가 기능이어서 단독으로 사용 못함.

public class BufferedInput_BufferedOutputStream {
	public static void main(String[] args) {
		// 두 파일을 복사, Buffered를 사용하지 않고 처리하느 ㄴ경우, Buffered를 사용하는 경우 속도 차이. 
		File orgFile1 = new File("src\\book\\chapter19\\Ex07\\mycat_origin.jpg"); // 원본파일
		File copyFile1 = new File("src\\book\\chapter19\\Ex07\\mycat_copy1.jpg"); //Buffered 사용 X
		File copyFile2 = new File("src\\book\\chapter19\\Ex07\\mycat_copy2.jpg"); //Buffered 사용
		
		// 성능 측정을 하기 위한 변수 선언
		long start, end, time1, time2; // time1 : Buffered를 사용하지 않는 경우 ,time2 : Buffered를 사용하는 경우
		
		// 1. Buffered를 사용하지 않고 처리하는 경우 
		start = System.nanoTime();	// 시작시간
		
		try (InputStream is = new FileInputStream(orgFile1); // org파일 읽어옴
			OutputStream os = new FileOutputStream(copyFile1);){// AutoClose
			
			//데이터 복사 코드 생성
			int data;
			 while((data = is.read()) != -1){  //InputStream에서 한바이트씩 읽은 값을 data에 저장.
				 os.write(data); // 그 값을 OutputStream에 1byte씩 쓰기, -1(마지막까지) => copy1파일 생성
			 }
		} catch (Exception e) {} 
		end = System.nanoTime();
		time1 = end - start;
		System.out.println("Without BufferedXXXStream : " + time1); // Buffered를 사용하지 않고 복사. copy1.jpg
		
		
		// 2. Buffered를 사용해서 처리하는 경우(BufferedInputStream, BufferedOutputStream)
		start = System.nanoTime();
		 
		try (InputStream is = new FileInputStream(orgFile1); //기반 스트림
			BufferedInputStream bis = new BufferedInputStream(is); // 추가 기능을 제공하는 스트림, 성능을 빠르게 처리(Buffered)사용
			OutputStream os = new FileOutputStream(copyFile2);
			BufferedOutputStream bos = new BufferedOutputStream(os); // 추가 기능을 제공하는 스트림, 성능을 빠르게 처리(Buffered)사용
		){
			// 원문을 복사하기 위한 // InputStream읽어와서 OutputStream에 복사
			
			// 복사할 코드 생성
			int data;
			while ((data = bis.read()) != -1) {  // 버퍼를 사용해서 읽기
				bos.write(data);  // 버퍼를 사용하기 
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		end = System.nanoTime();
		time2 = end - start;
		System.out.println("With BufferedXXXStream : " + time1); // Buffered를 사용 copy2.jpg
		
		// Buffered 사용한 경우 (time2), 사용하지 않은 경우 (time1)
		System.out.println("속도 차이 몇 배 ? " + (time1 / time2) + "배 빠름");
	}

}
