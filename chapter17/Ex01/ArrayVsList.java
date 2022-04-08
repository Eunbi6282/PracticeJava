package book.chapter17.Ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// java.lang ��Ű���� Ŭ���� ���� import�� �ʿ����� �ʴ�.
/*
  �÷��� : ������ �ڷ����� ����, ���� ũ�Ⱑ �������� ��ȭ
  �迭 : ������ �ڷ����� ����, ���� ũ�Ⱑ �����Ǿ� �ִ�. �迭 ������ ���� ũ�⸦ �����ϸ� ���� �Ұ�
  
  	List<E> : �������̽� / ���ʸ����� ���� -> �پ��� Ÿ���� �� �� �ִ�.(String, Object...)
  	������ Ư¡ : �ε��� (���ȣ)�� ������ �ִ�. ���� ũ��� �������� ��ȭ�Ѵ�.
  	
  	List�������̽��� ������ �ڽ� Ŭ����
  	- ArrayList<E> : �̱� ������ȯ�濡�� ���. �˻��� ������ �߰��ϰų� ������ ������. 
  	- Vactor<E> : ��Ƽ ������ ȯ�濡�� ���. ��� �޼��尡 ����ȭ �Ǿ� �ִ�.
  	- LinkedList<E> : �˻��� ������ ���� �߰��� ������ ������.
 */

public class ArrayVsList {

	public static void main(String[] args) {
		// 1. �迭
		String[] array = new String[] {"��", "��","��","��", "��","��","��"};
		System.out.println(array.length); //7
		
		array[2] = null;
		array[5] = null;
		System.out.println(array.length); // 7 -> �迭�� ���� �����ص� ���� ũ�Ⱑ �״��
		
		// 1. Arrays.toString(�迭����)
		System.out.println(Arrays.toString(array));
		
		// (1) for�� ����ؼ� ���
		for (int i = 0; i < array.length; i++) {
			if(i == array.length -1) { // ������ ���ȣ������ " , "������� ����
				System.out.print(array[i]); 
			}else {
				System.out.print(array[i] + " , ");
			}
		}
		System.out.println();
		
		System.out.println("======================");
		
		// 2. List : �������̽� , ��ü ������ �� �� ����. Ÿ������ ���� ����
		List<String> aList = new ArrayList<String>();
		List<String> aList2 = new ArrayList<>();
		List<String> aList3 = new ArrayList<>();
			
			//List���� ���� ���� ��� : aList.size() 
		System.out.println(aList.size()); // ó�� ���� ũ�� -> 0
		
			// List�� �� �Ҵ��ϱ� : .add("��") ��� -> ���� �������� ���� �߰��Ѵ�.
		aList.add("��"); aList.add("��"); aList.add("��"); aList.add("��");
		
			//List�� ����� �������� ���� ���ϱ�
		System.out.println(aList.size()); // 4
		
			//List�� ����� ���� ���� : aList.remove("������ ����")
		aList.remove("��"); // "��"����
		System.out.println(aList.size()); //4-> 2
		
			//List�� index�� ������ �ִ�.
			// (1)
		for (int i = 0; i < aList.size(); i++) {   //aList.size() : ���� ���� ���
			aList.get(i);	// aList.get(i) :���� ���� ���
			System.out.print(aList.get(i) + " ");
		}
		System.out.println();
		 	// (2) ��ü�� toString()�� ȣ���ؼ� ���
		System.out.println(aList); // List�� toString()�� ������ �Ǿ��־� ��ü�̸����� �ٷ� �� ��� ����
		System.out.println(Arrays.toString(array)); //-> �迭�� ��� Arrays.toString()���� ���� ȣ���ؾ� ��
	}

}
