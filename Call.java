package com.yog.DemoProject;

class Room{
	
	float length ;
	float width;
	
	Room(float x,float y){
		length = x;
		width  = y;
	}
	
	Room(float d){
		length = width = d;
	}
	
	float Area1(){
		return length * width;
	}
}


public class Call {
	
	public static void main(String args[])
	{
		Room a = new Room(12.5F);
		float  t =a.Area1();
		System.out.println(t);
		
		
		Room b = new Room(12.5F , 12.5F);
		t = b.Area1();
		System.out.println(t);
		
	}

}
