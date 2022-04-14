package book.chapter19.Ex08;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class File_Reader_Writer_UTF8 {

	public static void main(String[] args) {
		// 1. 파일 객체 생성
				File rwFile = new File("src\\book\\chapter19\\Ex08\\rwFile_UTF8.txt");
				
				try (Writer writer = new FileWriter(rwFile);){ 	//Writer :추상클래스 FileWriter: Writer을 구현한 자식 클래스
					// Stream -> 전부 byte단위 출력
					// Writer : char 단위 출력, 추상클래스, FileWriter(구현한 클래스), 문자를 특화해서 처리
					// OutStream : byte단위 츨력, 추상 클래스, FileOutoutStream(구현한 클래스)
					writer.write("안녕하세요\n".toCharArray());
					writer.write("Hello\n");
					writer.write('A');
					writer.write('\r');
					writer.write('\n');
					writer.write("반갑습니다.",2,3);
					writer.flush();
				} catch (IOException e) {}
				
				// 2. FileReader을 이용한 파일 읽기 (Default MS949) <= CharSet지정 옵션이 없다. 
				try (Reader reader = new FileReader(rwFile);){
					int data;
					while ((data = reader.read()) != -1) {
						System.out.print((char)data);
					}
				} catch (Exception e) {}
				// 메모장의 타입이 UTF-8이라도 Writer, Reader사용해 일겅옴

	}

}
