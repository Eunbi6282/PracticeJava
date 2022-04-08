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
		hm1.put(1, "데이터1");
		hm1.put(1, "데이터2");
		hm1.put(2, "데이터2");
		System.out.println(hm1);
		
		HashMap<A, String> hm2 = new HashMap<>();
		hm2.put(new A("첫번째"), "데이터1");
		hm2.put(new A("첫번째"), "데이터2");
		hm2.put(new A("두번째"), "데이터3");
		System.out.println(hm2);
		
		HashMap<B, String> hm3 = new HashMap<>();
		hm3.put(new B("첫번째"), "데이터1");
		hm3.put(new B("첫번째"), "데이터2");
		hm3.put(new B("두번째"), "데이터3");
		System.out.println(hm3);
	}

}
