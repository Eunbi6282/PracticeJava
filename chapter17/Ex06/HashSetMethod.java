package book.chapter17.Ex06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Set<E> : �������̽�, ���ȣ(index)�� ����. �ߺ��� ���� ���� �� ����.
	  - HashSet : �ߺ��� ���� ���� �� ����. ���� ������ ������� �������� �ʴ´�. (������ ���)
	  - LinkedHashSet : �ߺ��� ���� ���� �� ����. ��½� ������� ���(Link�� �����ֱ� ����)
	  - TreeSet : ����� �� ���� ���ĵǾ ����, ascending (��������) , descending(��������)
	 
	 */

public class HashSetMethod {
	public static void main(String[] args) {
		Set<String>hSet1 = new HashSet<String>(); 	// Set�� List�� ���������� �������̽��̹Ƿ� Ÿ�����θ� ��������(������ ���)
		
		// 1. add(E element)
		hSet1.add("��"); hSet1.add("��"); hSet1.add("��"); //
		System.out.println(hSet1); // "��"�� �ߺ����� ���������� Set�� Ư���� �ߺ����� ���� �ʴ´�.
		System.out.println(hSet1.toString()); //List�� ���������� toString()�� ������ �Ǿ��־� ��ü�� �� ��µȴ�.
		
		// 2. addAll(�ٸ� set��ü) : �ڽ��� Set�� �ٸ� Set�� ����� ���� �߰�
		Set<String> hSet2 = new HashSet<String>();
		hSet2.add("��"); hSet2.add("��");
		hSet2.addAll(hSet1);
		System.out.println(hSet2); // �߰��Ǳ� �ϴµ� ������ ���(HashSet)
		
		// 3. remove(Object o) : ������ ����, (Lisr�� ��쿣 �ε��� ���ȣ�� �����Ƿ� ���ȣ�ε� ���� ����)
		hSet2.remove("��");
		System.out.println(hSet2);
		
		// 4. clear() : ��� ����
		hSet2.clear();
		System.out.println(hSet2);
		
		// 5. isEmpty() : ��������� true, ������� ������ false
		System.out.println(hSet2.isEmpty());
		
		// 6. contains (Object o) : ���� Set�� �����ϸ� true, �������� ������ false -> Set���� ����
		Set<String> hSet3 = new HashSet<String>();
		hSet3.add("��"); hSet3.add("��"); hSet3.add("��");
		System.out.println(hSet3); // �����ϰ� ��µ�
		System.out.println(hSet3.contains("��")); //���ԵǾ� �ִ��� -> true
		System.out.println(hSet3.contains("��")); // ���ԵǾ� �ִ��� -> false
		
		System.out.println("====iterator()�� ����� ���====");
		// 7. iterator() : Set�� index�� ������ �ʴ´�. for���� ���ȣ�� ���� ����ϱ� ������ for�� ��� ����
			// but EnhancedFor���� ��� ����
		// iterator : ��ȸ��, Set�� ������ ��ȸ�ϸ鼭 ��½����ش�. 
			//hasNext() : Set�� ���� �����ϸ� true, �������� ������ false
			//next(): ���� ���� ����ϰ� ���������� �̵�
		Iterator<String> iterator = hSet3.iterator(); // ����Ϸ��� ��ü�� iterator()���� ��������� ��
			//Ŭ����<E> ������ü = Set��ü.iterator
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		System.out.println("====EnhancedFor���� ����ؼ� ���=====");
		for (String k : hSet3) {
			System.out.println(k + " ");
		}
		
		// 8. toArray() : set�� ���� �迭�� ������.
			// �⺻������ toArray()�� ObjectŸ������ ���� -> �ٿ�ĳ���� �ʿ�
		Object[]objects = hSet3.toArray(); //set�� �ִ� ������ �迭�� ����
		System.out.println(Arrays.toString(objects));
		
		// 9. toArray(T[] t) :�ٷ� �ٿ�ĳ���� �� �� ���
		String[] strings = hSet3.toArray(new String[0]);  //StringŸ���� �迭�� �ٲ�
			// 0 : ���� ũ�⸦ ����(�Ϲ������� 0���� ����)
		System.out.println(Arrays.toString(strings));
		
		// 10. iterator�� ���
		Set<Integer> intSet1 = new HashSet<Integer>();
		intSet1.add(10); intSet1.add(50); intSet1.add(100); intSet1.add(0);
		
		Iterator<Integer> i1 = intSet1.iterator();
		//iterator���
		while(i1.hasNext()) {
			System.out.print(i1.next() + " ");
		}
		
		System.out.println();
		
		//EnhancedFor�� ���
		for(Integer integer : intSet1) {
			System.out.print(integer + " ");
		}
		
		
		
		
	}

}
