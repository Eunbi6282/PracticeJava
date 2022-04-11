package book.chapter19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

import javax.imageio.stream.FileImageInputStream;

public class FileInputStream_2 {

	public static void main(String[] args) {
		
		// �Է����� ����
		File file1 = new File("src\\book\\chapter19\\Ex04\\FileInputStream1-MS949"); // �����
		
		System.out.println("======(1) byte���� �б�(�ѹ���Ʈ�� �о ó��), �ѱ�ó��X======");
		InputStream is1 = null;  // ����� ������ ������ (finally�� ����ϱ� ���ؼ�)
		
		// 2. (1) byte���� �б�(�ѹ���Ʈ�� �о ó��)
		try {
			is1 = new FileInputStream(file1);
			int data;  // 1btye�� �о���� ���� int ������ ����
			while ((data = is1.read()) != -1) {   // �ѹ���Ʈ�� �о ó�� -> ������ ���� �� ������ ����
				System.out.print((char)data);  //���ڷ� ���̵��� (char)��ȯ
			}
		} catch (IOException e) {
			System.out.println("���ܹ߻�");
		}finally { 	// �ݾ��ֱ�!!!!!!
			try {
				is1.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println();
		System.out.println("======(2) try(weith resorce){}�� �����ϱ� , �ѱ�ó��O======");
		
		// �ѱ�ó��#1 : byte[]
		byte[] arr1 = new byte[100];
		
		try (InputStream is2 = new FileInputStream(file1);){  //try()�� ��ü�� ���������ν� �ڵ� ���ҽ� ���� -> ���� �ݾ��� �ʿ� ����
			int data = 0;
			//�ѱ� ó�� #2:.read(byte[])
			while ((data = is2.read(arr1)) != -1) {
				// �ѱ�ó�� #3 : new String(byte[], offset, length,"encoding")
				String str = new String(arr1, 0, data, Charset.forName("MS949"));
				System.out.println(str);
			}
		} catch (IOException e) {
			System.out.println("���� �߻�");
		}
		
		
		System.out.println();
		System.out.println("====== n-byte������ �б� (byte[]�� ó�� ��ġ�������� ���� ������ ����) : ���� ����Ʈ�� �迭�� ��� ���ÿ� �о ó�� �ӵ��� ����======");
			// �迭�� ���� ũ�⸸ŭ �о� �鿩�� byte�迭�� ����
			// �ѱ�ó�� ����
		
		 ;
		try(InputStream is3 =new FileInputStream(file1)) {
			byte[] arr2 = new byte[9];  // �迭�� 9��, 0~8���� //9byte�� �д´�. 
			int count1 = 0;
			
			while ((count1 =is3.read(arr2)) != -1) {
				for (int i = 0; i < count1; i++) {
					System.out.print((char)arr2[i]);
				}
				System.out.println(" : count1 = " + count1);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
			
		}
		
		
//		try (InputStream is3 = new FileInputStream(file1);){  //try()�� ��ü�� ���������ν� �ڵ� ���ҽ� ���� -> ���� �ݾ��� �ʿ� ����
//			//�ѱ� ó�� #2:.read(byte[])
//			while ((count1 = is3.read(arr2)) != -1) {
//				// �ѱ�ó�� #3 : new String(byte[], offset, length,"encoding")
//				String str = new String(arr2, 0, count1, Charset.forName("MS949"));
//				System.out.println(" : count1 = " + str);
//			}
//		} catch (IOException e) {
//			System.out.println("���� �߻�");
//		}
		
		
		

	


}
