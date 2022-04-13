package book.chapter19.Ex05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// InputStream : �߻� Ŭ���� <= FileInputStream ������ Ŭ����(�о�� ��)
// OutoutStream : �߻� Ŭ���� <= FileOutStream ������ Ŭ���� (����)
// FileInputStream : byte() ���� ������ �б�
// FileOutpurStream : byte()���� ������ ����

// Windows �ܼ�, �޸��� Enter�� ������ : \r\n

public class FileOutputStream_1 {

	public static void main(String[] args) {
		// 1. �Է����� ����(�������� ����)
		File outFile = new File("src/book/chapter19/Ex05/FileOutput1.txt");
		
		// 2. �ѹ���Ʈ �б�
		OutputStream os1 = null;
		OutputStream os2 = null;
		OutputStream os3 = null;
		try {
			os1 = new FileOutputStream(outFile);
				// FileOutPutStream�� �������� �ʴ� ������ ������ ������
			
			os1.write('J');
			os1.write('A');
			os1.write('V');
			os1.write('A');
			os1.write('\r');  // ���� -> byte13 <= ��������
			os1.write('\n');	// ���� -> byte11
				// !!!�߿�!!! : write() �޼���� ����(RAM)�� ����<�޸𸮿� �ø�>, ���۰� ������ ���Ͽ� ���� ��
				//			  flush() : ���ۿ� ����� ������ ���Ͽ� ������ ���� �� �� ���
			os1.flush();	// �޸��� ������ ���Ͽ� ������ ������ ����, ���۰� ������ �ʴ���� ������ ���Ͽ� ������ �Ѵ�.
			os1.close(); 	// .close()ȣ��� flush() ���� �۵� ��
			
		// 3. n-byte���� ����(byte[]�� offset���� length)
			os2 = new FileOutputStream(outFile); // �����
				// (file, false ) => �⺻�� , �����
				// (file, true) => �̾��
			byte[] byteArray = "Hello!".getBytes();	//Hello!(String)  => byte�� ��ȯ�� ��� ��
				// ���ڿ��� ���ڰ� �ƴ� ����Ʈ Ÿ������ �迭�ȿ� ��
			
			os2.write(byteArray); // �������
			os2.write('\n');	// \r�� ��������, \n�� �־ enteró�� ��
			
			os2.flush();
			os2.close();
			
		// 4. n-byte ���� ���� (byte[]�� offset�� length �� byte������ ����
			
			os3 = new FileOutputStream(outFile, true); // �̾��
			byte[] byteArray2 = "Better the last smile tha the first".getBytes();
			os3.write(byteArray2,7,14);	// write�϶� 7byte�ڿ��� 8�о ����
			os3.flush();
			os3.close();
					
		} catch (IOException e) {
			System.out.println("���ܹ߻�");
		}finally {
			try {
				os1.close();
				os2.close();
				os3.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
