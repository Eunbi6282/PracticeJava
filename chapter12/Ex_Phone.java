package book.chapter12;

import javax.net.ssl.SSLContext;

public class Ex_Phone {
	public static void main(String[] args) {
		//1. 타입이 SamSung인 경우
		SamSungPhone samSungPhone = new SamSungPhone();
		samSungPhone.flash();
		samSungPhone.receiveCall();
		samSungPhone.printLogo();	// 인터페이스에서 상속되어 내려옴
		samSungPhone.sendCall();
		
		System.out.println("================");
		// 2. 타입을 PhoneInterface로 업캐스팅
		PhoneInterface s2 = new SamSungPhone();
		s2.printLogo();
		s2.receiveCall();
		s2.sendCall();
		
		if (s2 instanceof SamSungPhone) {
			SamSungPhone s3 = new SamSungPhone();
			s3.flash();
			
		}

	}

}
