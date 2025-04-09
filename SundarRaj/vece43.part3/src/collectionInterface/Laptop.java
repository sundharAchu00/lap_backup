package collectionInterface;

public class Laptop implements Comparable{
	String name;
	int id;
	double price;
	
	Laptop(){
		
	}
	
	Laptop(String name,double pri,int id){
		this.id=id;
		this.name=name;
		price=pri;
	}

	@Override
	public String toString() {
		return "Laptop name=" + name + ", id=" + id + ", price=" + price;
	}
	public int compareTo(Object o) {
		Laptop l=(Laptop)o;
		if (this.price==l.price) {
			return 0;
		} else if(this.price>l.price){
			return 1;
		}else {
			return -1;
		}
	}
	
}