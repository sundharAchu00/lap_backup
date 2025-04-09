package arrays;

import java.util.Arrays;

public class DuplicteElement {
	public static void main(String[] args) {
		 int a[]= {9,8,7,2,2,5,6,1,8};
		 int b[]=new int[a.length];
		 int count=0,temp=0,m=0;
		 
		 //sorting the array
		 for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if (a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		 System.out.println(Arrays.toString(a));
		 //finding the duplicate element in the array
		 for (int i = 0; i < a.length-1; i++) {
			if (a[i]!=a[i+1]) {
				b[m++]=a[i];
				count++;
			}
		}
		 b[m++]=a[a.length-1];
		 count++;
		 int c[]=new int[count];
		 System.out.println(Arrays.toString(b));
		 for (int i = 0; i < c.length; i++) {
			c[i]=b[i];
		}
		 System.out.println(Arrays.toString(c));
	}

}
