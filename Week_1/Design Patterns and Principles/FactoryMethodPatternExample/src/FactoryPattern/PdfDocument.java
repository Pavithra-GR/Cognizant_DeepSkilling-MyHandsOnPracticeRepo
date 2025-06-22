package FactoryPattern;

public class PdfDocument implements DocumentFactory {
	   @Override
	   public void createDocument() {
		   System.out.println("This is a PDF Document");
	   }
	}
