import java.util.Scanner;

class ArithmeticEx{

	public static void main(String args[])
	{	
		int a ;
		int b;

		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter a & b :");
		a = sc.nextInt();
		b = sc.nextInt();

		try{
			int c = a / b;
			System.out.println("c :" + c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Not Dived by Zero");
		}
	}



}