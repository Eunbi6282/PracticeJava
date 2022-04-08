package book.chapter16.Ex13;

//�� ���� ��ǥ���� ����ؼ� ���̸� ���ϴ� ���α׷��� �ۼ��ϼ���. ���ʸ� �޼��带 ���

class Point<T,V>{
	T t;
	V v;
	
	Point(T t, V v){  //������ -> setter ��ſ� ������ ���ؼ� ������ ���� �Ҵ�
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
		// makeRectangle�޼��忡 staticŰ�� ���ԵǾ� �����Ƿ� ��ü �������� Ŭ���������� �޼��� ȣ�� ����
		System.out.println("�� ���� ���̴� : " + rectangle);

	}

}
