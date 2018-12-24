class Q29
{
	public static void main(String[] args) 
	{
		int i;
		for(i=8; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
				System.out.print(j);
			System.out.println();
		}
	}
}

/*

12345678
1234567
123456
12345
1234
123
12
1

*/