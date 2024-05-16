interface Sample{

	public void func1()	;
	public void func2()	;

}

class InterfaceObject{

	public static void main(String args[])
	{

		/**
			Sample is interface to create of its object user create a contructor which is in AnomuosClass

		*/
			Sample sample = new Sample()
			{

				public void func1()
				{
					System.out.println("Function 1 is call");
				}

				public void func2()
				{
					System.out.println("Function 2 is call");
				}

			};

			sample.func1();
			sample.func2();

	}

}