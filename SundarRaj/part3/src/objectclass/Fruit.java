package objectclass;

import java.util.Objects;

public class Fruit extends Object{
	String name,color,origin;
	double price;
//	Fruit(){}
	Fruit(String nam,String col,String ori,double pri){
		name=nam;
		color=col;
		origin=ori;
		price=pri;
	}
//	@Override
//	public boolean equals(Object o) {
//		Fruit ref=(Fruit)o;
//		return this.color.equals(ref.color)  &&this.name.equals(ref.name);
//	}
//	public String toString() {
//		return "name :\n"+name+"\ncolor:\n"+color+"\norigin:\n"+origin+"\nprice:\n"+price;
//	}
//	public int hashCode() {
//		return Objects.hash(name,color,origin,price);
//	}
	
	public static void main(String[] args) {
		Fruit f1=new Fruit("Pineapple", "yellow", "Yercadu", 200.67);
//		Fruit f2=new Fruit("Apple", "red", "ooty", 100.67);
		Fruit f2=new Fruit("Pineapple", "yellow", "Yercadu", 200.67);

		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f1.equals(f2));
		System.out.println(f1.hashCode());
		System.out.println(f2.hashCode());
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", color=" + color + ", origin=" + origin + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, name, origin, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		return Objects.equals(color, other.color) && Objects.equals(name, other.name)
				&& Objects.equals(origin, other.origin)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
	

}

