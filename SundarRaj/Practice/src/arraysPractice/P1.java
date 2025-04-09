package arraysPractice;
//removing the duplicate
import java.util.Arrays;

public class P1 {

	public static void main(String[] args) {
		int a[]= {6,9,10,8,9,3,2,6};
		int b[]=new int[a.length];
		//sorting using in built method
		Arrays.sort(a);
		int j=0;
		//checking for duplicate and save it in another container
		for (int i = 0; i < b.length-1; i++) {
			if (a[i]!=a[i+1]) {
				b[j++]=a[i];
			}
		}
		b[j++]=a[a.length-1];
		int res[]=new int [j];
//		saving the array without duplicates
		for (int i = 0; i < res.length; i++) {
			res[i]=b[i];
		}
		System.out.println(Arrays.toString(res));
	}

}
