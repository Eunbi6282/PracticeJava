package book.chapter19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

import javax.imageio.stream.FileImageInputStream;

public class FileInputStream_2 {

	public static void main(String[] args) {
		
		// 입력파일 생성
		File file1 = new File("src\\book\\chapter19\\Ex04\\FileInputStream1-MS949"); // 상대경로
		
		System.out.println("======(1) byte단위 읽기(한바이트씩 읽어서 처리), 한글처리X======");
		InputStream is1 = null;  // 선언과 적용을 나눠서 (finally에 사용하기 위해서)
		
		// 2. (1) byte단위 읽기(한바이트씩 읽어서 처리)
		try {
			is1 = new FileInputStream(file1);
			int data;  // 1btye씩 읽어오는 값을 int 형으로 저장
			while ((data = is1.read()) != -1) {   // 한바이트씩 읽어서 처리 -> 마지막 값이 될 때까지 저장
				System.out.print((char)data);  //문자로 보이도록 (char)변환
			}
		} catch (IOException e) {
			System.out.println("예외발생");
		}finally { 	// 닫아주기!!!!!!
			try {
				is1.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println();
		System.out.println("======(2) try(weith resorce){}로 구현하기 , 한글처리O======");
		
		// 한글처리#1 : byte[]
		byte[] arr1 = new byte[100];
		
		try (InputStream is2 = new FileInputStream(file1);){  //try()에 객체를 생성함으로써 자동 리소스 닫음 -> 따로 닫아줄 필요 없음
			int data = 0;
			//한글 처리 #2:.read(byte[])
			while ((data = is2.read(arr1)) != -1) {
				// 한글처리 #3 : new String(byte[], offset, length,"encoding")
				String str = new String(arr1, 0, data, Charset.forName("MS949"));
				System.out.println(str);
			}
		} catch (IOException e) {
			System.out.println("예외 발생");
		}
		
		
		System.out.println();
		System.out.println("====== n-byte단위로 읽기 (byte[]의 처음 위치에서부터 읽은 데이터 저장) : 여러 바이트를 배열에 담아 동시에 읽어서 처리 속도가 빠름======");
			// 배열의 방의 크기만큼 읽어 들여서 byte배열에 저장
			// 한글처리 가능
		
		 ;
		try(InputStream is3 =new FileInputStream(file1)) {
			byte[] arr2 = new byte[9];  // 배열방 9개, 0~8까지 //9byte씩 읽는다. 
			int count1 = 0;
			
			while ((count1 =is3.read(arr2)) != -1) {
				for (int i = 0; i < count1; i++) {
					System.out.print((char)arr2[i]);
				}
				System.out.println(" : count1 = " + count1);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
			
		}
		
		
//		try (InputStream is3 = new FileInputStream(file1);){  //try()에 객체를 생성함으로써 자동 리소스 닫음 -> 따로 닫아줄 필요 없음
//			//한글 처리 #2:.read(byte[])
//			while ((count1 = is3.read(arr2)) != -1) {
//				// 한글처리 #3 : new String(byte[], offset, length,"encoding")
//				String str = new String(arr2, 0, count1, Charset.forName("MS949"));
//				System.out.println(" : count1 = " + str);
//			}
//		} catch (IOException e) {
//			System.out.println("예외 발생");
//		}
		
		
		

	


}
