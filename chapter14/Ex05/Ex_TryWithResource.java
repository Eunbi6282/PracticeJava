package book.chapter14.Ex05;
// �ڵ� ���ҽ�(��ü)����
	// 1. AutoCloseable �������̽� ����
	// 2. close()������
// �ʵ��� �� �Ҵ� -> ������ ȣ��� �� �Ҵ�
class Abc implements AutoCloseable{
	String name;
	int studentID;
	int kor;
	int eng;
	double avg;
	
	Abc(String name, int studentID, int kor, int eng){
		this.name = name;
		this.studentID = studentID;
		this.kor = kor;
		this.eng = eng;
		this.avg = (double) (kor + eng)/3;
	}
	
	
	@Override
	public void close() throws Exception {
		if(name != null || studentID != 0 || kor != 0 || eng != 0) {
			System.out.println("�̸� : " + name + " �й� : " + studentID + " ���� ���� : " + kor + " ���� ���� : " + eng  + " ��� : " + avg);	
			//�ʱ�ȭ
			name = null;
			studentID = 0;
			kor = 0;
			eng = 0;
			avg = 0.0;
			System.out.println("�̸� : " + name + " �й� : " + studentID + " ���� ���� : " + kor + " ���� ���� : " + eng  + " ��� : " + avg);	
		}
			System.out.println("���ҽ��� �����Ǿ����ϴ�.");
		}
}
	

public class Ex_TryWithResource {

	public static void main(String[] args) {
		//1. ��ü�� ��� �ʵ带 �ʱ�ȭ �ϰ� �ڵ����� close()ȣ��
			//-> AutoClosable�������̽��� ����ϰ� �� �޼��带 ���������Ƿ� ���� -> finally���� �ڵ����� close()�� ������ �ش�. 
	try (Abc a1 = new Abc("������", 20170033, 88, 95)){
	} catch (Exception e) {
		System.out.println("���ܰ� �߻��Ǿ����ϴ�.");
	}
	
	//2. �������� close(); => finally������� close()ȣ��
	Abc a2 = null;
	try {
		a2 = new Abc("������", 55, 55, 55);
	} catch (Exception e) {
		 
	}

	}

}
