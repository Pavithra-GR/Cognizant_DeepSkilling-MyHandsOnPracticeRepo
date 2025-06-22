package FactoryPattern;

public class FactoryMethodPatternExample {

	public static void main(String[] args) {
		FactoryPattern factoryPattern=new FactoryPattern();
		DocumentFactory word =factoryPattern.Document("WordDocument");
		word.createDocument();

		
		DocumentFactory pdf =factoryPattern.Document("PdfDocument");
		pdf.createDocument();
		
		
		DocumentFactory excel =factoryPattern.Document("ExcelDocument");
		excel.createDocument();
	}

}
