package book.chapter19.Ex08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

// InputStreamReader : Stream(byte) Reader(char), byte데이터를 char포멧으로 변환하는 객체
	// byte포멧은 인코딩을 잘 지정해야 한다. (InputStream, OutputStream)
	// char포멧으로 바꾸면 인코딩 타입을 신경쓸 필요가 없다. 

public class InputStreamReader_1 {

	public static void main(String[] args) {
		//  파일 객체 생성
		File isr = new File("src\\book\\chapter19\\Ex08\\isr.txt");		//isr.txt는 UTF-8로 저장되어 있다. 
		
		// 1. 파일 읽어오기  => 당연히 깨짐. isr.txt는 UTF-8, 현재 자바 파일은 MS949
		try (Reader reader = new FileReader(isr);){  // FileReader는 인코딩 설정이 안됨.Default encoding만 사용
			int data;
			while ((data = reader.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (Exception e) {}
		
		System.out.println("===========================================");
		System.out.println("===========================================");
		
		// 2. FileInputStream + InputStreamReader을 이용한 파일 읽기
			// InputStreamReader(is, "encoding") 을 장착해서 UTF-8도 읽을 수 있게
				// byte데이터를 char포멧으로 변환하는 객체
		try (InputStream iStream = new FileInputStream(isr);	// 기반 스트림 필요
			InputStreamReader isreader = new InputStreamReader(iStream, "UTF-8");// FilterStream
				){
			int data;
			while ((data = isreader.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (Exception e) {}

	}

}
