package com.yog.DemoProject;

public class AdditionOfAnomyousIndex {
	
	public static void addFunction(int arr[]) {
	
		int add = 0 ;
		
		for(int i=0 ; i<arr.length ; i++) {
			
			add = add + arr[i];	
		}
		
		System.out.println(add);
	}
	
	public static void main(String args[])
	{
		addFunction(new int[] {10,20,30});
		
	}

}
