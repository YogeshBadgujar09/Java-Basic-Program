package com.yogesh.stringfunction;

public class Allstringfun {

	public static void main(String args[])
	{
		String a = "InfoGalaxy";
		System.out.println(a.charAt(2));
		System.out.println(a.length());
		
		System.out.println(a.startsWith("In"));
		System.out.println(a.endsWith("Y"));
		
		String b = "Info";
		String c = "Galaxy";
		System.out.println(b.concat(c));
		
		String d = "Info";
		String e = "info";
		System.out.println(d.equals(e));
		System.out.println(e.replace("i","I"));
		
		String z = " InfoGalaxy    ";
		System.out.println(z);
		System.out.println(z.trim());
		
	}
	
}
