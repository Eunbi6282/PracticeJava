package book.chapter13.Ex10.Ex02;

import book.chapter13.Ex10.Ex02.Abc.Def;
import chapter06_07.Ex02.A;

class Abc{
	//1. ��ü ���� �� �ʵ忡 ���� ���� �Ҵ�(d1)
	// 2. �����ڸ� ���ؼ� �� �Ҵ� (d2)
	// 3. setter�� ���ؼ� �� �Ҵ�
	
	 Def d; 	//������ Ÿ���� �������̽��� �ʵ� d
	 
	 interface Def {
		 void run();
		 void fly();
	 }
	 // �⺻������
	 Abc (){};
	 
	 //�����ڷ� ���Ҵ�
	 Abc (Def d){
		 this.d = d;
	 }
	 
	 //setter�� �� �Ҵ�
	 public void setDef(Def d) {	//setter�� ������ Ÿ���� Def�� ���� �ϳ� ��������
		 this.d = d;
	 }
	 
	 // ��������
	 void ghi() {
		 d.run();
		 d.fly();
	 }
	 
}
public class InnerInterface1_2 {

	public static void main(String[] args) {
		// 1. ��ü ���� �� �ʵ忡 ���� ���� �Ҵ�(d1)
		Abc d1 = new Abc();
		//ex ) �ʵ忡 ������ , a1.b = int a���� (Abc.Def)�� ������ Ÿ����!
		d1.d = (Abc.Def) new Abc.Def() {
			
			@Override
			public void run() {
				System.out.println("run!");
			}
			
			@Override
			public void fly() {
				System.out.println("fly!");
			}
		};
		d1.ghi();
		
		// 2. ������ ���ؼ� ���Ҵ�
		Abc d2 = new Abc(new Abc.Def() {
			
			@Override
			public void run() {
				System.out.println("run!");
			}
			
			@Override
			public void fly() {
				System.out.println("fly!");
			}
		});
		d2.ghi();
		System.out.println("=======");
		
		//3. setter�� ���ؼ� �� �Ҵ�
		Abc d3 = new Abc();
		d3.setDef(new Abc.Def() {	//setDef�޼��� �ҷ��� -> Abc.Def���� �� �Ҵ�

			@Override
			public void run() {
				System.out.println("dd");
				
			}

			@Override
			public void fly() {
				System.out.println("gg");
			}
		}); 
		d3.ghi();
	}	

}
