package book.chapter12;

// 2. �߻� �޼��带 ����ϴ� 2��° ��� : �ڽ� ��ü �������� �͸� Ŭ������ Ȱ��
// 			-> �ѹ��� �ӽ������� ����� ��, �̺�Ʈ ó���� ���
// 			���� : �ڽ� Ŭ������ �������� �ʴ´�. �ӽ������� ����� ��� ����
//			���� : �������� ��ü�� �����ؾ� �� ��� �ڵ尡 �����

abstract class AAA{
	abstract void abc();
}
public class AbstratClass_2 {

	public static void main(String[] args) {
		// 1. �͸� ��ü ���� -> ������ �ڿ� {}�־ �͸� Ŭ���� ����
		AAA aaa  = new AAA() {
			void abc() {
				System.out.println("���2 : ��ü �������� �͸�Ŭ������ �߻�޼��� ����");
			}
		};
		AAA aaa2 = new AAA() { 
			/*
			 �̶� AAA()�� Ŭ������ AAA�� �����ڸ� ȣ���ϴ� ���� �ƴ϶� �����Ϸ��� Ŭ���� AAA��
			 ��ӹ޾� abc()�� �������̵� �� �͸� Ŭ������ �����ڸ� ȣ��
			 */
			
			@Override
			void abc() {
				System.out.println("���2 : ��ü �������� �͸�Ŭ������ �߻�޼��� ����");
				
			}
		};
		
		AAA aaa3 = new AAA() {
			
			@Override
			void abc() {
				System.out.println("���2 : ��ü �������� �͸�Ŭ������ �߻�޼��� ����");
			}
		};
		
		aaa.abc();
		aaa2.abc();
		aaa3.abc();
	}
	

}
