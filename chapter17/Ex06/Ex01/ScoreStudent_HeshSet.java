package book.chapter17.Ex06.Ex01;
/*
1. �л��� :  ������ ���� �Է����� �� ArrayList�� capacity ũ�� ����

2. ���� �Է� : �Է¹��� �л����� ���� ���� �Է�. ArrayList�� ���� ��ü�� ����
3. ���� ����Ʈ : ArrayList�� ����� Student ��ü�� �����ͼ� score���
4. �м� : �ְ��� :       , ��� ���� : 
5. ����
*/

import java.util.ArrayList;
import java.util.Scanner;

class Student{
	int score;
	
	public Student(int score) {
		this.score = score;
	}
	
}

public class ScoreStudent_HeshSet {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> arrayList = new ArrayList<Student>();
		
		
		boolean run = true;
		int studentNum = 0;
		
		while (run) {
			System.out.println("----------------------------------------------------");
            System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
            System.out.println("----------------------------------------------------");
            System.out.println("����>>> ");
            int selectNo = scanner.nextInt();
            
            if (selectNo == 1) {
				
			}else if (selectNo == 2) {
				System.out.println("�л�����ŭ ������ �Է��Ͻÿ� : ");
				
			}else if (selectNo == 3) {
				// ArrayList�� ����� ���� ���
			}else if (selectNo == 4) {
				// �ִ밪, ��� 
			}else if (selectNo == 5) {
				// ����������
			}
            
		}
		

	}

}
