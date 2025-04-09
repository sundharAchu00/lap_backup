class GreatThree 
{
	public static void main(String[] args) 
	{
		int a=78,b=97,c=65;
		System.out.println("the given number a is:"+a);
		System.out.println("the given number b is:"+b);
		System.out.println("the given number c is:"+c);
		int res= a>b?a:b;
		int largest=c>res?c:res;
		System.out.println("the largest number is :"+largest);
	}
}
