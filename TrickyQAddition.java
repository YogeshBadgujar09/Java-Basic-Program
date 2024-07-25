class TrickyQAddition{


	public static int add(int a ,int b)
	{
		while(b != 0)
		{
			int carry = a & b ;
				a = a ^ b ;
				b = carry << 1 ;

		}

		return a ;
	}

	public static void main(String args[])
	{


		int a = 5 ;
		int b = 6 ;

		int result = add(a,b);

		System.out.println("Addition :" + result);

	}

}