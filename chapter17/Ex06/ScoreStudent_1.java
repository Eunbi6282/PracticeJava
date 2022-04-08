package book.chapter17.Ex06;
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
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("----------------------------------------------------");
            System.out.println("선택>>> ");
            int selectNo = scanner.nextInt();
            
            if (selectNo == 1) {
            	// 1. 학생수 :  임의의 값을 입력했을 때 ArrayList의 capacity 크기 지정
            	System.out.println("학생수를 입력하세요");
            	studentNum = scanner.nextInt();
            	arrayList = new ArrayList<Student>(studentNum); //studentNum를 인풋받은 값만큼 용량 늘림
				
			}else if (selectNo == 2) {
				// 2. 점수 입력 : 입력받은 학생수에 따라서 점수 입력. ArrayList에 각각 객체를 저장
				System.out.println("학생수 만큼 점수를 입력하시오 : " );
				
				if (studentNum == 0) {
					System.out.println("학생수를 먼저 입력하세요");
				}else {
					for (int i = 0; i < studentNum; i++) {
						System.out.println((i +1) + "번째 학생의 점수를 입력하세요");
						int score2 = 0; //2번째로 인풋받을 값
						Student student = new Student(score2);
						student.score = scanner.nextInt();
						arrayList.add(student);
						System.out.println("입력완료");
					}
				}
				
			}else if (selectNo == 3) {
				// ArrayList에 저장된 점수 출력
				for (int i = 0; i < arrayList.size(); i++) {
					System.out.println(arrayList);
					break;
				}
			}else if (selectNo == 4) {
				// 최고점, 평균 
				Student student = null;
				int maxScore = 0;
				int sum = 0; 
				// 방을 돌면서 i가 arrayList안에 들어있는 점수보다 크면 최대값
				for (int i = 0; i < arrayList.size(); i++) {
					if (arrayList.get(i).score > i) {  //arrayList.get(i)  => Student타입의 객체임. Student타입의 score가지고 오기
						arrayList.get(i).score = 
					}
					
					
				}
				System.out.println("최고점수 : " + maxScore);
				System.out.println("평균점수 : " + (float) sum / studentNum);
				
			}else if (selectNo == 5) {
				// 빠져나오기
			}
            
		}
		

	}

}
