import java.util.*;
import java.lang.*;
class Jagan1 
{
	public static void main(String[] args) 
	{
		int a[]={1,2,3,4,5};
		int b[]={6,7,8,9};
		int res[]=new int[a.length+b.length]; //creating the new array of length a+b

		for (int i=0,n=0,m=0;i<res.length ;i++ )
		{
			if (i%2==0)
			{
				res[i]=a[n++];
			}else {
				res[i]=b[m++];
			}
		}
		System.out.println(Arrays.toString(res));
	}
}
