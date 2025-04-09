package abstraction;

interface Dinesh{
	default void hii() {
		System.out.println(3343);
	}
}

class First implements Dinesh {

	public void hii() {
		System.out.println(123);
	}
	public static void main(String[] args) {
		Dinesh f=new First();
		f.hii();
	}
	
}
