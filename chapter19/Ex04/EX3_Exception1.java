package book.chapter19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/*
1. is1   <== InputStream ��ü (���� ��η� ���� : - ms949) , ����ó��
2. is2   <== InputStream ��ü (��� ��η� ���� : - utf8.txt), ����ó��(try ~ with resource�� ����ó��)
			// try ~ with resource : close()�� �ڵ����� ó��
*/
public class EX3_Exception1 {

	public static void main(String[] args) {
		System.out.println("======<������-MS949>�ѱ� ��ȯX try catch ����ó��======");
		// 1. is1   <== InputStream ��ü (���� ��η� ���� : - ms949) , ����ó�� (try catch ���� ����)
		// ���� ��η� ������
		File file1 = new File("C:\\peb\\JAVA\\src\\book\\chapter19\\Ex04\\FileInputStream1-MS949");
		
		//InputStream����
		
		InputStream is1 = null; //is1�� try�� �ȿ� ����Ǿ� ������ �� �����鿡�� ��� �Ұ�
		try {
			is1= new FileInputStream(file1);
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException ���ܹ߻�");
		}
		
		int data; 	// .read()�� �о���̸� byte�� ���� -> int�� ������ ���� ����
		
		// while������ ���� 
		try {
			while ((data = (is1.read())) != -1) {		// byte���� -1�� �ɶ�����(������������)����
				System.out.print((char)data);
			}
		} catch (IOException e) {
			System.out.println("IOException ���ܹ߻�");
		}finally {
			
			// �ݾ��ֱ�
			try {
				is1.close();
			} catch (IOException e) {
				System.out.println("IOException ���ܹ߻�");
			}
		}
		
		System.out.println();
		System.out.println("======<������-MS949>�ѱ� ��ȯO try catch �ѹ���ó��, �ڵ� ���ҽ� close()======");
		
		int data2;	// .read()�� �о���̸� byte�� ���� -> int�� ������ ���� ����
		
		//�ѱ�ó�� #1: byte�迭����
		byte[] arr1 = new byte[100];  // byte�迭 ������ ���ڿ� �����ϰ� String���� �ҷ� �;� ��
		
		try (InputStream is2 = new FileInputStream(file1)){
			// try()�� ��ü ���� -> resource�ڵ� �ݱ� 
				//AutoClosable�� close()�� ������ Ŭ���� �����Ѵ�.  => FileInputStream�� ��ӹް� ����
				// ���� ���� ��ü�� ��� Ŭ���� ���� ���� �޼��带 ��������� ��
			
			// �ѱ�ó�� #2 : is.read(byte[]);
			while ((data2 = is2.read(arr1)) != -1) {  //arr1�� ����
				
				// �ѱ�ó�� #3 : new String(byte[], offset, length, "encoding")
				String str1 = new String(arr1,0,data2, Charset.forName("MS949"));
				System.out.println(str1);
			}
			
		} catch (Exception e) {
			System.out.println("���ܹ߻�");
		}
		
		System.out.println("======<�����>-UTF-8>�ѱ� ��ȯO try catch �ѹ���ó��, �ڵ� ���ҽ� close()======");
		// File��ü ����
		File file2 = new File("src\\book\\chapter19\\Ex04\\FileInputStream1-UTF-8");
		
		//InputStream 
		int data3 = 0;
		
		//�ѱ�ó�� #1: byte[]
		byte[] arr2 = new byte[200];
		
		try (InputStream is3 = new FileInputStream(file2)){
				// �ѱ�ó�� #2 : is3.read(byte[]) // �迭�� ����
			while ((data3 = is3.read(arr2)) != -1) {
				// �ѱ�ó�� #3 :new String(byte[],offset, length, "encoding")
				String str2 = new String(arr2,0,data3,Charset.forName("UTF-8"));
				System.out.println(str2);
			}
		} catch (IOException e) {
			System.out.println("���ܹ߻�");
		}
		
	}

}
