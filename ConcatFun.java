package com.yogesh.stringfunction;

public class ConcatFun {

	public static void main(String[] args) {
		
		String a = "Yogesh";
		String b = "Badgujar";
		
		String c = a.concat(b); 
		System.out.println(c);
		
		System.out.println(a.concat(b));
		System.out.println(a.concat(c));
		System.out.println(b.concat(c));
	}

}
