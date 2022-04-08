package book.chapter17.Ex02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVSLinkedList {

	public static void main(String[] args) {
		// 1. �����͸� �߰��� �ð���
		List<Integer> aList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		long startTime = 0, endTime = 0;
		
		// 1-1 ArratList���� ������ �߰� �ð�
		startTime = System.nanoTime(); //������� �ð� ���� ���ϱ�(Systen.nanoTime())
		for (int i = 0; i < 100000; i++) {
			aList.add(0,i); //0���濡 i�� �ְڴ� ->0���濡 ��� ���� ���鼭 ���� '�ٲ�鼭' �ڷ� �з��� -> ���ϻ���
				// 0��° �濡 ����ؼ� 10����° ����
			//aList.add(i) -> ���ȣ ���� �׳� i���� �ִ´ٸ� �׳� ���� �ڷθ� ���� ���� ������ ���ϰ� ������ ����
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList���� ������ �߰� �ð�" + (endTime - startTime) + "ns");
		
		// 1-2 LinkedList���� ������ �߰� �ð�
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			linkedList.add(0,i); // LinkedList�� �ε��� ���ȣ�� �ƴ� ���� ����(link)�Ǿ� �ֱ� ������ �׳� ������ ���� ������ �� -> ����X
		}
		endTime = System.nanoTime();
		System.out.println("Linkedlist���� ������ �߰� �ð�" + (endTime - startTime) + "ns");
		
		// 2. �˻��� �� : ArrayList�� LinkedList���� ������.
			// 2-1 : ArrayList���� ������ �˻� �ð�
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			aList.get(i); // i�� 10���� get�ؿ�
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList���� ������ �˻� �ð�" + (endTime - startTime) + "ns");
		
			// 2-2 : LinkedList���� ������ �˻� �ð�
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			linkedList.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("Linkedlist���� ������ �˻� �ð�" + (endTime - startTime) + "ns");
	}

}
