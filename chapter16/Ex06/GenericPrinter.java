package book.chapter16.Ex06;

// ���ʸ� Ŭ���� : �پ��� Ÿ���� ����� �� �ִ� Ŭ����
public class GenericPrinter<T> {
	private T material;
	
	public T getT() {
		return material;
	}

	public void setT(T material) {
		this.material= material;  // �Է¹��� ��ü�� Ȱ��ȭ
	}
	
	@Override
	public String toString() {
		return material.toString(); // ������ �Է¹��� ���� �ּҰ� �ƴ� ������ ȣ���ϱ� ����
	}
	
	public void printing() {
		
	}

	public static void main(String[] args) {

	}

}
