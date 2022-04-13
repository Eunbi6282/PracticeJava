package book.chapter19.Ex05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class FileOutputStream_2 {

	// FileOutputStream����ؼ� �ѱ�ó�� => .getBytes("MS949")encodingŸ�� �������ֱ�
	public static void main(String[] args) {
		// 1. ������ ���� ����
		File outfile = new File("src/book/chapter19/Ex05/FileOutput2.txt");
			// �⺻������ ��Ŭ������ default charactorset���� ������
		
		OutputStream os1 = null;
		OutputStream os2 = null;
		
		try {
			
			// 2. n-byte ���� ���� ó��(byte[]�� ó������ ������ ����, �ѱ�ó��)
				os1 = new FileOutputStream(outfile);
				byte [] byteArray1 = "�ȳ��ϼ���".getBytes("MS949");  //String ==> byte[]�� ����, byteŸ��
					// �ѱ��̶� 2byte�� ó����
				os1.write(byteArray1);
				os1.write('\n');
				os1.flush();
				
			// 3. n-byte ���� (byte[], offset, length)
				os2 = new FileOutputStream(outfile, true);  // �̾ ����
				byte[] arr2 = "�ݰ����ϴ�.".getBytes(Charset.forName("MS949")); //MS949�� ��������
				os2.write(arr2,2,9); // 2byte��� 9byte���		�ѱ�2byte, Ư������ 1byte �����ϴ�.
					// ���� ���� Ư������ : 1byte
				os2.flush();
				
				
			
		} catch (IOException e) {
			// TODO: handle exception
		}finally {
			try {
				os1.close();
				os2.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
