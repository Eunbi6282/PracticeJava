package book.chapter19.Ex04;

public class Charactor_EX1 {

	public static void main(String[] args) {
		// 1. char ==> int로 변환
		
		char ch1 = 'A'; 	// char : 2byte
		System.out.println(ch1);  //A
		System.out.println((int)ch1); //65
		
		char ch1_1 = 'a';
		System.out.println(ch1_1);	//a
		System.out.println((int)ch1_1); //97
		
		char ch2 = 'Z';
		System.out.println(ch2);
		System.out.println((int)ch2); // 아스키코드
		
		System.out.println();
		
		// 1-2. char에 정수(아스키코드)로 저장할 수 있다.
		char ch3 = 66;		// <== char에 정수값으로 저장이 가능
		System.out.println(ch3);  //B ch3 찍으면 B출력
		System.out.println((int)ch3);  //아스키코드 출력
		System.out.println((char) ch3); //B
		
		// 2. int ===> char
		int ch4 = 65;
		System.out.println(ch4); //65
		System.out.println((char) ch4);  //A
	}

}
