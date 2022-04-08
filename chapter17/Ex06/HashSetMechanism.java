package book.chapter17.Ex06;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

//Set : 중복된 값을 넣을 수 없다.
	//equals(), hashCode() 메서드가 정의 되어 있어야 한다.
	// String, Integer 클래스들은 equals() 메서드와 hashCode()가 재정의 ㅗ디어있다.
	// 특정 객체를 Set에 저장할 경우 중복 저장을 하지 못하도록 하기 위해서는 equals()와 hashCode()메서드를 재정의 해야 한다.
	// Object클래스의 equals()와 hashCode()
		// Object클래스의 equals() 메서드는 ==와 같다.
		// == 는 Stack메모리의 값의 비교
	
//equals(), hashCode()메서드가 재정의 되지 않은 상태
class A{
	int data;
	public A(int data) {
		this.data = data;
	}
}

//equals()만 재정의, hashCode() 재정의x
class B{
	int data;
	
	public B(int data) {
		this.data = data;
	}
	@Override
	public boolean equals(Object obj) {  //obj에 b타입을 내포하고 있을 때만 다운캐스팅
		if (obj instanceof B) {
			if(this.data == ((B)obj).data) {  //객체안의 data 필드와 값으로 들어오는 data의 값이 같은지 비교, 
					// obj가 Object타입으로 들어오므로 B타입으로 다운캐스팅해서 크기 비교해줘야 함
				return true;
			}
		}
		return false;
	}
}

//equals() , hashCode() 모두 재정의
class C{
	int data;
	public C (int data) {
		this.data = data;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof C) {
			if(this.data == ((C)obj).data) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return data;
	}
}
	

public class HashSetMechanism {

	public static void main(String[] args) {
		
		// C클래스 -> equals(), hashCode() 모두 재정의 
		Set<C> hashSet1 = new HashSet<C>();
		C c1 = new C(3);
		C c2 = new C(3);
		System.out.println(c1 ==c2); //false -> 스택의 주소값 (객체는 스택에 따로 다른 방에 저장됨)
		System.out.println(c1.equals(c2)); // true -> 객체의 data필드의 값을 비교하도록 재정의 되어 있음
		System.out.println(c1.hashCode() + " , " +  c2.hashCode());  // 두 객채의 해시코드 값이 같음
		
		hashSet1.add(c1);
		hashSet1.add(c2);
		System.out.println(hashSet1.size()); // 1 -> 두 객체의 값은 같음(equals() 와 hashCode()가 정의 되어 있기 때문에)
		

	}

}
