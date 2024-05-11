package com.yog.DemoProject;

public class AnomynousArray {

	public static void printArray(int arr[])
	{
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printArray(new int[] {10,20,30});

	}

}
