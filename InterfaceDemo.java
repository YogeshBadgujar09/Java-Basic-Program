interface get{
	void getData(int a, int b);
}

interface print extends get {
	
	void display();
}

class InterfaceDemo implements print{
	
	int a ;
	int b ;
	
	public void getData(int a , int b)
	{
		this.a = a;
		this.b = b;
	}

	public void display()
	{
		System.out.println("a :" + this.a + "\nb :" + this.b);
	}	


	public static void main(String args[])	
	{
		InterfaceDemo interfacedemo = new InterfaceDemo();
		interfacedemo.getData(10 , 20);
		interfacedemo.display();
		
	}

}



