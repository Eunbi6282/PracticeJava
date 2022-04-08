package book;


class Q5{
	static void averageScore(int...vlaues) {
		double avg;
		int sum = 0;
		for (int i = 0; i <= vlaues.length; i++) {
			sum += i;
		}
		avg = (double) sum/vlaues.length;
		System.out.println(avg);
	}
}
public class P_265 {
	public static void main(String[] args) {
		Q5 q5 = new Q5();
		q5.averageScore(1);
		q5.averageScore(1,2);
		q5.averageScore(1,2,3);
		q5.averageScore(1,2,3,4);
	}

}
