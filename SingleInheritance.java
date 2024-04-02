package SingleInheritance;

class Base{
	
	void baseFun()
	{
			System.out.println("Base Class Function call");
	}
}

class Derive extends Base{
	
	void deriveFun()
	{
			System.out.println("Derive Class Function call");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
	 
		Derive d = new Derive();
		d.baseFun();		// Access properties of Base Class		
		d.deriveFun();
	}

}
