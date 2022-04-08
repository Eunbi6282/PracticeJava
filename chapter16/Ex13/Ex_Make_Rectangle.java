package book.chapter16.Ex13;

//두 점의 좌표값을 사용해서 넓이를 구하는 프로그램을 작성하세요. 제너릭 메서드를 사용

class Point<T,V>{
	T t;
	V v;
	
	Point(T t, V v){  //생성자 -> setter 대신에 생성자 통해서 변수에 값을 할당
		this.t = t;
		this.v = v;
	}

	public T getT() {
		return t;
	}

	public V getV() {
		return v;
	}
}

class GenericMethod{
	public static<T,V> double makeRectangle(Point<T,V> p1 , Point<T,V> p2) {
		double width = (double) p2.getT() - (double) p1.getT();
		double height = (double) p2.getV() - (double) p1.getV();		
		// 
		
		return width * height;
	}
}

public class Ex_Make_Rectangle {
	public static void main(String[] args) {
		
		Point<Double,Double> p1 = new Point<Double,Double>(1.0, 2.0);
		Point<Double, Double> p2 = new Point<Double,Double>(10.0, 50.0);
		
		double rectangle = GenericMethod.<Double,Double>makeRectangle(p1, p2);
		// makeRectangle메서드에 static키가 포함되어 있으므로 객체 생성없이 클래스명으로 메서드 호출 가능
		System.out.println("두 점의 넓이는 : " + rectangle);

	}

}
