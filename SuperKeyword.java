class Base{

	void msg(){
		System.out.println("Base Class Function");
	}

}

class Child extends Base{
	
	void msg(){
		super.msg();
		System.out.println("Child Class Function");
	}

}

class SuperKeyword{

	public static void main(String args[]){
		
		Child ch = new Child();
		ch.msg();	
	
	}

}