//product
package creatingStaticway;

public class Q5 {
	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		
		int product=1;
		for (int index = 0; index < a.length; index++) {
			product=product*a[index];
		}
		System.out.println(product);
	}
}
