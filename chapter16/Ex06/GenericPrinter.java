package book.chapter16.Ex06;

// 제너릭 클래스 : 다양한 타입을 사용할 수 있는 클래스
public class GenericPrinter<T> {
	private T material;
	
	public T getT() {
		return material;
	}

	public void setT(T material) {
		this.material= material;  // 입력받은 객체를 활성화
	}
	
	@Override
	public String toString() {
		return material.toString(); // 변수로 입력받은 값을 주소가 아닌 값으로 호출하기 위함
	}
	
	public void printing() {
		
	}

	public static void main(String[] args) {

	}

}
