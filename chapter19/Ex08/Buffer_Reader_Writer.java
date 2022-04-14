package book.chapter19.Ex08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Buffer_Reader_Writer {
	public static void main(String[] args) {
		// 1. 파일객체 생성
		File rwfile = new File("src\\book\\chapter19\\Ex08\\BufferFile.txt");
		
		// 2. FileWriter를 통해 파일에 글자 쓰기(MS949)
		try (Writer writer = new FileWriter(rwfile);
			BufferedWriter bWriter = new BufferedWriter(writer);	
		){
			bWriter.write("안녕하세요\n");
			bWriter.write("Hello");
			bWriter.write('\r');
			bWriter.write('\n');
			bWriter.write("반갑습니다",2,3);
			bWriter.flush();
		} catch (IOException e) {}
		
		// 2. FileReader를 이용한 파일읽기 (MS949)
		try (Reader reader = new FileReader(rwfile);
			BufferedReader bReader = new BufferedReader(reader);	
		){
			
			// BufferedReader에 추가된 메서드 :readLine
			
			//int read() 는 파일의 끝을 -1로 표시
			// readLine은 리턴 타입이 String, 파일의 끝을 나타낼 때 null,한라인 씩 읽는다.
			
			String dataString;
			while ((dataString = bReader.readLine()) != null) {
				System.out.println(dataString);
			}
		} catch (Exception e) {}
		
		
		
	}
	
	

}
