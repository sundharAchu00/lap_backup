package groomingSunday;

public class P2 {
	public static void main(String[] args) {
		int []a= {1,2,4,5,7};
		try {
			System.out.println(a[7]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("AIOB is Handled.....");
		}
	}
}
