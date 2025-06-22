package FactoryPattern;


public class WordDocument implements DocumentFactory {
   @Override
   public void createDocument() {
	   System.out.println("This is a word Document");
   }
}
