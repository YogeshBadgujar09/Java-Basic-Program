class StaVar{

 
		
	int e_id ;
	String e_name;
	static int salary=25000;

	StaVar(int id ,String name)
	{
		e_id=id;
		e_name=name;
	}
		

	void display()
	{
	 	System.out.println("Employee Id :"+e_id);

	 	System.out.println("Employee Name :"+e_name);
	
		System.out.println("Employee Salary :"+salary);
	}
		
			
 



	public static void main(String args[])
	{
		StaVar obj =new StaVar(1,"Ramesh") ;
		obj.display();

		
		StaVar obj1 =new StaVar(2,"Rajesh") ;
		obj1.display();

		StaVar obj2 =new StaVar(3,"Rajesh") ;
		obj2.display();
	}

		
	 
}