package book.chapter19.Ex07;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

// InputStream : ��� ��Ʈ��
	// int => 5555(������������ ����) ==> 5555(���ڷ� ����) ==> int(int�� ������) , ���� �ӵ�

// DataInputStream : �߰� ����� �����ϴ� ��Ʈ��, ��� ��Ʈ���� �ݵ�� ����, �ܵ����� ����� �� ����. 
	// �پ��� ������ �����͸� ������ ������ �� ���
	// ������ �� �� ������ �� ���� Ÿ��

public class DataInputStream_1 {

	public static void main(String[] args) {
		//������ ������ ���� ���� ����
		File dataFile = new File("src\\book\\chapter19\\Ex07\\file1.data");  // Ȯ���ڰ� data
		
		// ������ ����(�Է�) OutputStream, DataOutputStream
		try(OutputStream os = new FileOutputStream(dataFile);
			DataOutputStream dos = new DataOutputStream(os);
		) {
			
			dos.writeInt(35);  // ���� ���� �� ������ ���ڷ� ���´ٰ� �޴°����� int�� ������ => DataOutputStream(������ �� int, ������ �� int)
			dos.writeDouble(5.8);
			dos.writeChar('A');
			dos.writeUTF("�ȳ��ϼ��� �ݰ����� ������ �� ����");
			dos.flush();
			
		} catch (Exception e) {}
		
		// ������ �б�(DataInputStream)
		try (InputStream is = new FileInputStream(dataFile);
			DataInputStream dis = new DataInputStream(is);	
			){
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
			
		} catch (Exception e) {}
	}

}
