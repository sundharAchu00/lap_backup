class PatAss1 
{
	public static void main(String[] args) throws Exception
	{
		int n=5,s=5;
		for (int i=0;i<n ;i++ )
		{
			for (int j=1;j<=n ;j++ )
			{
				if (i%2==0)
				{
					Thread.sleep(500);
					System.out.print(s-- +"  ");
				}
				else
				{
					System.out.print(j+"  ");
				}
			}
			System.out.println();
			s=5;
		}
	}
}
