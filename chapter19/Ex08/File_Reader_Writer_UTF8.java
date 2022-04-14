package book.chapter19.Ex08;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class File_Reader_Writer_UTF8 {

	public static void main(String[] args) {
		// 1. ���� ��ü ����
				File rwFile = new File("src\\book\\chapter19\\Ex08\\rwFile_UTF8.txt");
				
				try (Writer writer = new FileWriter(rwFile);){ 	//Writer :�߻�Ŭ���� FileWriter: Writer�� ������ �ڽ� Ŭ����
					// Stream -> ���� byte���� ���
					// Writer : char ���� ���, �߻�Ŭ����, FileWriter(������ Ŭ����), ���ڸ� Ưȭ�ؼ� ó��
					// OutStream : byte���� ����, �߻� Ŭ����, FileOutoutStream(������ Ŭ����)
					writer.write("�ȳ��ϼ���\n".toCharArray());
					writer.write("Hello\n");
					writer.write('A');
					writer.write('\r');
					writer.write('\n');
					writer.write("�ݰ����ϴ�.",2,3);
					writer.flush();
				} catch (IOException e) {}
				
				// 2. FileReader�� �̿��� ���� �б� (Default MS949) <= CharSet���� �ɼ��� ����. 
				try (Reader reader = new FileReader(rwFile);){
					int data;
					while ((data = reader.read()) != -1) {
						System.out.print((char)data);
					}
				} catch (Exception e) {}
				// �޸����� Ÿ���� UTF-8�̶� Writer, Reader����� �ϰϿ�

	}

}
