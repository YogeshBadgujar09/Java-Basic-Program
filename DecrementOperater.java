class DecrementOperater
{


	public void postDecrement(int a)
	{


		int b = a-- ;
		
		//postDecrement Operater
		//It first use and change the value.
		//that means first assign into b and after increment a;		

		System.out.println("Post-Decrement a value :" +  a);  // Decrement a but first assign 10 into b
		System.out.println("Post-Decrement b value :" +  b);  // print 10 because use postDecreamen
	}	


	public void preDecrement(int a)
	{
		int b = --a ;

		//preDecrement Operater
		//It first change the value and use.
		//that means first Decrement a and assign into b ;		


		System.out.println("\nPre-Decrement a value :" +  a);  // Decrement ,first assign 9 into b
		System.out.println("Pre-Decrement b value :" +  b);    //print 9
	}

	public static void main(String args[])
	{

		int a = 10 ;
		
		DecrementOperater obj = new DecrementOperater();

		obj.postDecrement(a);
		obj.preDecrement(a);

			
	}

}