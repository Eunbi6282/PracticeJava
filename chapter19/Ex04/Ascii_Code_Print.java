package book.chapter19.Ex04;
/*
	ASCII �ڵ尪 ��� : 1byte(= 8bit) , ���� ó�� ��Ʈ�� ��ȣ��Ʈ, 7bit
		 1 ~ 32bit ���� : Ư���ϰ� ����� �� �� ���� Ư���� �ڵ� , �� ) null, ����� ����, �����(7��), ���� LF(10��)....
		 127 : delete.
		 
		 ���� ��� ������ 33����Ʈ ~ 126��Ʈ
		 ����, ����, Ư������ 
		 
		 ��� 
		 ========================================
		 ASCII(\t) ����(\t)(\t) ASCII(\t) ����
		 ========================================
		 33			!		  34		 &
		 35 		#		  36         $
		 .
		 .
		 .
		 126
*/

public class Ascii_Code_Print {

	public static void main(String[] args) {
		System.out.println("���" + "\n");
		System.out.println("======================================================");
		System.out.println("ASCII" + "\t" + "����" + "\t\t" + "ASCII" + "\t" + "����");
		System.out.println("======================================================");
		
		for (int i = 33; i < 126; i+=2) {   // 
			System.out.print(i + "\t" + (char)i + "\t\t");
			System.out.print ((i+1) + "\t" + (char)(i+1));
			System.out.println();
		}
	}

}
