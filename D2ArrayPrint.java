class D2ArrayPrint{

	public static void main(String args[])
	{
		int a[][] = {{1,2,9},{3,4,8},{5,6,7}};
		int i ;
		int j ;

		for(i=0,j=0 ; i<a.length ; i++,j++)
		{

			for(j=0 ; j<a.length ;j++)
			{
				System.out.print(a[i][j] + " ");
			}

			System.out.println();
		}

	}


}