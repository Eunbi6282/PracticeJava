package book.chapter19.Ex08;

import java.io.InputStreamReader;

public class InputStreamReader_2 {
	public static void main(String[] args) {
		// 1. 콘솔 입력(MS949) : Default CharSet, byteStream(콘솔로 내보내는 것, 콘솔에서 인풋받는 값 모두 byteStream)
			// InputStreamReader : byte ==> char변환
			// isr은 변환된 char
		try {
			InputStreamReader isr = new InputStreamReader(System.in,"MS949");  // 콘솔에서 입력한 값은 byte이므로 char로 변환 필요
			// 콘솔에서 두번째 값도 받아야 하므로 자동으로 close() 안되도록 try()에 넣어 AUTOclose 하지 않고 구문 속으로 넣음
			
		 System.out.println("한글을 원하는 대로 입력하세요 >>>");
		 
		 int data;
		 while ((data = isr.read()) != '\r') { // 콘솔에 받는 값이므로 \r까지 값을 받음
			System.out.print((char)data);
		}
		 System.out.println();
		 System.out.println(isr.getEncoding()); //encoding타입 출력
		} catch (Exception e) {} 
		
		System.out.println("===========================================");
		
		// 2. 콘솔입력 (UTF-8) 
		try (InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");){
			
			System.out.println("한글을 원하는 대로 입력하세요2 >>>");
			
			int data;
			while ((data = isr.read()) != '\r') {		// 콘솔입력 대기
				System.out.print((char)data);
			}
			
			System.out.println();
			System.out.println(isr.getEncoding());
			
		} catch (Exception e) {}
	}

}
