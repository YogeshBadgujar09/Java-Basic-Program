class IncrementOperater
{


	public void postIncrement(int a)
	{


		int b = a++ ;
		
		//postIncrement Operater
		//It first use and change the value.
		//that means first assign into b and after increment a;		

		System.out.println("Post-Increment a value :" +  a);  //increment a but first assign 10 into b
		System.out.println("Post-Increment b value :" +  b);  // print 10 because use postIncreamen
	}	


	public void preIncrement(int a)
	{
		int b = ++a ;

		//preIncrement Operater
		//It first change the value and use.
		//that means first increment a and assign into b ;		


		System.out.println("\nPre-Increment a value :" +  a);  //increment ,first assign 11 into b
		System.out.println("Pre-Increment b value :" +  b);    //print 11 
	}

	public static void main(String args[])
	{

		int a = 10 ;
		
		IncrementOperater obj = new IncrementOperater();

		obj.postIncrement(a);
		obj.preIncrement(a);

			
	}

}