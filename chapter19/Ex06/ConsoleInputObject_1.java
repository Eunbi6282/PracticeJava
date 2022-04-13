package book.chapter19.Ex06;

import java.io.IOException;
import java.io.InputStream;

/*
 	System.in : Console���� ��ǲ�� �޴� �ڹٿ��� ������ �ִ� ��ü, InputStream
 		Windows : �ֿܼ��� enter: \r\n
 		Mac : �ֿܼ��� enter : \r
 	System.out : Console�� ����ϴ� ��ü	
 */

public class ConsoleInputObject_1 {

	public static void main(String[] args) {
		// 1. �ֿܼ��� ��ǲ�ޱ� ���� ��ü ����
		InputStream is1 = System.in;	//is1�� �ֿܼ��� ��ǲ�޾Ƽ� ó���ϴ� ��ü
		
		System.out.println("������ �Է��ϼ��� >>>");
		
		int data;
		try {
			while ((data = is1.read()) != '\r') {  // 1byte�� �о int data ������ �Ҵ�
				// �ֿܼ��� �Է¹��� ���� �о enter�� ���ö����� ����
				System.out.println("���� ������ : " + (char)data + "���� ����Ʈ �� : " + is1.available());
			}
			//is1�ȿ� �ִ� �� �� ��������
			System.out.println(data); //13 \r
			System.out.println(is1.read()); //10 \n =>�������� �ִ� \n�����ֱ� ���� �ݵ�� .read()�������� ��
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				is1.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
