package book.chapter15.Ex05;
// 객체 생성없이 익명객체를 사용해서 쓰레드 생성!!가장 많이 사용!!
	// 클래스x , 객체 생성x
public class CreateAndStartThread_M2C3 {

	public static void main(String[] args) {
		//Thread타입으로 Runnable인터페이스를 구현 -> Runnable()엔 start()가 없기 때문에
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				String[] strArrary = {"하나","둘","셋","넨","다섯"};
			}
		});
	}
}