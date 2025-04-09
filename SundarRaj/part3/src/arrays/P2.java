package arrays;



public class P2 {
	public static void main(String[] args) {
		int []a= {17,10,45,2,48};
		
		int largest=a[0];
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]>largest) {
				largest = a[i];
			}
		
		}
		System.out.println(largest);
	}

}
