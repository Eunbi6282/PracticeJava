package book.chapter19.Ex04;

public class Charactor_EX1 {

	public static void main(String[] args) {
		// 1. char ==> int�� ��ȯ
		
		char ch1 = 'A'; 	// char : 2byte
		System.out.println(ch1);  //A
		System.out.println((int)ch1); //65
		
		char ch1_1 = 'a';
		System.out.println(ch1_1);	//a
		System.out.println((int)ch1_1); //97
		
		char ch2 = 'Z';
		System.out.println(ch2);
		System.out.println((int)ch2); // �ƽ�Ű�ڵ�
		
		System.out.println();
		
		// 1-2. char�� ����(�ƽ�Ű�ڵ�)�� ������ �� �ִ�.
		char ch3 = 66;		// <== char�� ���������� ������ ����
		System.out.println(ch3);  //B ch3 ������ B���
		System.out.println((int)ch3);  //�ƽ�Ű�ڵ� ���
		System.out.println((char) ch3); //B
		
		// 2. int ===> char
		int ch4 = 65;
		System.out.println(ch4); //65
		System.out.println((char) ch4);  //A
	}

}
