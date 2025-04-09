class PatName
{
	public static void main(String[] args) throws Exception
	{
		int n=5;
		for (int i=0;i<n ;i++ )
		{
			//---------1
			for (int j=0;j<n ;j++ )
			{
				if (i==0||i==n-1||j==0&&i<=n/2||i==n/2||j==n-1&&i>=n/2)
				{
					Thread.sleep(50);
					System.out.print("*  ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.print(" | ");
			//---------2
			for (int j=0;j<n ;j++ )
			{
				if (j==0||i==n-1||j==n-1)
				{
					Thread.sleep(50);
					System.out.print("*  ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.print(" | ");

			//---------3
			for (int j=0;j<n ;j++ )
			{
				if (i==0||j==0||j==n-1)
				{
					Thread.sleep(50);
					System.out.print("*  ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.print(" | ");
			//---------4
			for (int j=0;j<n ;j++ )
			{
				if (j==0&&i>n/2||j==n-1||i==n/2||i==n-1||j==n-1)
				{
					Thread.sleep(50);
					System.out.print("*  ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.print(" | ");
			//---------5
			for (int j=0;j<n ;j++ )
			{
				if (j==0||i==n/2||j==n-1&&i>n/2)
				{
					Thread.sleep(50);
					System.out.print("*  ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.print(" | ");

			//---------6
			for (int j=0;j<n ;j++ )
			{
				if (i==0||j==0||i==n/2||j==n-1)
				{
					Thread.sleep(50);
					System.out.print("*  ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.print(" | ");
			//---------7
			for (int j=0;j<n ;j++ )
			{
				if (j==0||i==0||i+j==n-1&&i<n/2||i==j&&j>n/2||i==n/2&&j<=n/2)
				{
					Thread.sleep(50);
					System.out.print("*  ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.print(" | ");

			System.out.println();
		}
	}
}
