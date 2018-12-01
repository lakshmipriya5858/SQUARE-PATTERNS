class  P
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=6;i++)
		{
             for(int j=1;j<=6;j++)
			 {
				 if((i+j)<7)                  
		System.out.print(0+" ");
				 else
		System.out.print(1+" ");

             }
	System.out.println();

		}

	}
}
/*
E:\Nov-30\src>java -cp ..\classes P
0 0 0 0 0 1
0 0 0 0 1 1
0 0 0 1 1 1
0 0 1 1 1 1
0 1 1 1 1 1
1 1 1 1 1 1
*/