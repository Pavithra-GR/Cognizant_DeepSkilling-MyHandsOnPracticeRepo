package FactoryPattern;

public class ExcelDocument implements DocumentFactory {
	   @Override
	   public void createDocument() {
		   System.out.println("This is a Excel Document");
	   }
	}
