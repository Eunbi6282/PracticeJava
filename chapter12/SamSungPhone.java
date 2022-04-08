package book.chapter12;
// 삼성 폰만의 특징 설정함
public class SamSungPhone implements PhoneInterface{
	@Override
	public void sendCall() {
		System.out.println("띠리리링");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화받으세요");
	}

	//추가적인 SamSungPhone만의 기능을 추가
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}
}
