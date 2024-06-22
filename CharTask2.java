class CharTask2
{

	public static void main(String args[])
	{
		char c = 65 ;

		for(int i=0 ; i<6 ; i++)
		{
				for(int j=0 ; j<=i ; j++)
				{
						System.out.print((char) (c+j) + " ");
				}

				System.out.println();
		}
	}


}