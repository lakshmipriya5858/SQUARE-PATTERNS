class  S
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=7;i++)
		{
			if(i<=((7/2)+1))
				 {
             for(int j=i;j<=(5+i-1);j++)//j<=
			 {
				 
		System.out.print(j+" ");
			 }
				 }
				 else
			{
			for(int j=(7-i+1);j<=(7-i+5);j++)
			 {
			System.out.print(j+" ");
			 }
			}
					 		System.out.println();
		}
	}
}
/*
E:\Nov-30\src>java -cp ..\classes S
1 2 3 4 5
2 3 4 5 6
3 4 5 6 7
4 5 6 7 8
3 4 5 6 7
2 3 4 5 6
1 2 3 4 5
*/