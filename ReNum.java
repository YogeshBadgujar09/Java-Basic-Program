import java.util.Scanner;

class ReNum
{
	public static void main(String[] args)
	{
		int a;
		int r;
		int r_n;

		System.out.println("Enter a Number :");
		Scanner obj = new Scanner(System.in)		;
		a=obj.nextInt();

		while(a>0)
		{
			r=a%10;
			r_n=r;
			a=a/10;	
			
			System.out.print(r_n);
		
		}

		
	}

}



