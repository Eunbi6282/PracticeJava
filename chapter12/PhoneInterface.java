package book.chapter12;

public interface PhoneInterface {
	int TIMEOUT = 10000; 	//  
	void sendCall();
	void receiveCall();
	
	default void printLogo() {
		System.out.println("�ΰ� ����մϴ�.");
	}
}
