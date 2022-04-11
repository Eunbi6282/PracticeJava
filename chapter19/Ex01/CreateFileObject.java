package book.chapter19.Ex01;

import java.io.File;
import java.io.IOException;

// ���� : ��Ŭ�������� ���ϻ����� C:\\�� ������ �� ���� ������ ���� ������ ���� �� �ִ�.
	// �����ذ� ù��° ���1 : ��Ŭ������ <<������ ����>>���� ����
	// ��� 2. ���� ���ο� ������ ���� ex) "C:/ temp001/ newFile.txt"

// File��ü ���� ���� �ĺ��ڸ� ������ ���
	// C:\abc\abc.txt

	// 1. Windows�� ��� : String path = "C:\\abc.\\abc.txt" (�������� �ι�ó��)  ""���� Ư�����ڸ� ó���ϱ� ���� ��ȣ\ <= \�� ó�����ֱ� ���ؼ� \�� �ϳ� �� ����
	//    Windows10�� ��� : String path = "C:/abc/abc.txt"
	// 2. Mac�� ��� : String path = "C:/abc/abc.txt"

// ȣȯ�� ���ؼ� ���������� ����� �� �ִ� �ڵ� �ۼ� <�����ð� ���� �κ��� File.separator ���>
	// String path = "C:" + File.separator + "abc" + File.separator + "abc.txt"




public class CreateFileObject {

	public static void main(String[] args) { //thorws ����ؼ� ����ó�� �̷� -> ���� ó�� �ʿ�
		// 1. File��ü ����ؼ� ���� ����. �ش� �����̳� ������ �������� �ʴ� ���
		File tempDir = new File("C:/temp002");  //temp002���� tempDir
		if (!tempDir.exists()) {  //.exist() �ش� ��ο� �����̳� ������ �����ϸ� true, �������� �ʴ´ٸ� false
			tempDir.mkdir();  // tempDir�� "C:/temp002" ������ ������ ������ .mkdir(���� ������)
		}
		System.out.println(tempDir.exists()); //.exist() �ش� ��ο� �����̳� ������ �����ϸ� true, �������� �ʴ´ٸ� false
		
		// 2. File��ü�� ����ؼ� ���� ����
		File newFile = new File("C:/temp002/newFile.txt"); // C����̺꿡 ������ �ٷ� ���� ��� ���� ������ ������ ���� �� ���� <= ��Ŭ������ ������ �������� ����
		if(!newFile.exists()) {   // newFile�� �������� �ʴ´ٸ�
			try {
				newFile.createNewFile();  // ������ ������ �� ���ܰ� �߻��� �� �ִ�.
			} catch (IOException e) {
				e.printStackTrace();
			} 	
		}
		System.out.println(newFile.exists());
		System.out.println("==============");
		
		//3. ���� ������
		File newFile2 = new File("C:\\temp002\\newfile01.txt");  //Windows10��������
		File newFile3 = new 
		
		
		
		
	}

}
