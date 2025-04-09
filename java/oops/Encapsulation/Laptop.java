public class Laptop {
	public String name="dell";
	private double price=25000;
	private String storage="256gb";
	private String ram="8gb";
	public Laptop(){
	
	}
	public void detalilsOfLaptop() {
		System.out.println("laptop name  "+name);
		System.out.println("laptop price  "+price);
	}
}
 	public class LaptopDriver{
	public static void main(String[] args) {  
		Laptop l1=new Laptop();
		l1.detalilsOfLaptop();
	}
 }