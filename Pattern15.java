class Pattern15
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
				if(k==1||k==2*i-1)
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
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=11-2*i;k++)
			{
				if(k==1||k==11-2*i)
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
