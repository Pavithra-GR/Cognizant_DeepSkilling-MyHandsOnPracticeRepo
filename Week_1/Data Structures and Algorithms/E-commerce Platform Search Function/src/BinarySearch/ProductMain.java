package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		Product arr[]=new Product[5];
		Product p1=new Product(1, "Pen", "Stationary");
		Product p2=new Product(2, "Fan", "Electronics");
		Product p3=new Product(3, "Note", "Stationary");
		Product p4=new Product(4, "Car", "Automobile");
		Product p5=new Product(5, "pencil", "Stationary");
		arr[0]=p1;
		arr[1]=p3;
		arr[2]=p2;
		arr[3]=p5;
		arr[4]=p4;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Search Product By \n1. Id\n2. Name\n3. Category");
		int searchBy=scanner.nextInt();
		
		switch(searchBy) {
		case 1:
			System.out.println("Enter the id");
		    int id=scanner.nextInt();
		    Arrays.sort(arr);
			SearchById si=new SearchById(arr,id);
			break;
		case 2:
			System.out.println("Enter the name");
		    String name=scanner.next();
			SearchByName sn=new SearchByName(arr,name);
			break;
		case 3:
			System.out.println("Enter the category");
			//scanner.next();
		    String category=scanner.next();
			SearchByCategory sc=new SearchByCategory(arr,category);
			break;
			
		}
		scanner.close();

	}

}
