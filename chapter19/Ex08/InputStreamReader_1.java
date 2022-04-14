package book.chapter19.Ex08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

// InputStreamReader : Stream(byte) Reader(char), byte�����͸� char�������� ��ȯ�ϴ� ��ü
	// byte������ ���ڵ��� �� �����ؾ� �Ѵ�. (InputStream, OutputStream)
	// char�������� �ٲٸ� ���ڵ� Ÿ���� �Ű澵 �ʿ䰡 ����. 

public class InputStreamReader_1 {

	public static void main(String[] args) {
		//  ���� ��ü ����
		File isr = new File("src\\book\\chapter19\\Ex08\\isr.txt");		//isr.txt�� UTF-8�� ����Ǿ� �ִ�. 
		
		// 1. ���� �о����  => �翬�� ����. isr.txt�� UTF-8, ���� �ڹ� ������ MS949
		try (Reader reader = new FileReader(isr);){  // FileReader�� ���ڵ� ������ �ȵ�.Default encoding�� ���
			int data;
			while ((data = reader.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (Exception e) {}
		
		System.out.println("===========================================");
		System.out.println("===========================================");
		
		// 2. FileInputStream + InputStreamReader�� �̿��� ���� �б�
			// InputStreamReader(is, "encoding") �� �����ؼ� UTF-8�� ���� �� �ְ�
				// byte�����͸� char�������� ��ȯ�ϴ� ��ü
		try (InputStream iStream = new FileInputStream(isr);	// ��� ��Ʈ�� �ʿ�
			InputStreamReader isreader = new InputStreamReader(iStream, "UTF-8");// FilterStream
				){
			int data;
			while ((data = isreader.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (Exception e) {}

	}

}
