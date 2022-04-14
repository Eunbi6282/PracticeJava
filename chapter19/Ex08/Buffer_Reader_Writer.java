package book.chapter19.Ex08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Buffer_Reader_Writer {
	public static void main(String[] args) {
		// 1. ���ϰ�ü ����
		File rwfile = new File("src\\book\\chapter19\\Ex08\\BufferFile.txt");
		
		// 2. FileWriter�� ���� ���Ͽ� ���� ����(MS949)
		try (Writer writer = new FileWriter(rwfile);
			BufferedWriter bWriter = new BufferedWriter(writer);	
		){
			bWriter.write("�ȳ��ϼ���\n");
			bWriter.write("Hello");
			bWriter.write('\r');
			bWriter.write('\n');
			bWriter.write("�ݰ����ϴ�",2,3);
			bWriter.flush();
		} catch (IOException e) {}
		
		// 2. FileReader�� �̿��� �����б� (MS949)
		try (Reader reader = new FileReader(rwfile);
			BufferedReader bReader = new BufferedReader(reader);	
		){
			
			// BufferedReader�� �߰��� �޼��� :readLine
			
			//int read() �� ������ ���� -1�� ǥ��
			// readLine�� ���� Ÿ���� String, ������ ���� ��Ÿ�� �� null,�Ѷ��� �� �д´�.
			
			String dataString;
			while ((dataString = bReader.readLine()) != null) {
				System.out.println(dataString);
			}
		} catch (Exception e) {}
		
		
		
	}
	
	

}
