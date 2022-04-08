package book.chapter17.Ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethod_1 {
	
	public static void main(String[] args) {
		/* List�� �޼���(13��)
	 	1. ArrayLis
	 	2. Vector
	 	3. LinkedList*/
		
		List<Integer> aList1 = new ArrayList<Integer>();
		
		// 1. .add(E element) : ������ ���� ���� �߰�
		aList1.add(3); aList1.add(4); aList1.add(5);
		System.out.println(aList1); // List�� toString()�� ������ �Ǿ� �־� ��ü�� �ٷ� ����� ����
		System.out.println(aList1.size()); //3
		
		// 2. add(int index, E element)
		aList1.add(1,6); // ���ȣ 1���� 6�� �߰� -> ������ ������ �ڷ� �и�
		System.out.println(aList1);
		
		// 3. addAll (�Ǵٸ� ����Ʈ�� ��ü�� �����ؼ� �߰�)
		List<Integer>aList2 = new ArrayList<Integer>();
		aList2.add(1);
		aList2.add(2);
		System.out.println(aList2);
		
		aList2.addAll(aList1);
		System.out.println(aList2); //aList1�� ����� ���� �����ؼ� aList2�� �߰���
		
		// 4. addAll(int index, E element)
		List<Integer> aList3 = new ArrayList<Integer>();
		aList3.add(1);
		aList3.add(2);
		
		aList3.addAll(1, aList3); // 1���濡 �ڱ� ��ü�� ���� �߰� -> ���� ������ �ڷ� �и�
		System.out.println(aList3);
		aList1.addAll(2, aList3);
		System.out.println(aList1);
		
		// 5. set(int index, E element) : Ư�� ���ȣ�� ���� ����
		aList3.set(1, 5); // 1������ ���� 5�� �����ض�
		aList3.set(3, 6); 
		System.out.println(aList3);
		
		// 6. remove (int index) : Ư�� ���ȣ�� ���� ����, ���ȣ�� �����ϴ� ����!!!!!!
		aList3.remove(1); // ���ȣ 1���� �ִ� ���� ����, ���� ������ ������ �����
		System.out.println(aList3);
		
		// 7. remove (Object o) :������ ����
		aList3.remove(new Integer(2)); // ������ ������ �� �� �ִ�. �� 2�� ������
		System.out.println(aList3);
		
		// 8. clear() : ��� ����
		aList3.clear();
		System.out.println(aList3);
		
		// 9. isEmpty() : ���� ������� true, �׷��� ������false
		System.out.println(aList3.isEmpty()); //true
		
		// 10. get(int index) : ���ȣ�� ���� ���
		aList3.add(1); aList3.add(2); aList3.add(3);
		System.out.println(aList3.get(0));
		System.out.println(aList3.get(1));
		System.out.println(aList3.get(2));
		
		System.out.println("==================");
		
		// 11. toArray() : List(����Ʈ) ---> Array(�迭)�� ��ȯ
		System.out.println(aList3); //List�϶��� toString()�� ������ �Ǿ� �ֱ� ������ ���� ����Ѵ�.
		
		Object[] objects = aList3.toArray(); // �⺻������ toArray()�޼���� ObjectŸ������ ������ ��
		System.out.println(Arrays.toString(objects)); 
		//�ٿ�ĳ���� �ʿ� -> ObjectŸ������ ���ǵǾ� �����Ƿ� 
		// �迭�� ����� ���� toString()�� ���ǵǾ� ���� �ʱ� ������ for������ ����ϰų�, Arrays.toString()�� ����ؾ� �Ѵ�.
		
		// 12-1 toArray(T[] t) => tŸ������ �ٷ� ��ȯ ����
			// Integer�� �ٷ� ĳ����, �ٿ� ĳ���� �ʿ�x
		Integer[] integer1= aList3.toArray(new Integer[0]);
			// Integer[0] -> ���� ũ�⺸�� �۰� �־��� : ���� ���� ����Ǿ� �ִ� �������� ���
		System.out.println(Arrays.toString(integer1));
		// toArray�� �⺻������ ObjectŸ���̾ Integer�� �ٿ�ĳ���� �ʿ�, �׷��� Integer[] integer(toArrat(T[] t)�� ����ؼ� �ٷ� �ٿ� ĳ����
		
	}

}
