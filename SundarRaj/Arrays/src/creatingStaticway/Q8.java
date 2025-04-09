package creatingStaticway;

import java.util.Arrays;


public class Q8 {
	public static void main(String[] args) {
		int a[]= {10,20,30,50};
		int b[]=new int[a.length+1];
		int last=a[a.length-1];
		
		for (int i = 0; i < a.length-1; i++) {
			if(a[i]==a[a.length-1]){
				b[i]=a[i]+10;
			}else {
			b[i]=a[i];
			}
			
		}
		b[b.length-2]=b[b.length-1]+40;
		b[b.length-1]=last;
		System.out.println(Arrays.toString(b));
	}
	
	
}
