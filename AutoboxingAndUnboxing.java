class AutoboxingAndUnboxing{

	public static void main(String args[])
	{
		int x  = 10  ;

		/**
		* Compiler automatic convert primitive type to object of current wrapper class
		*it's called autoboxing
		*/
		Integer obj = x ;
		System.out.println(obj);


		/**
		* Compiler automatic convert wrapper class object to primitive type
		* it's called unboxing
		*
		**/
		Integer obj1 = 10 ;

		int y = obj1  ;
		System.out.println(y);



	}

}