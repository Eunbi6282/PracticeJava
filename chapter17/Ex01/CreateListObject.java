package book.chapter17.Ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CreateListObject {

	public static void main(String[] args) {
		//1. List���� Ŭ������ �����ڸ� ����Ͽ� ��ü ����
			//List�� �������̽��̹Ƿ� newŰ �ڿ� �� �� ����.(��ü���� �Ұ���, Ÿ�������� ����)
			// capacity : �޸��� ���� ũ�⸦ �Ҵ�, �⺻���� 10 / �����ڿ� �ִ� �� -> �޸𸮿� ���� �Ҵ�
			// size() : �濡 ����� ���� ����
		
		// List�� Ŭ����- > ArrayList, Vector, LinkedList
		List <Integer> aList1 = new ArrayList<Integer>(); // capacity = 10(�⺻��)
		List <Integer> aList2 = new ArrayList<Integer>(30); // capacity = 30, �޸� ���� Ȯ��
		
		List<Integer> aList3 = new Vector<Integer>();
		List<Integer>aList4 = new Vector<Integer>(30); // ���� Ȯ�� 30
		
		List<Integer>aList5 = new LinkedList<Integer>();
		// List<Integer>aList6 = new LinkedList<Integer>(40); LinkedList�� ���� ������ �Ҵ� ����. �⺻���� ������ ��� ����
		
		// 2. Arrays Ŭ������ ���� �޼��带 �̿��ϴ� ��� : ������ ũ�⸦ �ٲ��� ����. �迭�� ���� �氳��(������ ũ��)�� ������ �ʰ� ������
			// ����, ����, �Ϸ� 24�ð� ���� �������� ũ�Ⱑ �����Ǿ� �ִ� ��쿡 ���
		List<Integer> aList7 = Arrays.asList(1,2,3,4); //������ �� �Ҵ�
		List<String> aList8 = Arrays.asList("��","ȭ","��","��","��","��","��");
		aList7.set(1, 7); 	// set() :������ �ִ� ���� �߰�, index 1���� ���� 7���� ����
		//aList7.add(1, 5); // �����߻� -> �� ��ȣ�� 4���ε� ������ �� ������ 5�� �߰��Ѵ�> �ȵ�/ �������� ũ�⸦ Arrays.asList�� ����ؼ� �����߱� ������
		
		aList8.set(0,"��");
		System.out.println(aList7);
		System.out.println(aList8);

	}

}
