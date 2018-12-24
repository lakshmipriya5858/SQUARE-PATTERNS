class Q31
{
	public static void main(String[] args) 
	{
		int i;
		for(i=8; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
				if (i == 1 || i == 8 || j == 1 || j ==i)
				{
						System.out.print("8");
				}
				else
				System.out.print("0");
			System.out.println();
		}
	}
}

/*

88888888
8000008
800008
80008
8008
808
88
8
  
*/