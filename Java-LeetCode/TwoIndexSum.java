class TwoIndexSum
{

	public static void main(String args[])
	{
		int[] arr = {2,4,5,8};
		int target = 7 ;

		for(int i=0 ; i<arr.length ; i++)
		{
			for(int j=1 ; j<arr.length ; j++)
			{
				
				if(arr[i] + arr[j] == target)
				{
					System.out.println("values of Indexes :\n" + arr[i] + " + " + arr[j] + " == " + target);
					System.out.println("Indexex of arr[] : " + i + " & " + j );
				}
			}
			
		}

	}


}