class PatAssTri
{
	public static void main(String[] args) throws Exception
	{
		int n=5,num=1;
		char ch='A';
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if (ch=='D')
					ch='A';
				else if (num==4)
					num=1;
				if (i+j<=n-1)
				{
					if(i%2==0)
					{
						System.out.print(ch++ +" ");
					}
					else
					{								
						System.out.print(num++ +" ");
					}
				}
				else
				{
					Thread.sleep(500);
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
 