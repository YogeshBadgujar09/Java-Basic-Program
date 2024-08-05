/**
	Print 1 to N number without Using Loop
*/


class Task12
{

	public void print(int n)
	{
		if(n == 0)
		{
			return ;
		}
		else{
			print(n-1);
			System.out.println(n);
		}

	}


	public static void main(String args[])
	{
		int n = 10;
		
		Task12 obj = new Task12();
		obj.print(n);
		

	}

}