class SerNum
{
	public static void main(String[] args) throws Exception 
	{
		int i;
		System.out.println("We Are Going To Print 1-5!");
		for(i=1;i<=5;i++)
		{
			Thread.sleep(1000);
			System.out.print(i+"\t");
			Thread.sleep(1000);
		}
	}
}
