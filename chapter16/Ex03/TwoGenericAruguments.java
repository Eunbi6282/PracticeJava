package book.chapter16.Ex03;
// ���ʸ� Ŭ���� : �Ű����� (Arguments 2��)
class KeyValue<K,V>{
	private K key;
	private V value;
	
	//getter setter ����
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
		kv1.setKey("���");
		kv1.setValue(2000);
		System.out.println(kv1.getKey());
		System.out.println(kv1.getValue());
		
		// 2
		KeyValue<Integer, String> kv2 = new KeyValue<Integer, String>();
		kv2.setKey(404);
		kv2.setValue("Not Found(��û�� �������� ã�� �� �����ϴ�.)");
		System.out.println(kv2.getKey());
		System.out.println(kv2.getValue());
		
		// Ư�� Ÿ���� ������� ���� ��� voidŰ�� ����մϴ�.
		KeyValue<String, Void> kv4 = new KeyValue<String, Void>(); //Void -> �޼��忡�� ������ ���� ��
		kv4.setKey("Ű���� ���");
		System.out.println(kv4.getKey()); // Key���� ������ �� ����
		

	}

}
