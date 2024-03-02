package com.yog.DemoProject;

import java.util.Random;

public class InstanceVarADDtwoObj {
	
	int a ;
	
	void setA()
	{
		Random random = new Random();
		this.a = random.nextInt(9);
		
		System.out.print(this.a + "\n");
		
	}
	
	 void addFun( InstanceVarADDtwoObj obj2) 
	{
		int c ;
		
		c = this.a + obj2.a;
		
		System.out.println(c);
	}
	
	public static void main(String args[])
	{
		
		 InstanceVarADDtwoObj obj1 = new  InstanceVarADDtwoObj();
		 obj1.setA();
		 

		 InstanceVarADDtwoObj obj2 = new  InstanceVarADDtwoObj();
		 obj2.setA();
		 
		 obj1.addFun(obj2);
		 
		
	}

}
