package book.chapter17.Ex06;
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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
		public String toString() {
			return score + " ";
		}
	
	
}

public class ScoreStudent_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> arrayList = null; 
		
		
		boolean run = true;
		int studentNum = 0;
		
		while (run) {
			System.out.println("----------------------------------------------------");
            System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
            System.out.println("----------------------------------------------------");
            System.out.println("����>>> ");
            int selectNo = scanner.nextInt();
            
            if (selectNo == 1) {
            	// 1. �л��� :  ������ ���� �Է����� �� ArrayList�� capacity ũ�� ����
            	System.out.println("�л����� �Է��ϼ���");
            	studentNum = scanner.nextInt();
            	arrayList = new ArrayList<Student>(studentNum); //studentNum�� ��ǲ���� ����ŭ �뷮 �ø�
				
			}else if (selectNo == 2) {
				// 2. ���� �Է� : �Է¹��� �л����� ���� ���� �Է�. ArrayList�� ���� ��ü�� ����
				System.out.println("�л��� ��ŭ ������ �Է��Ͻÿ� : " );
				
				if (studentNum == 0) {
					System.out.println("�л����� ���� �Է��ϼ���");
				}else {
					for (int i = 0; i < studentNum; i++) {
						System.out.println((i +1) + "��° �л��� ������ �Է��ϼ���");
						int score2 = 0; //2��°�� ��ǲ���� ��
						Student student = new Student(score2);
						student.score = scanner.nextInt();
						arrayList.add(student);
						System.out.println("�Է¿Ϸ�");
					}
				}
				
			}else if (selectNo == 3) {
				// ArrayList�� ����� ���� ���
				for (int i = 0; i < arrayList.size(); i++) {
					System.out.println(arrayList);
					break;
				}
			}else if (selectNo == 4) {
				// �ְ���, ��� 
				Student student = null;
				int maxScore = 0;
				int sum = 0; 
				// ���� ���鼭 i�� arrayList�ȿ� ����ִ� �������� ũ�� �ִ밪
				for (int i = 0; i < arrayList.size(); i++) {
					if (arrayList.get(i).score > i) {  //arrayList.get(i)  => StudentŸ���� ��ü��. StudentŸ���� score������ ����
						arrayList.get(i).score = 
					}
					
					
				}
				System.out.println("�ְ����� : " + maxScore);
				System.out.println("������� : " + (float) sum / studentNum);
				
			}else if (selectNo == 5) {
				// ����������
			}
            
		}
		

	}

}
