package book.chapter19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/*
1. is1   <== InputStream 객체 (절대 경로로 접근 : - ms949) , 예외처리
2. is2   <== InputStream 객체 (상대 경로로 접근 : - utf8.txt), 예외처리(try ~ with resource로 예외처리)
			// try ~ with resource : close()를 자동으로 처리
*/
public class EX3_Exception1 {

	public static void main(String[] args) {
		System.out.println("======<절대경로-MS949>한글 변환X try catch 각각처리======");
		// 1. is1   <== InputStream 객체 (절대 경로로 접근 : - ms949) , 예외처리 (try catch 각각 적용)
		// 절대 경로로 가져옴
		File file1 = new File("C:\\peb\\JAVA\\src\\book\\chapter19\\Ex04\\FileInputStream1-MS949");
		
		//InputStream적용
		
		InputStream is1 = null; //is1이 try문 안에 선언되어 있으면 밑 구문들에서 사용 불가
		try {
			is1= new FileInputStream(file1);
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException 예외발생");
		}
		
		int data; 	// .read()로 읽어들이면 byte로 저장 -> int로 저장할 변수 설정
		
		// while문으로 루프 
		try {
			while ((data = (is1.read())) != -1) {		// byte값이 -1이 될때까지(마지막값까지)저장
				System.out.print((char)data);
			}
		} catch (IOException e) {
			System.out.println("IOException 예외발생");
		}finally {
			
			// 닫아주기
			try {
				is1.close();
			} catch (IOException e) {
				System.out.println("IOException 예외발생");
			}
		}
		
		System.out.println();
		System.out.println("======<절대경로-MS949>한글 변환O try catch 한번에처리, 자동 리소스 close()======");
		
		int data2;	// .read()로 읽어들이면 byte로 저장 -> int로 저장할 변수 설정
		
		//한글처리 #1: byte배열선언
		byte[] arr1 = new byte[100];  // byte배열 선언후 문자열 저장하고 String으로 불러 와야 함
		
		try (InputStream is2 = new FileInputStream(file1)){
			// try()에 객체 생성 -> resource자동 닫기 
				//AutoClosable의 close()를 구현한 클래스 여야한다.  => FileInputStream은 상속받고 있음
				// 내가 만든 객체할 대는 클래스 만들어서 따로 메서드를 구현해줘야 함
			
			// 한글처리 #2 : is.read(byte[]);
			while ((data2 = is2.read(arr1)) != -1) {  //arr1에 저장
				
				// 한글처리 #3 : new String(byte[], offset, length, "encoding")
				String str1 = new String(arr1,0,data2, Charset.forName("MS949"));
				System.out.println(str1);
			}
			
		} catch (Exception e) {
			System.out.println("예외발생");
		}
		
		System.out.println("======<상대경로>-UTF-8>한글 변환O try catch 한번에처리, 자동 리소스 close()======");
		// File객체 생성
		File file2 = new File("src\\book\\chapter19\\Ex04\\FileInputStream1-UTF-8");
		
		//InputStream 
		int data3 = 0;
		
		//한글처리 #1: byte[]
		byte[] arr2 = new byte[200];
		
		try (InputStream is3 = new FileInputStream(file2)){
				// 한글처리 #2 : is3.read(byte[]) // 배열에 저장
			while ((data3 = is3.read(arr2)) != -1) {
				// 한글처리 #3 :new String(byte[],offset, length, "encoding")
				String str2 = new String(arr2,0,data3,Charset.forName("UTF-8"));
				System.out.println(str2);
			}
		} catch (IOException e) {
			System.out.println("예외발생");
		}
		
	}

}
