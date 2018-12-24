class Q24
{
	public static void main(String[] args) 
	{
		int i;
		for(i=1; i<=8; i++)
		{
			for(int j=i; j>=1; j--)
			{
				if (i == 1 || i == 8 || j == 1 || j ==i)
				{
						System.out.print("0");
				}
				else
				System.out.print("1");
			}	
			System.out.println();
		}
	}
}

/* 

1
11
101
1001
10001
100001
1000001
11111111

*/