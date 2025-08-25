// Q4. What Runtime Exception will the following program throws

class Question4{

	public static void main(String args[])
	{
		String s = "UTU";
		int i = Integer.parseInt(s);
	}
}


/** 
******* OUTPUT ********
java.lang.NumberFormatException 

Note : Integer.parseInt() only allow valid numeric String like "123", "-45" etc
**/