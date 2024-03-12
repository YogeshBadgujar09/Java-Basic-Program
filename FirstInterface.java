interface Interface_name
{
	void display();
}

class FirstInterface implements Interface_name
{
	public void display()
	{
		System.out.println("My first Interface program ");
	}	

	public static void main(String args[])
	{
		FirstInterface obj = new FirstInterface();
		obj.display();		
	}
}