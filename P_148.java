package book;
public class P_148 {
	public static void main(String[] args) {

		//if
		for (int i = 0; ; i++) {
			if(i % 2 == 1) {
				continue;
			}
			if(i > 10) {
				break;
			}
			System.out.println(i);
		}
		
		int i = 10;
		while (i > 0) {
			System.out.println(i);
			i-=2;
		}
		
		
		
	}

}
