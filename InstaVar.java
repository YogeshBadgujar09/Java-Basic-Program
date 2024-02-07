class InstaVar{

 
		
	int e_id ;
	String e_name;

	InstaVar(int id ,String name)
	{
		e_id=id;
		e_name=name;
	}
		

	void display()
	{
	 	System.out.println("Emplyee Id :"+e_id);

	 	System.out.println("Emplyee Name :"+e_name);
	}
		
			
 



	public static void main(String args[])
	{
		InstaVar obj =new InstaVar(1,"Ramesh") ;
		 
		obj.display();
	}

		
	 
}