class Pattern12
{
	public static void main(String args[])
	{
		System.out.println("ABCMAY19JPM2BTM017");
		int l=1;
		for(int i=1;i<=3;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("-");
			}
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print(l);
				l++;
			}
			System.out.println();
		}


	}

}
