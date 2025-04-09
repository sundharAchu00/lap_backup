package arraysPractice;

public class P5 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,7,8,11,12,14};
		for (int i = 0; i < a.length-1; i++) {
			if (a[i+1]!=a[i]+1) {
				System.out.println(a[i]+1);
			}
		}
	}

}
