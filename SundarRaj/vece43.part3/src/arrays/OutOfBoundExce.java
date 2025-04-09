package arrays;

public class OutOfBoundExce {

	public static void main(String[] args) {
		int a[]=new int[3];
		System.out.println(a[6]);//RTE array index out of bounds
		System.out.println(a[-1]);//RTE array index out of bounds
	}

}
