class Fibo  
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("We Are Going To Give The Fibonacci Series");
		int fir=0,sec=1,next;
		System.out.println("The Fibonacci Series Of 10 Numbers are:");
		Thread.sleep(1000);
		for (int i=0;i<=10;i++)
		{
			System.out.println(fir);
			Thread.sleep(500);
			//next iteration
			next=fir+sec;
			fir=sec;
			sec=next;
		}
	}
}
