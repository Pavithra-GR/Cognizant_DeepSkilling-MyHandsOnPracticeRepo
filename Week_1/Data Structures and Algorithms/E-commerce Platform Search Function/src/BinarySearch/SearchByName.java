package BinarySearch;

import java.util.Arrays;
import java.util.Comparator;

public class SearchByName {

	public SearchByName(Product[] arr, String name) {
		Arrays.sort(arr,new Comparator<Product>() {
			public int compare(Product p1,Product p2) {
				return p1.productname.compareToIgnoreCase(p2.productname);
			}
		});
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid].productname.compareToIgnoreCase(name)==0) {
				
				System.out.println("ID: "+arr[mid].productid+" Name: "+arr[mid].productname+" Category: "+arr[mid].category);
				return;
			}
			else if(arr[mid].productname.compareToIgnoreCase(name)<0) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
	}
	
}
