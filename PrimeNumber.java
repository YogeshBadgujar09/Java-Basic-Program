import java.util.Scanner ;

class PrimeNumber{

	public static void main(String args[])
	{
			Scanner scanner = new Scanner(System.in);

			System.out.println("Enter a Number :");
			int num = scanner.nextInt();

			boolean flag = false ;



			if(num == 0 || num == 1)
			{
				flag = false ;
			}
			else
			{
				for(int i=2 ; i<=num; i++)
				{
					if(num % i == 0)
					{
						flag = false;
					}
				}
			}


			if(!flag)
			{
				System.out.println("Number is Prime");
			}
			else
			{
				System.out.println("Number is not Prime");
			}

	}

}