package book.chapter19.Ex07;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

// InputStream : 기반 스트림
	// int => 5555(문자형식으로 보냄) ==> 5555(문자로 받음) ==> int(int로 재조립) , 느린 속도

// DataInputStream : 추가 기능을 제공하는 스트림, 기반 스트림이 반드시 존재, 단독으로 사용할 수 없다. 
	// 다양한 포멧의 데이터를 빠르게 전송할 때 사용
	// 가져올 때 와 내보낼 때 같은 타입

public class DataInputStream_1 {

	public static void main(String[] args) {
		//데이터 포멧을 위한 파일 생성
		File dataFile = new File("src\\book\\chapter19\\Ex07\\file1.data");  // 확장자가 data
		
		// 데이터 쓰기(입력) OutputStream, DataOutputStream
		try(OutputStream os = new FileOutputStream(dataFile);
			DataOutputStream dos = new DataOutputStream(os);
		) {
			
			dos.writeInt(35);  // 원래 보낼 땐 각각의 문자로 보냈다가 받는곳에서 int로 재조립 => DataOutputStream(가져올 때 int, 내보낼 때 int)
			dos.writeDouble(5.8);
			dos.writeChar('A');
			dos.writeUTF("안녕하세요 반가워요 다음에 또 만낭");
			dos.flush();
			
		} catch (Exception e) {}
		
		// 데이터 읽기(DataInputStream)
		try (InputStream is = new FileInputStream(dataFile);
			DataInputStream dis = new DataInputStream(is);	
			){
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
			
		} catch (Exception e) {}
	}

}
