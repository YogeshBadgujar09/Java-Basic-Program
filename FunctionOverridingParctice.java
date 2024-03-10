class A{
	
	void get()
	{
		System.out.println("Hello , I am from A class");
	}
		
}

class B extends A{
	
	void get()
	{
		System.out.println("Hello , I am from B class");
	}
		
}


class FunctionOverridingParctice
{
	public static void main(String args[])
	{
		
		B b = new B();
		b.get();		
	}

}