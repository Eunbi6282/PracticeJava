package book.chapter17.Ex06.Ex01;
/*
1. 학생수 :  임의의 값을 입력했을 때 ArrayList의 capacity 크기 지정

2. 점수 입력 : 입력받은 학생수에 따라서 점수 입력. ArrayList에 각각 객체를 저장
3. 점수 리스트 : ArrayList에 저장된 Student 객체를 가져와서 score출력
4. 분석 : 최고점 :       , 평균 점수 : 
5. 종료
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
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("----------------------------------------------------");
            System.out.println("선택>>> ");
            int selectNo = scanner.nextInt();
            
            if (selectNo == 1) {
				
			}else if (selectNo == 2) {
				System.out.println("학생수만큼 점수를 입력하시오 : ");
				
			}else if (selectNo == 3) {
				// ArrayList에 저장된 점수 출력
			}else if (selectNo == 4) {
				// 최대값, 평균 
			}else if (selectNo == 5) {
				// 빠져나오기
			}
            
		}
		

	}

}
