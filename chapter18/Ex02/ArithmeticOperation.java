package book.chapter18.Ex02;

import java.nio.channels.AcceptPendingException;
import java.util.Scanner;

// 1. ��ĳ�ʸ� ����ؼ� double�� �� ���� ��ǲ�޽��ϴ�.
// 2. (1) ���ٽĻ���ؼ� ��ǲ���� �� ���� + ,- ,* ,/ (��Ģ����) �����ؼ� ���
//	  (2) �������̽��� ������ �ڽİ�ü�� ����ؼ� ��ǲ���� �� ���� + ,- ,* ,/ (��Ģ����) �����ؼ� ���
//	  (3) �͸� �̳�Ŭ������ ����ؼ� ��ǲ���� �� ���� + ,- ,* ,/ (��Ģ����) �����ؼ� ���

interface Arithmetic{
	void arithmeticOpr(double a, double b);
}

class B_arithmetic implements Arithmetic{
	@Override
	public void arithmeticOpr(double a, double b) {
		if (b != 0) {
			System.out.println("<�ڽ�Ŭ����> �� ���� ���� : " + (a + b));
			System.out.println("<�ڽ�Ŭ����> �� ���� ���� : " + (a - b));
			System.out.println("<�ڽ�Ŭ����> �� ���� ���� : " + (a * b));
			System.out.println("<�ڽ�Ŭ����> �� ���� ���� ���� : " + (a / b));
		}
		if (b == 0) {
			try {
				System.out.println("<�ڽ�Ŭ����> �� ���� ���� : " + (a + b));
				System.out.println("<�ڽ�Ŭ����> �� ���� ���� : " + (a - b));
				System.out.println("<�ڽ�Ŭ����> �� ���� ���� : " + (a * b));
					System.out.println("<�ڽ�Ŭ����> �� ���� ���� ���� : " + (a / b));
					throw new AcceptPendingException();
				} catch (Exception e) {
					System.out.println("���ڴ� 0���� ���� �� �����ϴ�. ");
				}
				
			}
		
		}
		
}



public class ArithmeticOperation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("doubleŸ���� �� ���� �Է��ϼ���>>>");
		
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
		
		
		// 1. ���ٽ�
		Arithmetic arithmetic1 = (double a, double b) -> {System.out.println("<���ٽ�> �� ���� ���� : " + (a + b));};  //��ü����
		Arithmetic arithmetic2 = (double a, double b) -> {System.out.println("<���ٽ�> �� ���� ���� : " + (a - b));};
		Arithmetic arithmetic3 = (double a, double b) -> {System.out.println("<���ٽ�> �� ���� ���� : " + (a * b));};
		Arithmetic arithmetic4 = (double a, double b) -> {System.out.println("<���ٽ�> �� ���� ���� ���� : " + (a / b));};
		
		Arithmetic arithmetic5 = (a,b) -> System.out.println("<���ٽ�> �� ���� ���� : " + (a + b)); 
		// ��౸�� -> inputŸ�� ��������, �����߰�ȣ ��������
		
		
		arithmetic1.arithmeticOpr(num1, num2);
		arithmetic2.arithmeticOpr(num1, num2);
		arithmetic3.arithmeticOpr(num1, num2);
		arithmetic4.arithmeticOpr(num1, num2);
		arithmetic5.arithmeticOpr(num1, num2);
		
		// 2. �������̽��� ������ �ڽİ�ü�� ���
		Arithmetic arithmetic11 = new B_arithmetic();
		
		arithmetic11.arithmeticOpr(num1, num2);
		
		// 3. �͸� �ڽ� Ŭ������ ���
		Arithmetic arithmetic111 = new Arithmetic() {
			@Override
			public void arithmeticOpr(double a, double b) {
					System.out.println("<�͸��ڽ�Ŭ����> �� ���� ���� : " + (a + b));
					System.out.println("<�͸��ڽ�Ŭ����> �� ���� ���� : " + (a - b));
					System.out.println("<�͸��ڽ�Ŭ����> �� ���� ���� : " + (a * b));
					System.out.println("<�͸��ڽ�Ŭ����> �� ���� ���� ���� : " + (a /b));
			}
		};
		arithmetic111.arithmeticOpr(num1, num2);
	}
}