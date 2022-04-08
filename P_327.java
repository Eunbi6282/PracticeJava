package book;
class AAA{}
class BBBB extends AAA{}	//B�� A���


public class P_327 {

	public static void main(String[] args) {
		// instanceof
		
		AAA aaA = new AAA();
		AAA abA = new BBBB();	//abA�� A,BŸ�� ���������� ��ĳ�������� A�� ��� ����
		
		System.out.println(aaA instanceof AAA);
		System.out.println(abA instanceof AAA);
		System.out.println(aaA instanceof BBBB);	//false
		System.out.println(abA instanceof BBBB);
		
		
		if(aaA instanceof BBBB) {
			BBBB bb = (BBBB) aaA;
			System.out.println("aa�� B�� ĳ���� �߽��ϴ�.");
		}else {
			System.out.println("aaA�� BŸ������ ĳ���� �Ұ���!!");	//aa�� AŸ�Ը� �����ϰ� �����Ƿ� BxŸ������ �ٿ�ĳ���� �Ұ�
		}
		
		if (abA instanceof BBBB) {
			BBBB bbb = (BBBB) abA;
			System.out.println("abA�� BŸ������ ĳ���� �߽��ϴ�.");
		}else {
			System.out.println("abA�� BŸ������ ĳ���� �Ұ���!!!");
		}
		
		if ("�ȳ�" instanceof String) {
			System.out.println("\"�ȳ�\"�� StringŬ���� �Դϴ�. ");
		}

	}

}
