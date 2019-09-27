class Pattern14
{
	public static void main(String args[])
	{
		System.out.println("ABCMAY19JPM2BTM017");
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<2;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=9;k++)
			{
				if(i==1||i==2||k==1||k==2||k==3||k==7||k==8||k==9)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}


	}

}
