package book.chapter16.Ex06;
public class Water {
	
	// GenericPrinter에 사용될 객체[자료]
	
	public void doPrinting() {
		System.out.println("물을 재료로 출력합니다.");
	}

	@Override
	public String toString() {
		return "재료는 물입니다.";
	}

}
