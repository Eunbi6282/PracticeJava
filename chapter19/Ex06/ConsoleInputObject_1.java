package book.chapter19.Ex06;

import java.io.IOException;
import java.io.InputStream;

/*
 	System.in : Console에서 인풋을 받는 자바에서 제공해 주는 객체, InputStream
 		Windows : 콘솔에서 enter: \r\n
 		Mac : 콘솔에서 enter : \r
 	System.out : Console로 출력하는 객체	
 */

public class ConsoleInputObject_1 {

	public static void main(String[] args) {
		// 1. 콘솔에서 인풋받기 위한 객체 생성
		InputStream is1 = System.in;	//is1은 콘솔에서 인풋받아서 처리하는 객체
		
		System.out.println("영문을 입력하세요 >>>");
		
		int data;
		try {
			while ((data = is1.read()) != '\r') {  // 1byte를 읽어서 int data 변수에 할당
				// 콘솔에서 입력받은 값을 읽어서 enter가 나올때까지 돌림
				System.out.println("읽은 데이터 : " + (char)data + "남은 바이트 수 : " + is1.available());
			}
			//is1안에 있는 값 다 가져왔음
			System.out.println(data); //13 \r
			System.out.println(is1.read()); //10 \n =>마지막에 있는 \n꺼내주기 위해 반드시 .read()사용해줘야 함
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				is1.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
