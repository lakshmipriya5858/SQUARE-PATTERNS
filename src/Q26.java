class Q26
{
	public static void main(String[] args) 
	{
		int i;
		for(i=1; i<=8; i++)
		{
			if (i % 2 == 1)
				{
					for(int j=1; j<=i; j++)
						System.out.print(j);
				}
			else
			{
				for(int j=i; j>=1; j--)
			{
				System.out.print(j);
			}	
			}
			System.out.println();
		}
	}
}

/* 

1
21
123
4321
12345
654321
1234567
87654321

*/