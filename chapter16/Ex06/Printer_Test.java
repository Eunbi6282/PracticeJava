package book.chapter16.Ex06;

import java.io.ObjectInputStream.GetField;

public class Printer_Test {
	public static void main(String[] args) {
		//Powder
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setT(new Powder());
		Powder powder = powderPrinter.getT(); // ��ü�� �����ͼ� ������ powder������ �Ҵ�
		System.out.println(powder);
		powder.doPrinting(); //Generic class�� ���Ե��� ���� �޼��� -> ��ü�� ���� ȣ��
		
		//Water
		GenericPrinter<Water>waterPrinter = new GenericPrinter<>();
		waterPrinter.setT(new Water());
		Water water = waterPrinter.getT();
		System.out.println(waterPrinter);
		System.out.println(water);
		water.doPrinting(); 
		
		
		
	}

}
