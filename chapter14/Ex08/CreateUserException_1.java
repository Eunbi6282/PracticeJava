package book.chapter14.Ex08;

// ����� ���� ���� Exception
	// 1. Exception�� ����ϴ� ���� : �Ϲݿ���(Checked Exception) -> ������ �ܰ迡�� ����ó�� �ʿ�
	// 2. RunTimeException�� ����ϴ� ���� : ���࿹��(unCheckedException) -> ���� �ÿ� ���� �߻�
class MyException extends Exception{
	// �Ϲݿ��� ���
	public MyException () {	// 1. �⺻ ������ ����
		super(); // �θ�Ŭ������ �޼��� ȣ��(Exception) 
	} 
	public MyException (String message) {  //���� �޼��� ��½� ���
		super(message);
	}
}

class MyRTException extends RuntimeException{
	// ���� ���� ���
	public MyRTException () {
		super();	// �θ�Ŭ������ �޼��� ȣ��(RuntimeException -> Exception) 
	}
	public MyRTException(String message) {
		super(message);
	}
}

//���� ó�� Ŭ����
class A{
	// 1. ����� ���� ���� ��ü ����(�Ϲ� ���� ��ü)
	MyException me1 = new MyException();
	MyException me2 = new MyException("���� �޼��� : MyException");
	// message�� String������ ���� �θ�Ŭ�������� String���� �Űܺ����� �޴� ��� e.getMessage()���
		
	// 2. ��Ÿ�� ���� ��ü
	MyRTException mre1 = new MyRTException();
	MyRTException mre2 = new MyRTException("���� �޼��� : MyRTException");
	
	//(1) ���ܸ� ������ �߻� ��Ű��(throw) :
	void abc_1(int num) {
//		if (num > 70) {
//		System.out.println("���� �۵�");
//		}else {
//			throw mel;	// ���ܸ� ������ �߻���Ŵ
//		}
		try {
			if (num > 70) {
				System.out.println("���� �۵�");
			}else {
				throw me1;	// me1�� throw�� ����ؼ� ������ ���ܸ� �߻���Ŵ
			}
		} catch (Exception e) {
			// me1�� �⺻�����ڶ� ���ܰ� ���� ��� e.getMessage()�� null����
			// �⺻�����ڿ� ������ ���� �������� String�� �޴� �����ڸ� ������ ���� ����
			System.out.println(e.getMessage());
		}
	}
	
	// (2) ���ܸ� ���� (throws) : abc_2()�� ȣ���ϴ� ������ ���� ó���� ����� ��
	void abc_2(int num) throws MyException {
		if(num > 70) {
			System.out.println("�����۵�");
		}else {
			throw  me2;
		}
	}
	
	void bcd_1() {
		abc_1(65); 	//���� �߻�
	}
	void bcd_2() {	//abc_2�� ȣ���ϴ� ������ ���� ó���� ����� ��
		try {
			abc_2(44);
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}
}
public class CreateUserException_1 {
	public static void main(String[] args) {
		A a = new A();
		a.bcd_1(); 	//���ܸ� ��������
		a.bcd_2();	// throws�� ���ܸ� �������� ȣ���ϴ� �ʿ��� ���ܸ� ó����

	}

}
