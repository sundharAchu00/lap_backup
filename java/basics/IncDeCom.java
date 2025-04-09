class  IncDeCom
{
	public static void main(String[] args) 
	{
		int a=14+32;
		int res=(a++ +a)+(a+ ++a);
		System.out.println(res++ +res);
		int b=(res+ ++res)+(a+ a++);
		boolean res1=(res>=a)||(a<=res);
		res1=!(res1);
		System.out.println(a++ +res);
		System.out.println(a+"-"+res);
		int res3=(b++ +b)+ a++;
		System.out.println((res3++ +a) + res3++);
		System.out.println(!(res1));
		System.out.println(!(res1==res1));
		System.out.println();
		System.out.println("***********************");
		int s=198;
		System.out.println(s);
		s*=10;
		System.out.println("aftter using compound operator *"+s);
		s/=10;
		System.out.println("aftter using compound operator /"+s);
		int x=10,y=20;
		System.out.println("before swapping a:"+x);
		System.out.println("before swapping b:"+y); 
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swapping a:"+x);
		System.out.println("After swapping b:"+y); 
	}
}
