class  Q
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=6;i++)
		{
             for(int j=6;j>=1;j--)       //j++
			 {
				 if(i+j<7)        //j<=i          
		System.out.print(0+" ");
				 else
		System.out.print(1+" ");

             }
	System.out.println();

		}

	}
}
/*
E:\Nov-30\src>java -cp ..\classes Q
1 0 0 0 0 0
1 1 0 0 0 0
1 1 1 0 0 0
1 1 1 1 0 0
1 1 1 1 1 0
1 1 1 1 1 1
*/