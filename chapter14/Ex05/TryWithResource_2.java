package book.chapter14.Ex05;
// ���� ������ ��ü���� AutpCloseable ���
	//try(��ü ���� ����){} catch{} : �ڵ����� close() //
	// 1. AutoClosable �������̽��� close()�޼��带 �������̵� �����ؾ� �Ѵ�.
	// 2. java.lang.AutocClosable : java.lang <==import���� ������� �ʾƵ� �ȴ�. 
	// java.lang.Object

	//���� ó�� ���
		// 1. try catch : �ڽ��� ���� ���� ó��
		// 2. throws�� ���ؼ� ���� ó���ϴ� ��� : ���ܸ� ���� ó������ �ʰ� ȣ���ϴ� ������ ó���ϵ��� 
		 //throw :������ �߻���Ű��.
class A implements AutoCloseable{
	String resource;	//resource = null 
	
	//������ �� �Ҵ��ϱ�(1. ������ 2. setter)
	
	A (String resource){	//�������� �Ű������� String���� �޾Ƽ� �޸𸮷� �ε�
		this. resource = resource;
	}

	@Override
	public void close() throws Exception {
		// close()�� �ڵ����� ȣ��
		System.out.println(resource);
		
		if (resource != null) {
			resource = null;
			System.out.println("���ҽ��� �����Ǿ����ϴ�.");
			System.out.println(resource);
			// AutoClose�������̽��� ���������ν� resource�� ���� null�� �ƴѰ�� resource���� �ʱ�ȭ
		}
	}
	
}
public class TryWithResource_2 {
	public static void main(String[] args) {
		// 1. �ڵ� ���ҽ� ���� ���
		try (A a1 = new A("Ư������");){
			// finally ����� a1.close()�޼��带 �ڵ����� ȣ��
			//catch����� ����Ǹ� �ڵ����� AŬ������ close()�� ȣ���
			
		} catch (Exception e) {
			System.out.println("���ܰ� �߻��Ǿ����ϴ�. ");
		}
		
		//2. �������� ���ҽ� ����
		A a2 = null;
		try {
			a2 = new A("������ �ʱⰪ �Ҵ�");
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(a2.resource != null) {
				// a2.close(); -> ȣ���ϴ� ������ exception���� ó���� �̷�� ������ ����ó�� ����� ��.
				try {
					a2.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
