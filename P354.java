package book;
class A354{
	A354(){
		System.out.println("A持失切");
	}
}

class B354 extends A354{
	B354(){
		System.out.println("B持失切");
	}
}

class C354 {
	C354 (int a){
		System.out.println("C持失切");
	}
}

class D354 extends C354{
	D354(){
		super(3);
	}
}
public class P354 {
	public static void main(String[] args) {
		//A梓端 持失
		A354 a354 = new A354();
		System.out.println();
	}

}
