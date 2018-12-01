class  R
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=6;i++)
		{
             for(int j=1;j<=6;j++)       //j++
			 {
				 if(i>3)        //j<=i          
		System.out.print(1+" ");
				 else
		System.out.print(0+" ");

             }
	System.out.println();

		}

	}
}
/*
E:\Nov-30\src>java -cp ..\classes R
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
1 1 1 1 1 1
1 1 1 1 1 1
1 1 1 1 1 1
*/