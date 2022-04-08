package book.chapter16.Ex06;

import java.io.ObjectInputStream.GetField;

public class Printer_Test {
	public static void main(String[] args) {
		//Powder
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setT(new Powder());
		Powder powder = powderPrinter.getT(); // 객체를 가져와서 변수에 powder변수에 할당
		System.out.println(powder);
		powder.doPrinting(); //Generic class에 포함되지 않은 메서드 -> 객체를 통해 호출
		
		//Water
		GenericPrinter<Water>waterPrinter = new GenericPrinter<>();
		waterPrinter.setT(new Water());
		Water water = waterPrinter.getT();
		System.out.println(waterPrinter);
		System.out.println(water);
		water.doPrinting(); 
		
		
		
	}

}
