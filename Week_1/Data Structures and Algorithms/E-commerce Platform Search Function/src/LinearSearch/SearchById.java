package LinearSearch;

public class SearchById {
	public SearchById(Product arr[],int id) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i].productid ==id) {
				System.out.println("Id: "+arr[i].productid +" Name: "+ arr[i].productname+ " Category: "+ arr[i].category);
			}
		}
	}
}
