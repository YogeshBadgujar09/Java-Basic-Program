interface Sample{

	public static void  func1()
	{
		System.out.println("Static Function Call");
	}


	default void  func2()
	{
			System.out.println("default Function Call");
	}
}


class InterfaceFunDefine implements Sample{

	public static void main(String args[])
	{

	}



}