package book.chapter17.Ex02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVSLinkedList {

	public static void main(String[] args) {
		// 1. 데이터를 추가시 시간비교
		List<Integer> aList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		long startTime = 0, endTime = 0;
		
		// 1-1 ArratList에서 데이터 추가 시간
		startTime = System.nanoTime(); //상대적인 시간 차이 구하기(Systen.nanoTime())
		for (int i = 0; i < 100000; i++) {
			aList.add(0,i); //0번방에 i를 넣겠다 ->0번방에 계속 값이 들어가면서 값이 '바뀌면서' 뒤로 밀려감 -> 부하생김
				// 0번째 방에 계속해서 10만번째 까지
			//aList.add(i) -> 방번호 없이 그냥 i값만 넣는다면 그냥 값이 뒤로만 쭉쭉 들어가기 때문에 부하가 생기진 않음
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList에서 데이터 추가 시간" + (endTime - startTime) + "ns");
		
		// 1-2 LinkedList에서 데이터 추가 시간
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			linkedList.add(0,i); // LinkedList는 인덱스 방번호가 아닌 서로 연결(link)되어 있기 때문에 그냥 연결을 끊고 끼어드는 것 -> 부하X
		}
		endTime = System.nanoTime();
		System.out.println("Linkedlist에서 데이터 추가 시간" + (endTime - startTime) + "ns");
		
		// 2. 검색시 비교 : ArrayList가 LinkedList보다 빠르다.
			// 2-1 : ArrayList에서 데이터 검색 시간
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			aList.get(i); // i를 10만번 get해옴
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList에서 데이터 검색 시간" + (endTime - startTime) + "ns");
		
			// 2-2 : LinkedList에서 데이터 검색 시간
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			linkedList.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("Linkedlist에서 데이터 검색 시간" + (endTime - startTime) + "ns");
	}

}
