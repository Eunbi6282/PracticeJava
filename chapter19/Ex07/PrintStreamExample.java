package book.chapter19.Ex07;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

// PrintStream : Filter Stream(추가기능을 제공하는 Stream), 기반 스트림 필요
	// 다양한 방법으로 출력, 출력에 특화된 Stream. flush()가 자동으로 호출됨
	// println(), print(), printf()
	// 파일출력, 콘솔출력, ..드읃ㅇ

public class PrintStreamExample {

	public static void main(String[] args) {
		//1. 파일객체 생성
		File outfile1 = new File("src\\book\\chapter19\\Ex07\\printStream1.txt");
		File outfile2 = new File("src\\book\\chapter19\\Ex07\\printStream2.txt");
		
		// 2. 파일에 출력  printStream (FileOutputStream(File)) 출력하는 것이므로 ㅒutputstream으
		try (OutputStream os1 = new FileOutputStream(outfile1);
			PrintStream ps = new PrintStream(os1); ){ //fileterStream, 기반스트림이 필요하다. 
			
			ps.println(5.8);  // double출력  <= 출력 후 라인개행
			ps.print(3 + "안녕" + 123456 + "\n"); 	// <= 출력 후 라인개행X, 개행문자 따로 넣어줌 => "\n"
			ps.printf("%d이 호출되었습니다.\n",7 );  // "%d" : int값을 호출
			ps.printf("%s %f", "안녕", 5.8);  //"%s" : string 호출, "%f" : double 호출
			// ps.flush()  <== 자동으로 호출
		} catch (Exception e) {}
		
		// 3. 파일에 출력   PrintStream(File)
		try (PrintStream ps = new PrintStream(outfile2);){
			ps.println(5.8);  // double출력  <= 출력 후 라인개행
			ps.print(3 + "안녕" + 123456 + "\n"); 	// <= 출력 후 라인개행X, 개행문자 따로 넣어줌 => "\n"
			ps.printf("%d이 호출되었습니다.\n",7 );  // "%d" : int값을 호출
			ps.printf("%s %f", "안녕", 5.8);  //"%s" : string 호출, "%f" : double 호출
			// ps.flush()  <== 자동으로 호출
		} catch (Exception e) {}
		
		// 4. 파일에 출력 PrintStream ps =System.out;
		try ( OutputStream os2 = System.out;
			PrintStream ps = new PrintStream(os2);){
			
			ps.println(5.8);  // double출력  <= 출력 후 라인개행
			ps.print(3 + "안녕" + 123456 + "\n"); 	// <= 출력 후 라인개행X, 개행문자 따로 넣어줌 => "\n"
			ps.printf("%d이 호출되었습니다.\n",7 );  // "%d" : int값을 호출
			ps.printf("%s %f", "안녕", 5.8);  //"%s" : string 호출, "%f" : double 호출
			// ps.flush()  <== 자동으로 호출
		}
		 catch (Exception e) {}
		
		System.out.println("======================================");
		
		// 5. 콘솔에 출력   PrintStream ps = SyS

	}

}
