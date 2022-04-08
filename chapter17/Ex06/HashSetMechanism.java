package book.chapter17.Ex06;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

//Set : �ߺ��� ���� ���� �� ����.
	//equals(), hashCode() �޼��尡 ���� �Ǿ� �־�� �Ѵ�.
	// String, Integer Ŭ�������� equals() �޼���� hashCode()�� ������ �ǵ���ִ�.
	// Ư�� ��ü�� Set�� ������ ��� �ߺ� ������ ���� ���ϵ��� �ϱ� ���ؼ��� equals()�� hashCode()�޼��带 ������ �ؾ� �Ѵ�.
	// ObjectŬ������ equals()�� hashCode()
		// ObjectŬ������ equals() �޼���� ==�� ����.
		// == �� Stack�޸��� ���� ��
	
//equals(), hashCode()�޼��尡 ������ ���� ���� ����
class A{
	int data;
	public A(int data) {
		this.data = data;
	}
}

//equals()�� ������, hashCode() ������x
class B{
	int data;
	
	public B(int data) {
		this.data = data;
	}
	@Override
	public boolean equals(Object obj) {  //obj�� bŸ���� �����ϰ� ���� ���� �ٿ�ĳ����
		if (obj instanceof B) {
			if(this.data == ((B)obj).data) {  //��ü���� data �ʵ�� ������ ������ data�� ���� ������ ��, 
					// obj�� ObjectŸ������ �����Ƿ� BŸ������ �ٿ�ĳ�����ؼ� ũ�� ������� ��
				return true;
			}
		}
		return false;
	}
}

//equals() , hashCode() ��� ������
class C{
	int data;
	public C (int data) {
		this.data = data;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof C) {
			if(this.data == ((C)obj).data) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return data;
	}
}
	

public class HashSetMechanism {

	public static void main(String[] args) {
		
		// CŬ���� -> equals(), hashCode() ��� ������ 
		Set<C> hashSet1 = new HashSet<C>();
		C c1 = new C(3);
		C c2 = new C(3);
		System.out.println(c1 ==c2); //false -> ������ �ּҰ� (��ü�� ���ÿ� ���� �ٸ� �濡 �����)
		System.out.println(c1.equals(c2)); // true -> ��ü�� data�ʵ��� ���� ���ϵ��� ������ �Ǿ� ����
		System.out.println(c1.hashCode() + " , " +  c2.hashCode());  // �� ��ä�� �ؽ��ڵ� ���� ����
		
		hashSet1.add(c1);
		hashSet1.add(c2);
		System.out.println(hashSet1.size()); // 1 -> �� ��ü�� ���� ����(equals() �� hashCode()�� ���� �Ǿ� �ֱ� ������)
		

	}

}
