package book;

public class P_149 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				if(i == 2) {
					continue;
				}
				if(j == 1) {
					break;
				}
				System.out.println("A");
			}
		}
		
		System.out.println();
		System.out.println("====================");
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				if(i == 3) {
					break;
				}if(j == 2) {
					break;
				}
				System.out.println(i);
			}
		}
	}
}