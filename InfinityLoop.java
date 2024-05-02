class InfinityLoop
{
	public static void main(String args[])
	{
		int count = 0 ;
			
			while(true)
			{
				count+=1;

				if(count == 5)	
				{
					System.out.println(count);
					break;
				}
				

			}


	}
}