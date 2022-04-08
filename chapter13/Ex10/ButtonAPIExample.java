package book.chapter13.Ex10;

import book.chapter13.Ex10.Button.OnClickListener;

class Button{
	OnClickListener ocl;
	
	//setter�� OnClickListener�� �������� ocl�� ��ü �ּҸ� ��´�.
	void setOnClickListener (OnClickListener ocl) {
		this.ocl = ocl;
	}
	
	//�������̽��� ����, ������ �ڽ� Ŭ������ �������� �ʴ´�.
		// ȣ���ϴ� ������ onClick()�� ������ ����� ��
	interface OnClickListener{  	//InnerInterface , static interface
		void onClick();  	// ���� �� �߻� �޼��� -> �������� �������̵� �ʿ�
	}
	
	void click() {
		ocl.onClick(); //ocl : �������� /�ʱⰪ�� ���� null�̾����� set�� ���� ���� Ȱ��ȭ ��
		System.out.println(ocl); // ��ü �ڽ� ��� => �ּҰ�����
	}
	
}
public class ButtonAPIExample {

	public static void main(String[] args) {
		//������ 1 : Ŭ���� ���� ���
		Button button1 = new Button();
		button1.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("������ 1. �������");
			}
		});
		button1.click();
		
		//������ 2 : Ŭ���� ���̹� ����
		Button button2 = new Button();
		button2.setOnClickListener(new Button.OnClickListener() {
			// //set�޼��忡 ���Ҵ�(Ÿ���� OnClickListener)
			@Override
			public void onClick() {
				System.out.println("������2.���̹� ����");
			}
		}); 	
	}

}
