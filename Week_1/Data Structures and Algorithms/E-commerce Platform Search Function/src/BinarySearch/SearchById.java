package BinarySearch;

public class SearchById {
	public SearchById(Product arr[],int id) {
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid].productid==id) {
				
				System.out.println("ID: "+arr[mid].productid+" Name: "+arr[mid].productname+" Category: "+arr[mid].category);
				return;
			}
			else if(arr[mid].productid<id) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
	}
}
