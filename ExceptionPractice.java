class ExceptionPractice{

	public static void main(String args[])
	{
		int a = 50 ;
		int b = 0;
	
		int c;

		try{
			c = a/b;
			System.out.println("c :" + c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Not Divide By Zero");
		}

	}


}