package book;

class P{
	int m1, m2, m3, m4;
	
	P(){
		m1 = 1; m2 = 2; m3 = 3; m4 = 4;
	}
	
	P(int a){
		this();
		m1 = a;
	}
	P(int a, int b){
		this(a);
		m2 = b;
	}
	void print() {
		System.out.print(m1 + " ");
		System.out.print(m2 + " ");
		System.out.print(m3 + " ");
		System.out.print(m4 + " ");
		System.out.println();
	}
}
public class P_261 {

	public static void main(String[] args) {
		P p = new P();
		P p2 = new P(10);
		P p3 = new P(10, 20);
		p.print();
		p2.print();
		p3.print();
		
		
		
	}

}
