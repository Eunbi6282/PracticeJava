package book;

import java.util.Arrays;

class Q4{
	void abc(int m) {
		m = 8;
		System.out.println(m);
	}
	void bcd(int[]n) {
		n[0] = 4; 
		n[1] = 5;
		n[2] = 6;
	}
}
public class P265 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q4 q4 = new Q4();
		int m = 5;
		int[] n = {1,2,3};
		q4.abc(m);
		System.out.println(m);
		
		q4.bcd(n);
		System.out.println(Arrays.toString(n));
	}

}
