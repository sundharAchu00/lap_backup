class Mobile1
{
	String name,ram,storage;
	double price;

	public Mobile1(String name,String ram,String storage,double price){
		this.name=name;
		this.ram=ram;
		this.storage=storage;
		this.price=price;
	}
	public static void main(String[] args) {
		Mobile1 ref=new Mobile1("vivo","8gb","126gb",78000);
		System.out.println(ref.name);
		System.out.println(ref.ram);
	}
}  
