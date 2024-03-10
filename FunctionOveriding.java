class Parent{
	void show()
	{
		System.out.println("Parent Class Function");
	}
}

class Child extends Parent {
	void show()
	{
		System.out.println("Child Class Function");
	}		
}

class FunctionOveriding {

	public static void main(String args[])
	{

		Child child = new Child();
		child.show();	

	}

}