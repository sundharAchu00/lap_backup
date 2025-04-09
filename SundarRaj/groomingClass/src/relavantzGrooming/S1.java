package relavantzGrooming;

import java.util.Arrays;

public class S1{
  public static void main(String[] args) {
	int []a= {22,23,24,25};
	int []rev=new int[a.length];
	for (int i =rev.length-1,n=0;i>=0; i--) {
		rev[n]=a[i];
		n++;}
		System.out.println(Arrays.toString(rev));
	
  }
}
	
	