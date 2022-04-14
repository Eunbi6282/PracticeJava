package book.chapter19.Ex07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

// �ϳ��� ��� ��Ʈ���� Filter ��Ʈ���� ������ ȥ���ؼ� ��� �����ϴ�.
	// ���� �������� ó���ϴ� Stream�� �޼��� ��� ���ο� ���� ������ ���� �� �ִ�. 


public class CombineFilterStream {

	public static void main(String[] args) {
		// 1. ���� ����
		File dataFile = new File("src\\book\\chapter19\\Ex07\\file1.data");
		
		// 2. �����;��� .write
		try (OutputStream os = new FileOutputStream(dataFile); 	// ��� ��Ʈ�� �� �����ϱ�
			BufferedOutputStream bos = new BufferedOutputStream(os); //FilterStream (�߰���� ����, �ܵ����δ� ��� �Ұ���)
			DataOutputStream dos = new DataOutputStream(bos);	//FilterStream (�߰���� ����, �ܵ����δ� ��� �Ұ���)
					// DataOutputStream�� �޼��鸦 ����ҰŸ� DataOutputStream�� ���� �������� �־� ��
		){
			dos.writeInt(35);
			dos.writeDouble(5.8);
			dos.writeChar('A');
			dos.writeUTF("�ȳ��ϼ���");
			dos.flush();
		} catch (Exception e) {}
		
		// 3. ������ �б� .read
		try (InputStream is = new FileInputStream(dataFile);
			BufferedInputStream bis = new BufferedInputStream(is);
			DataInputStream dis = new DataInputStream(bis);
			){
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
		} catch (Exception e) {}
		

	}

}
