package com.yog.DemoProject;

public class LowestNoINarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {20,30,40,10,50};
		
		int lowNo=a[0];
		
		for(int i=0;i<a.length ;i++)
		{
			if(lowNo>a[i])
			{
				lowNo=a[i];
			}
		}
		
		System.out.println("Lowest Number Is :"+lowNo);

	}

}
