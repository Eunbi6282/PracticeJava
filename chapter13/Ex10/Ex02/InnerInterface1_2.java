package book.chapter13.Ex10.Ex02;

import book.chapter13.Ex10.Ex02.Abc.Def;
import chapter06_07.Ex02.A;

class Abc{
	//1. 객체 생성 후 필드에 직접 값을 할당(d1)
	// 2. 생성자를 통해서 값 할당 (d2)
	// 3. setter를 통해서 값 할당
	
	 Def d; 	//데이터 타입이 인터페이스인 필드 d
	 
	 interface Def {
		 void run();
		 void fly();
	 }
	 // 기본생성자
	 Abc (){};
	 
	 //생성자로 값할당
	 Abc (Def d){
		 this.d = d;
	 }
	 
	 //setter로 값 할당
	 public void setDef(Def d) {	//setter로 데이터 타입이 Def인 변수 하나 받을거임
		 this.d = d;
	 }
	 
	 // 구현구문
	 void ghi() {
		 d.run();
		 d.fly();
	 }
	 
}
public class InnerInterface1_2 {

	public static void main(String[] args) {
		// 1. 객체 생성 후 필드에 직접 값을 할당(d1)
		Abc d1 = new Abc();
		//ex ) 필드에 값대입 , a1.b = int a같이 (Abc.Def)는 데이터 타입임!
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
		
		// 2. 생성자 통해서 값할당
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
		
		//3. setter를 통해서 값 할당
		Abc d3 = new Abc();
		d3.setDef(new Abc.Def() {	//setDef메서드 불러옴 -> Abc.Def변수 값 할당

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
