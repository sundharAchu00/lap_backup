package arraysPractice;

public class P6 {

	public static void main(String[] args) {
		int a[]= {2,4,7,5,9};
		for (int i = 0; i < a.length; i++) {
			int j = 1;
			while(j < a.length) {
				if ((a[i]+a[j])==13) {
					System.out.println(a[i]+","+a[j]);
				}
				break;
			}
		}
	}

}
