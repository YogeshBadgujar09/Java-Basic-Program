class ThreeIndexSum
{

	public static void main(String args[])
	{
		int[] arr = {2,4,5,8,9,1,3};
		int target = 10 ;

		for(int i=0 ; i<arr.length ; i++)
		{
			for(int j=1 ; j<arr.length-1 ; j++)
			{
				for(int k=2 ; k<arr.length-1 ; k++)
				{
					if(arr[i] + arr[j] + arr[k] == target)
					{
								System.out.println("values of Indexes :\n" + arr[i] + " + " + arr[j] + " + " + arr[k] + " == " + target);
								System.out.println("Indexex of arr[] : " + i + " + " + j + " + " + k + "\n" );
					}
				}

			}

		}

	}


}