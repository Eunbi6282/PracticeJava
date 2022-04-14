package book.chapter19.Ex07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Eclipse_Copy_Test {

	public static void main(String[] args) {
		// 두 파일을 복사, Buffered를 사용해서 복사
		File orgFile = new File("C:\\Temp\\Buffered_Test\\eclipse_origin.exe");
		File copyFile = new File("C:\\Temp\\Buffered_Test\\eclipse_copy.exe");
		
		// Buffered를 사용해서 복사하는 경우
		try (InputStream is = new FileInputStream(orgFile);
			BufferedInputStream bis= new BufferedInputStream(is);
			OutputStream os = new FileOutputStream(copyFile);
			BufferedOutputStream bos = new BufferedOutputStream(os);	
				){
			int data;
			
			while ((data = bis.read()) != -1) {
				bos.write(data);
			}
		} catch (Exception e) {}

	}

}
