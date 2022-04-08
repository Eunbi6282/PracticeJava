package book.chapter12;

import javax.net.ssl.SSLContext;

public class Ex_Phone {
	public static void main(String[] args) {
		//1. Ÿ���� SamSung�� ���
		SamSungPhone samSungPhone = new SamSungPhone();
		samSungPhone.flash();
		samSungPhone.receiveCall();
		samSungPhone.printLogo();	// �������̽����� ��ӵǾ� ������
		samSungPhone.sendCall();
		
		System.out.println("================");
		// 2. Ÿ���� PhoneInterface�� ��ĳ����
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
