class  L
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=4;i++)
		{
             for(int j=i+4;j>=i;j--)//j<=(5+i-1)
			 {
		System.out.print(j+" ");
             }
					 		System.out.println();
		}
	}
}
/*
E:\Nov-30\src>java -cp ..\classes L
5 4 3 2 1
6 5 4 3 2
7 6 5 4 3
8 7 6 5 4
*/