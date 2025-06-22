package BinarySearch;

public class Product implements Comparable<Product>{
   int productid;
   String productname;
   String category;
public Product(int productid, String productname, String category) {
	super();
	this.productid = productid;
	this.productname = productname;
	this.category = category;
}
@Override
public int compareTo(Product other) {
    return Integer.compare(this.productid, other.productid); // Sort by ID
}
   
}
