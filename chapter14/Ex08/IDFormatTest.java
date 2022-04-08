package book.chapter14.Ex08;
//--����� ���� ���� �����--
//ID�� ���� NULL�� ��� Exception �߻�
//userID�� 8�� �̻� , 20�ڰ� �ƴ� ��� Exception

class IdInfoException extends Exception{
	// 1. �⺻������
	public IdInfoException() {
		super();
	};
	
	// 2. �Ű����� 1�� �޴� ������ -> ���� �޼��� �Ű������� �޾Ƽ� ��� e.getmessage()
	public IdInfoException(String message){
		super(message);
	};
}

class OverException extends Exception{
	public OverException(){
		super();
	}
	public OverException(String message){
		super(message);
	}
}

public class IDFormatTest {
	private String userId = null;
	private String studentId = null;
	// �� �ʵ���� private�� ĸ��ȭ�Ǿ����� -> ��ü ���� �� �ٷ� �������� ���ϵ���
		//setter�� �����ڷ� ���Ҵ�
	
	//setter�� ���� �Ҵ��� �� ������ �־ control�� �� ����.
	public void setUserId(String userId) {		//���� ���� ���� ������ Ȱ��ȭ
		if(userId == null) {
			//try catch
			try {
				throw new IdInfoException();
				
			} catch (Exception e) {
				System.out.println("���̵�� null�� �� �����ϴ�.");
			}
		}else {
			System.out.println("�����۵�");
		}
		this.userId = userId;
	}	
	
	public void setStudentId(String studentId) throws OverException {
		if(studentId.length() < 7 || studentId.length() > 20) {
			// throws�� ���ܸ� �����ؾ� �մϴ�. 
			throw new OverException("8�� �̻�, 20�� �̳����� �մϴ�.");
		}else {
			System.out.println("���� �۵�");
		}
		this.studentId = studentId;
	}
	
	public static void main(String[] args) {
		
	IDFormatTest test = new IDFormatTest();
	test.setUserId(null);
	// throws�� �޾Ƽ� ���� ó�� �ʿ�
		try {
			test.setStudentId("22222");
		} catch (OverException e) {
			System.out.println(e.getMessage());
		}
	}
}
