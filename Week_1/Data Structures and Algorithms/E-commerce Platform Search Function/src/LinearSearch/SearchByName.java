package LinearSearch;

public class SearchByName {

	public SearchByName(Product[] arr, String name) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i].productname.equalsIgnoreCase(name)) {
				System.out.println("Id: "+arr[i].productid +" Name: "+ arr[i].productname+ " Category: "+ arr[i].category);
			}
		}
	}
	
}
