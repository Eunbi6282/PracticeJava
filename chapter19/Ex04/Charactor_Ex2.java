package book.chapter19.Ex04;
/*
A -Z������ �ƽ�Ű�ڵ尪 ���
��°��
========================================
A, 65
B,66
...
Z,97

��°��
========================================
a, 65
b,66
...
z,97

*/
public class Charactor_Ex2 {
	public static void main(String[] args) {
		// �迭�� ����
		System.out.println("�빮�� ��°��" + "\n" + "===============================");
		char[] ch = new char[26];	//���ĺ� A-Z���� 26�� �� ���� ����
		
		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char) ('A'+i);		// A���� �ϳ��� �����ؼ� �迭�� ����
			System.out.println(ch[i] + " , " + (int)(ch[i]));
		}
		
		System.out.println("�ҹ��� ��°��" + "\n" + "===============================");
		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char) ('a'+i);		// A���� �ϳ��� �����ؼ� �迭�� ����
			System.out.println(ch[i] + " , " + (int)(ch[i]));
		}
		
	}

}
