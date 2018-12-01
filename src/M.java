class  M
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=4;i++)
		{
             for(int j=1;j<=5;j++)
			 {
				 if(i==1||i==4||j==1||j==5)
		System.out.print(0+" ");
				 else
		System.out.print(1+" ");

             }
					 		System.out.println();
		}
	}
}
/*
E:\Nov-30\src>java -cp ..\classes M
0 0 0 0 0
0 1 1 1 0
0 1 1 1 0
0 0 0 0 0*/