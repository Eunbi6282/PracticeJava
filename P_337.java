package book;
class Air{
	void print1() {
		System.out.println("AirŬ������ print1()");
	}
	
	void print2() {
		System.out.println("AirŬ������ print2()");
	}
}

class Ball extends Air{
	@Override
	void print1() {
		System.out.println("BallŬ������ print1()");	//�������̵�
	}
	
	void print2(int a) {
		System.out.println("BallŬ������ print2()");
	}
}
public class P_337 {
	public static void main(String[] args) {
		// AirŸ�� ����, Air������ ���
		Air a = new Air();
		a.print1();
		a.print2();
		System.out.println();
		
		//BallŸ�� ����, Ball������ ���
		Ball ball = new Ball();
		ball.print2();
		ball.print1();
		ball.print2(4); 	//Ball Ŭ������ AirŬ������ ����ϰ� �����Ƿ� AirŬ������ print2�� ����� �� �ִ�. 
	}

}
