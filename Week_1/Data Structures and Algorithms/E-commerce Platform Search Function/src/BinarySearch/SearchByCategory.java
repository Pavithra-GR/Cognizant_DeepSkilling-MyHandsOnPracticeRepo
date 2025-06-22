package BinarySearch;

import java.util.Arrays;
import java.util.Comparator;

public class SearchByCategory {

	public SearchByCategory(Product[] arr, String category) {
		Arrays.sort(arr, new Comparator<Product>() {

			@Override
			public int compare(Product p1, Product p2) {
				
				return p1.category.compareToIgnoreCase(p2.category);
			}
			
		});
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid].category.compareToIgnoreCase(category)==0) {
				
				System.out.println("ID: "+arr[mid].productid+" Name: "+arr[mid].productname+" Category: "+arr[mid].category);
				return;
			}
			else if(arr[mid].category.compareToIgnoreCase(category)<0) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
	}

}
