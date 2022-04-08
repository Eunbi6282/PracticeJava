package book.chapter13.Ex10;

import book.chapter13.Ex10.Button.OnClickListener;

class Button{
	OnClickListener ocl;
	
	//setter로 OnClickListener의 참조변수 ocl에 객체 주소를 담는다.
	void setOnClickListener (OnClickListener ocl) {
		this.ocl = ocl;
	}
	
	//인터페이스만 존재, 구현한 자식 클래스는 존재하지 않는다.
		// 호출하는 곳에서 onClick()를 재정의 해줘야 함
	interface OnClickListener{  	//InnerInterface , static interface
		void onClick();  	// 선언만 된 추상 메서드 -> 하위에서 오버라이딩 필요
	}
	
	void click() {
		ocl.onClick(); //ocl : 참조변수 /초기값이 원래 null이었지만 set을 통해 값이 활성화 됨
		System.out.println(ocl); // 객체 자신 출력 => 주소값나옴
	}
	
}
public class ButtonAPIExample {

	public static void main(String[] args) {
		//개발자 1 : 클릭시 음악 재생
		Button button1 = new Button();
		button1.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("개발자 1. 음악재생");
			}
		});
		button1.click();
		
		//개발자 2 : 클릭시 네이버 접속
		Button button2 = new Button();
		button2.setOnClickListener(new Button.OnClickListener() {
			// //set메서드에 값할당(타입이 OnClickListener)
			@Override
			public void onClick() {
				System.out.println("개발자2.네이버 접속");
			}
		}); 	
	}

}
