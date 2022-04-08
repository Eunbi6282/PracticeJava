package book;
class AAAAB{
	boolean a;
	int b;
	double c;
	String dString;
	
	void abc() {
		System.out.println(b + c);
		System.out.println(c + dString);
		System.out.println(dString + a);
	}
}
public class P_262 {

	public static void main(String[] args) {
		AAAAB a = new AAAAB();	//°´Ã¼ »ý¼º
		
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(a.c);
		System.out.println(a.dString);
		a.abc();

	}

}
