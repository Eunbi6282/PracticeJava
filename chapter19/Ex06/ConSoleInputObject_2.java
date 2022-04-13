package book.chapter19.Ex06;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

// Windows : �ܼ� , �޸��忡�� enter. \r\n, \r������ �� �� �ִ�. \n�����ε� ó���� �����ϴ�. 

public class ConSoleInputObject_2 {

	public static void main(String[] args) {
		InputStream is = System.in;	// is -> �ܼ��� ���ؼ� ��ǲ�ްڴ�.
		
		System.out.println("������ �Է��ϼ��� >>>");
		
		int data;
		try {
			// 1. �ѹ���Ʈ ���� �б� (.read())
			while ((data = is.read()) != '\r') {  // is.read()ȣ�� �� �� �ֿܼ��� ��ǲ�� ��� 
				System.out.print((char)data);
			}
			is.read();  // 10 <= \n�� ��������!!! // ����(RAM)�� ��������. ������ ����� ��
				// \n�� ó�� �����ָ� ���� read()���� \n�� �� ����
			
			System.out.println();
			System.out.println("==============");
			
			// 2. n-byte �б� (�Ѳ����� ��������)
			byte[] arr1 = new byte[100]; // �ֿܼ��� �迭�� ����� �� \r\n���� ����. 
			int count1 = is.read(arr1); // count1�� 100byte��
				// 100,100,30(100���� ���� ���� �۰� �޾Ƶ���,) , -1(enter)�� ���� ����� 100byte
				// count1 -> �迭���� ���� ���� ������ ����
			for (int i = 0; i < count1; i++) {  // 0����� ���� �������� 
				System.out.print((char)arr1[i]); // 0������� ���鼭 �迭 ���
			}
			System.out.println(" : count1 = " + count1); // count1(�迭�� ����� .read()�ϳ��ϳ� ���鼭 �� ����)
				//�ֿܼ��� �迭�� ����� �� \r\n���� ���� ������ +2 �Ѱ��� count1�� ������ ����. 
			System.out.println("====================");
			
			
			// 3. 
			int count2;
			count2 = is.read(arr1);  // �������
			System.out.println(new String(arr1,0,count2,Charset.defaultCharset())); // �ѱ۵� ��� ����
			// is.read(); // ���ۿ��� ���� �ʾƾ� �Ѵ�. (�迭 ���ο� \r\n �� �� �ֱ� ������, ���� ���� �ʾƵ� �ȴ�.)
				// byteStream�� ��� ���� ���� �޸𸮿� ����Ǿ� �ֱ� ������ �������� ����� ��. 
			System.out.println("========================");
			
			// 4. n -byte ������ ���� (length ��ŭ �о�ͼ� byte[] offset��ġ���� ����
			byte[] arr2 = new byte[8];
			int offset = 3;
			int length = 5;
			
			int count3 = is.read(arr2,offset,length);
			for (int i = 0; i < offset + length; i++) {
				
			}
			
		} catch (IOException e) {
		}finally {
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
