package arrays;
import java.util.*;

public class CrudUsingFor {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int a[]=new int[s.nextInt()];
		int i;
		for (i = 0; i < a.length; i++) {
			System.out.println("enter a["+i+"] value");
			a[i]=s.nextInt();
		}
		i=0;
		for (int j : a) {
			System.out.println("the elements are a["+i+++"] = "+j);
		}
	}
}
