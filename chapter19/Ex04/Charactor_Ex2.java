package book.chapter19.Ex04;
/*
A -Z까지의 아스키코드값 출력
출력결과
========================================
A, 65
B,66
...
Z,97

출력결과
========================================
a, 65
b,66
...
z,97

*/
public class Charactor_Ex2 {
	public static void main(String[] args) {
		// 배열에 저장
		System.out.println("대문자 출력결과" + "\n" + "===============================");
		char[] ch = new char[26];	//알파벳 A-Z까지 26개 방 만들어서 저장
		
		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char) ('A'+i);		// A부터 하나씩 증가해서 배열에 저장
			System.out.println(ch[i] + " , " + (int)(ch[i]));
		}
		
		System.out.println("소문자 출력결과" + "\n" + "===============================");
		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char) ('a'+i);		// A부터 하나씩 증가해서 배열에 저장
			System.out.println(ch[i] + " , " + (int)(ch[i]));
		}
		
	}

}
