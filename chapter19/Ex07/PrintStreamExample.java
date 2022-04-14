package book.chapter19.Ex07;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

// PrintStream : Filter Stream(�߰������ �����ϴ� Stream), ��� ��Ʈ�� �ʿ�
	// �پ��� ������� ���, ��¿� Ưȭ�� Stream. flush()�� �ڵ����� ȣ���
	// println(), print(), printf()
	// �������, �ܼ����, ..�基��

public class PrintStreamExample {

	public static void main(String[] args) {
		//1. ���ϰ�ü ����
		File outfile1 = new File("src\\book\\chapter19\\Ex07\\printStream1.txt");
		File outfile2 = new File("src\\book\\chapter19\\Ex07\\printStream2.txt");
		
		// 2. ���Ͽ� ���  printStream (FileOutputStream(File)) ����ϴ� ���̹Ƿ� ��utputstream��
		try (OutputStream os1 = new FileOutputStream(outfile1);
			PrintStream ps = new PrintStream(os1); ){ //fileterStream, ��ݽ�Ʈ���� �ʿ��ϴ�. 
			
			ps.println(5.8);  // double���  <= ��� �� ���ΰ���
			ps.print(3 + "�ȳ�" + 123456 + "\n"); 	// <= ��� �� ���ΰ���X, ���๮�� ���� �־��� => "\n"
			ps.printf("%d�� ȣ��Ǿ����ϴ�.\n",7 );  // "%d" : int���� ȣ��
			ps.printf("%s %f", "�ȳ�", 5.8);  //"%s" : string ȣ��, "%f" : double ȣ��
			// ps.flush()  <== �ڵ����� ȣ��
		} catch (Exception e) {}
		
		// 3. ���Ͽ� ���   PrintStream(File)
		try (PrintStream ps = new PrintStream(outfile2);){
			ps.println(5.8);  // double���  <= ��� �� ���ΰ���
			ps.print(3 + "�ȳ�" + 123456 + "\n"); 	// <= ��� �� ���ΰ���X, ���๮�� ���� �־��� => "\n"
			ps.printf("%d�� ȣ��Ǿ����ϴ�.\n",7 );  // "%d" : int���� ȣ��
			ps.printf("%s %f", "�ȳ�", 5.8);  //"%s" : string ȣ��, "%f" : double ȣ��
			// ps.flush()  <== �ڵ����� ȣ��
		} catch (Exception e) {}
		
		// 4. ���Ͽ� ��� PrintStream ps =System.out;
		try ( OutputStream os2 = System.out;
			PrintStream ps = new PrintStream(os2);){
			
			ps.println(5.8);  // double���  <= ��� �� ���ΰ���
			ps.print(3 + "�ȳ�" + 123456 + "\n"); 	// <= ��� �� ���ΰ���X, ���๮�� ���� �־��� => "\n"
			ps.printf("%d�� ȣ��Ǿ����ϴ�.\n",7 );  // "%d" : int���� ȣ��
			ps.printf("%s %f", "�ȳ�", 5.8);  //"%s" : string ȣ��, "%f" : double ȣ��
			// ps.flush()  <== �ڵ����� ȣ��
		}
		 catch (Exception e) {}
		
		System.out.println("======================================");
		
		// 5. �ֿܼ� ���   PrintStream ps = SyS

	}

}
