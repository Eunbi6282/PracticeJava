package book.chap10;

import java.util.HashMap;

class A{
	String nameString;
	A (String nameString){
		this.nameString = nameString;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this.nameString == ((A)obj).nameString) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public String toString() {
		return nameString.toString();
	}
}

class B {
	String nameString;
	B(String nameString){
		this.nameString = nameString;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return nameString.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (this.nameString == ((B)obj).nameString) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public String toString() {
		return super.toString();
	}
}
public class HashcodeMethod {
	public static void main(String[] args) {
		HashMap<Integer, String> hm1 = new HashMap<>();
		hm1.put(1, "������1");
		hm1.put(1, "������2");
		hm1.put(2, "������2");
		System.out.println(hm1);
		
		HashMap<A, String> hm2 = new HashMap<>();
		hm2.put(new A("ù��°"), "������1");
		hm2.put(new A("ù��°"), "������2");
		hm2.put(new A("�ι�°"), "������3");
		System.out.println(hm2);
		
		HashMap<B, String> hm3 = new HashMap<>();
		hm3.put(new B("ù��°"), "������1");
		hm3.put(new B("ù��°"), "������2");
		hm3.put(new B("�ι�°"), "������3");
		System.out.println(hm3);
	}

}
