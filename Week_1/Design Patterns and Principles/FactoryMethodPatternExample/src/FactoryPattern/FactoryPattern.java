package FactoryPattern;

public class FactoryPattern {
	public DocumentFactory Document(String type) {
    if(type.equalsIgnoreCase("WordDocument")) {
    	return new WordDocument();
    }
    else if(type.equalsIgnoreCase("PdfDocument")) {
    	return new PdfDocument();
    }
    else if(type.equalsIgnoreCase("ExcelDocument")) {
    	return new ExcelDocument();
    }
	return null;
}
}