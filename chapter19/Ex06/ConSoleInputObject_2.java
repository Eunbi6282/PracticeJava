package book.chapter19.Ex06;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

// Windows : 콘솔 , 메모장에서 enter. \r\n, \r생략이 될 수 있다. \n만으로도 처리가 가능하다. 

public class ConSoleInputObject_2 {

	public static void main(String[] args) {
		InputStream is = System.in;	// is -> 콘솔을 통해서 인풋받겠다.
		
		System.out.println("영문만 입력하세요 >>>");
		
		int data;
		try {
			// 1. 한바이트 단위 읽기 (.read())
			while ((data = is.read()) != '\r') {  // is.read()호출 될 때 콘솔에서 인풋을 대기 
				System.out.print((char)data);
			}
			is.read();  // 10 <= \n이 남아있음!!! // 버퍼(RAM)에 남아있음. 끄집어 내줘야 함
				// \n을 처리 안해주면 다음 read()에서 \n이 들어가 버림
			
			System.out.println();
			System.out.println("==============");
			
			// 2. n-byte 읽기 (한꺼번에 가져오기)
			byte[] arr1 = new byte[100]; // 콘솔에서 배열에 저장될 때 \r\n까지 들어간다. 
			int count1 = is.read(arr1); // count1은 100byte씩
				// 100,100,30(100보다 작은 값은 작게 받아들임,) , -1(enter)을 찍을 대까지 100byte
				// count1 -> 배열에서 읽은 값의 개수를 저장
			for (int i = 0; i < count1; i++) {  // 0방버터 값의 개수까지 
				System.out.print((char)arr1[i]); // 0번방부터 돌면서 배열 출력
			}
			System.out.println(" : count1 = " + count1); // count1(배열에 저장된 .read()하나하나 돌면서 센 개수)
				//콘솔에서 배열에 저장될 때 \r\n까지 들어가기 때문에 +2 한값이 count1에 개수로 들어간다. 
			System.out.println("====================");
			
			
			// 3. 
			int count2;
			count2 = is.read(arr1);  // 개수출력
			System.out.println(new String(arr1,0,count2,Charset.defaultCharset())); // 한글도 출력 가능
			// is.read(); // 버퍼에서 빼지 않아야 한다. (배열 내부에 \r\n 이 들어가 있기 때문에, 따로 빼지 않아도 된다.)
				// byteStream의 경우 엔터 값이 메모리에 저장되어 있기 때문에 끄집에ㅓ 내줘야 함. 
			System.out.println("========================");
			
			// 4. n -byte 단위로 묶고 (length 만큼 읽어와서 byte[] offset위치에서 저장
			byte[] arr2 = new byte[8];
			int offset = 3;
			int length = 5;
			
			int count3 = is.read(arr2,offset,length);
			for (int i = 0; i < offset + length; i++) {
				
			}
			
		} catch (IOException e) {
		}finally {
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
