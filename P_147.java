package book;
public class P_147 {
	public static void main(String[] args) {
		//if
			int score = 72;
			if (score >= 80 && score < 90) {
				System.out.println("B����");
			} else if (score <= 100 && score >= 90) {
				System.out.println("A����");
			}else if (score >= 70 && score < 80) {
				System.out.println("C����");
			}else {
				System.out.println("F����");
			}
			
		//switch
			int score2 = 72;
			switch (score2/10) {
			case 10:
			case 9:
				System.out.println("A����");
				break;
			case 8:
				System.out.println("B����");
				break;
			case 7:
				System.out.println("C����");
				break;
			default:
				System.out.println("F����");
				break;
			
			}
			
			
			
	}

}
