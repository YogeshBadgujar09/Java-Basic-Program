import java.util.Scanner;
class Arraymax
{
	public static void main(String args[])
	{
		int a[]=new int[5];
		int max;
		System.out.println("Enter the array element:");
		Scanner obj=new Scanner(System.in);

		for(int i=0;i<a.length;i++)
		{
			a[i]=obj.nextInt();
		}
		max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}


		}
		System.out.println("Max= "+max);
	}
}