interface Sample{

	public void function1();
	public void function2();

}

class MyClass implements Sample{

	public void function1()
	{
		System.out.println("Function1 Call");
	}

	public void function2()
	{
			System.out.println("Function2 Call");
	}

}


class InterfaceRefference{

	public static void main(String args[])
	{
		Sample obj =  new MyClass();

		obj.function1();
		obj.function2();
	}


}