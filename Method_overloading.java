class Method_overloading
{
	int x;	
	int y;	

	void get_ab(int a,int b)
	{
		x=a;
		y=b;		
	}

	void get_ab(int c)
	{
		x=y=c;
	}

	void show()
	{
		System.out.println("X :"+x+" Y :"+y);
	}
		

	public static void main(String []args)
	{
		Method_overloading obj = new Method_overloading();
		obj.get_ab(10,20);
		obj.show();

		obj.get_ab(100);
		obj.show();
		
				
	}
}