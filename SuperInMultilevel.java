class Base{

	void msg(){
		System.out.println("Base Class Function");
	}

}

class Child_Base extends Base{
	
	void msg(){
		super.msg();
		System.out.println("Child_Base Class Function");
	}

}

class Child extends Child_Base{

	void msg(){
		super.msg();
		System.out.println("Child Class Function");
	}

}

class SuperInMultilevel{

	public static void main(String args[]){
		
		Child ch = new Child();
		ch.msg();	
	
	}

}