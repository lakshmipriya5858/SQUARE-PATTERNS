class Q25
{
	public static void main(String[] args) 
	{
		int i;
		for(i=1; i<=8; i++)
		{
			for(int j=i; j>=1; j--)
			{
				if (i == 1 || i == 8 || j == 1 || j == i)
				{
						System.out.print(i);
				}
				else
				System.out.print("0");
			}	
			System.out.println();
		}
	}
}

/* 

1
22
303
4004
50005
600006
7000007
88888888

*/