class Q30
{
	public static void main(String[] args) 
	{
		int i;
		for(i=1; i<=8; i++)
		{
			for(int j=8; j>=i; j--)
				System.out.print(j);
			System.out.println();
		}
	}
}

/*

87654321
8765432
876543
87654
8765
876
87
8
 
*/