package book.chapter16.Ex03;
// 제너릭 클래스 : 매개변수 (Arguments 2개)
class KeyValue<K,V>{
	private K key;
	private V value;
	
	//getter setter 생성
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
}


public class TwoGenericAruguments {
	public static void main(String[] args) {
		// 1
		KeyValue<String, Integer> kv1 = new KeyValue <String, Integer>();
		kv1.setKey("사과");
		kv1.setValue(2000);
		System.out.println(kv1.getKey());
		System.out.println(kv1.getValue());
		
		// 2
		KeyValue<Integer, String> kv2 = new KeyValue<Integer, String>();
		kv2.setKey(404);
		kv2.setValue("Not Found(요청한 페이지를 찾을 수 없습니다.)");
		System.out.println(kv2.getKey());
		System.out.println(kv2.getValue());
		
		// 특정 타입을 사용하지 않을 경우 void키를 사용합니다.
		KeyValue<String, Void> kv4 = new KeyValue<String, Void>(); //Void -> 메서드에서 리턴이 없을 때
		kv4.setKey("키값만 사용");
		System.out.println(kv4.getKey()); // Key값만 가져올 수 있음
		

	}

}
