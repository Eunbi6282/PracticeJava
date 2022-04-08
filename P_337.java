package book;
class Air{
	void print1() {
		System.out.println("Air클래스의 print1()");
	}
	
	void print2() {
		System.out.println("Air클래스의 print2()");
	}
}

class Ball extends Air{
	@Override
	void print1() {
		System.out.println("Ball클래스의 print1()");	//오버라이딩
	}
	
	void print2(int a) {
		System.out.println("Ball클래스의 print2()");
	}
}
public class P_337 {
	public static void main(String[] args) {
		// Air타입 선언, Air생성자 사용
		Air a = new Air();
		a.print1();
		a.print2();
		System.out.println();
		
		//Ball타입 선언, Ball생성자 사용
		Ball ball = new Ball();
		ball.print2();
		ball.print1();
		ball.print2(4); 	//Ball 클래스가 Air클래스를 상속하고 있으므로 Air클래스의 print2도 사용할 수 있다. 
	}

}
