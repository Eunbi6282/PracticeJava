package book;
class A354{
	A354(){
		System.out.println("A������");
	}
}

class B354 extends A354{
	B354(){
		System.out.println("B������");
	}
}

class C354 {
	C354 (int a){
		System.out.println("C������");
	}
}

class D354 extends C354{
	D354(){
		super(3);
	}
}
public class P354 {
	public static void main(String[] args) {
		//A��ü ����
		A354 a354 = new A354();
		System.out.println();
	}

}
