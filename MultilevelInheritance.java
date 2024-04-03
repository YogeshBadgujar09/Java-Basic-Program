class Base{

	void dog()
	{
		System.out.println("Barking..........................");
	}


}

class Child_Base extends Base{

	void fish()
	{
		System.out.println("Swiming..........................");
	}

}

class Child extends Child_Base {

	void monkey()
	{
		System.out.println("Eating banana..........................");
	}



}

class MultilevelInheritance{

	public static void main(String args[]){
		
		Child child = new Child();
		child.monkey();
		child.fish();
		child.dog();		

	}


}