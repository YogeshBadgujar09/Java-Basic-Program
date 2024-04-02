package SingleInheritance;

class Parent {
	
	void baseFun()
	{
		System.out.println("Base Class Function");		
	}

}

class Child extends Parent {
	
	void deriveFun()
	{
		System.out.println("Derive Class Function");		
	}

}

public class MultilevelInheritance extends Child {

	public void simple()
	{
		System.out.println("Multilevel Inheritance Class Function");
	}
	
	
	public static void main(String[] args) {
	
		MultilevelInheritance obj = new MultilevelInheritance();
		
		obj.baseFun();
		obj.deriveFun();
		obj.simple();
		
	}

}
