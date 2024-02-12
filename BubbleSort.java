package com.yog.DemoProject;

//import java.util.Scanner;

public class BubbleSort 
{
	
	public static void main(String args[])
	
	{
	
	int a[]= {20,10,50,30,40};
	
	System.out.print("Elements of Array :");
	for (int i=0 ; i<a.length ;i++)
	{
		System.out.print(a[i]+" ");
	}
	System.out.println();
	
	
	int temp=0;
	
	for(int i=0 ;i<a.length ;i++)
	{
		for (int j=0;j<a.length-i-1  ;j++)
		{
			if(a[j+1]<a[j])
			{
				temp=a[j+1];
				a[j+1]=a[j];
				a[j]=temp;				
				
			}			
			
		}		
		
	}
	
	for(int m=0 ; m<a.length ; m++)
	{
		System.out.print(a[m]+" ");			
	}
		
		
		
}
	
}
