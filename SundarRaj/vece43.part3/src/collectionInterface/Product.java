package collectionInterface;

public class Product {
	String pname;
	double price;
	int pid;
	Product(String pname,double price,int pid){
		this.pid=pid;
		this.pname=pname;
		this.price=price;
	}
	@Override
	public String toString() {
		return "Product pname= " + pname + ", price= " + price + ", pid= " + pid ;
	}
	
}
