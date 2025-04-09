class Books 
{
	public String bname;
	private double price;
	private String color;
	public Books(String bn,double pri,String col){
		bname=bn;
		price=pri;
		color=col;
	}
	public double getPrice(){
		return price;
	}
	public String getColor(){
		return color;
	}
	public void setColor(String col){
		color=col;
	}

}
class BooksDriver{
	public static void main(String[] args) {
		Books b1=new Books("Java",4781,"cyan");
		Books b2=new Books("Sql",2781,"Brown");
		System.out.println("First book name is :"+b1.bname);
		System.out.println("Second book name is :"+b2.bname);
		System.out.println("First book price is :"+b1.getPrice());
		System.out.println("Second book price is :"+b2.getPrice());
		System.out.println("First book color is :"+b1.getColor());
		System.out.println("Second book color is :"+b2.getColor());
		System.out.println("Set book color is ");
		b1.setColor("blue");
		b2.setColor("red");
		System.out.println("First book color is :"+b1.getColor());
		System.out.println("Second book color is :"+b2.getColor());
		//b1.getPrice();
	}
 }
