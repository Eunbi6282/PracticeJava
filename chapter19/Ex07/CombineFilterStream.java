package book.chapter19.Ex07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

// 하나의 기반 스트림에 Filter 스트림을 여러개 혼합해서 사용 가능하다.
	// 제일 마지막에 처리하는 Stream의 메서드 사용 여부에 따라 순서를 정할 수 있다. 


public class CombineFilterStream {

	public static void main(String[] args) {
		// 1. 파일 생성
		File dataFile = new File("src\\book\\chapter19\\Ex07\\file1.data");
		
		// 2. 데이터쓰기 .write
		try (OutputStream os = new FileOutputStream(dataFile); 	// 기반 스트림 꼭 선언하기
			BufferedOutputStream bos = new BufferedOutputStream(os); //FilterStream (추가기능 제공, 단독으로는 사용 불가능)
			DataOutputStream dos = new DataOutputStream(bos);	//FilterStream (추가기능 제공, 단독으로는 사용 불가능)
					// DataOutputStream의 메서들를 사용할거면 DataOutputStream을 가장 마지막에 둬야 함
		){
			dos.writeInt(35);
			dos.writeDouble(5.8);
			dos.writeChar('A');
			dos.writeUTF("안녕하세용");
			dos.flush();
		} catch (Exception e) {}
		
		// 3. 데이터 읽기 .read
		try (InputStream is = new FileInputStream(dataFile);
			BufferedInputStream bis = new BufferedInputStream(is);
			DataInputStream dis = new DataInputStream(bis);
			){
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
		} catch (Exception e) {}
		

	}

}
