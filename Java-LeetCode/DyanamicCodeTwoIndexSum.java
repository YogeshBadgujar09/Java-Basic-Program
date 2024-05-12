import java.util.Scanner ;

class DyanamicCodeTwoIndexSum
{

	public static void main(String args[])
	{
		int arr [] ;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size of array :");
		int size = sc.nextInt();

		arr = new int[size];

		System.out.println("Enter elements in array :");
		for(int i=0 ; i<arr.length ; i++)
		{
			arr[i] = sc.nextInt();
		}

		System.out.println("\nEnter Target :");
		int target =  sc.nextInt();

		System.out.println("\nFind Index Equals to target Value");
		for(int i=0 ; i<arr.length ; i++)
		{
			for(int j=1 ; j<arr.length-1 ; j++)
			{
				if(arr[i] + arr[j] == target)
				{
					System.out.println("\nIndexes are : " + i + " & " + j);
					System.out.println("values are :" + arr[i] + " + " + arr[j] + " = " + target ) ;
				}
			}
		}
		

		

	}



}