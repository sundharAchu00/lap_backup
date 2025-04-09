package objectclass;

public class Laptop {
	String name = "Dell", processor = "intel i5-8th gen";
	double price = 34000;

	public String toString() {
		return name + ":" + processor + ":" + price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop l1 = new Laptop();
		System.out.println(l1);
	}

}
