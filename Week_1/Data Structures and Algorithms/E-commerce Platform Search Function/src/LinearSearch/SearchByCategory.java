package LinearSearch;

public class SearchByCategory {

	public SearchByCategory(Product[] arr, String category) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i].category.equalsIgnoreCase(category)) {
				System.out.println("Id: "+arr[i].productid +" Name: "+ arr[i].productname+ " Category: "+ arr[i].category);
			}
		}
	}

}
