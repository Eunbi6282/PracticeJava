package book.chapter19.Ex07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

// �߰� ����� �����ϴ� ��Ʈ�� : ��� ��Ʈ���� �����ؾ� �Ѵ�. �ܵ����� ����� �� ����.
// BufferedInputStream : InputStream�� ���͸� �����ؼ� �б� ������ ���� ������ �� ��Ʈ��, ��� ��Ʈ���� �߰� ����̾ �ܵ����� ��� ����.
// BufferedOutputStream : OutputStream�� ���͸� �����ؼ� ���� ������ ���� ������ �� ��Ʈ��, ��� ��Ʈ���� �߰� ����̾ �ܵ����� ��� ����.

public class BufferedInput_BufferedOutputStream {
	public static void main(String[] args) {
		// �� ������ ����, Buffered�� ������� �ʰ� ó���ϴ� �����, Buffered�� ����ϴ� ��� �ӵ� ����. 
		File orgFile1 = new File("src\\book\\chapter19\\Ex07\\mycat_origin.jpg"); // ��������
		File copyFile1 = new File("src\\book\\chapter19\\Ex07\\mycat_copy1.jpg"); //Buffered ��� X
		File copyFile2 = new File("src\\book\\chapter19\\Ex07\\mycat_copy2.jpg"); //Buffered ���
		
		// ���� ������ �ϱ� ���� ���� ����
		long start, end, time1, time2; // time1 : Buffered�� ������� �ʴ� ��� ,time2 : Buffered�� ����ϴ� ���
		
		// 1. Buffered�� ������� �ʰ� ó���ϴ� ��� 
		start = System.nanoTime();	// ���۽ð�
		
		try (InputStream is = new FileInputStream(orgFile1); // org���� �о��
			OutputStream os = new FileOutputStream(copyFile1);){// AutoClose
			
			//������ ���� �ڵ� ����
			int data;
			 while((data = is.read()) != -1){  //InputStream���� �ѹ���Ʈ�� ���� ���� data�� ����.
				 os.write(data); // �� ���� OutputStream�� 1byte�� ����, -1(����������) => copy1���� ����
			 }
		} catch (Exception e) {} 
		end = System.nanoTime();
		time1 = end - start;
		System.out.println("Without BufferedXXXStream : " + time1); // Buffered�� ������� �ʰ� ����. copy1.jpg
		
		
		// 2. Buffered�� ����ؼ� ó���ϴ� ���(BufferedInputStream, BufferedOutputStream)
		start = System.nanoTime();
		 
		try (InputStream is = new FileInputStream(orgFile1); //��� ��Ʈ��
			BufferedInputStream bis = new BufferedInputStream(is); // �߰� ����� �����ϴ� ��Ʈ��, ������ ������ ó��(Buffered)���
			OutputStream os = new FileOutputStream(copyFile2);
			BufferedOutputStream bos = new BufferedOutputStream(os); // �߰� ����� �����ϴ� ��Ʈ��, ������ ������ ó��(Buffered)���
		){
			// ������ �����ϱ� ���� // InputStream�о�ͼ� OutputStream�� ����
			
			// ������ �ڵ� ����
			int data;
			while ((data = bis.read()) != -1) {  // ���۸� ����ؼ� �б�
				bos.write(data);  // ���۸� ����ϱ� 
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		end = System.nanoTime();
		time2 = end - start;
		System.out.println("With BufferedXXXStream : " + time1); // Buffered�� ��� copy2.jpg
		
		// Buffered ����� ��� (time2), ������� ���� ��� (time1)
		System.out.println("�ӵ� ���� �� �� ? " + (time1 / time2) + "�� ����");
	}

}
