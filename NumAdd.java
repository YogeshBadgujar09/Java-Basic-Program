import java.util.Scanner;

class NumAdd
{
	public static void main(String args[])
	{
			int num;
			int r;
			int sum=0;

			System.out.print("Enter a Number :");
			Scanner obj = new Scanner(System.in);
			num=obj.nextInt();

			while(num>0)
			{
				r=num%10;
				sum=sum+r;
				num=num/10;
			}

			System.out.println(sum);
	}
}