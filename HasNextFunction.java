package com.yog.DemoProject;

import java.util.Scanner;

public class HasNextFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0 ;
		int num ;
		boolean isNegative = false ;
		
		while(scanner.hasNext() && !isNegative) ;
		{	
			System.out.println("Enter a Number :");
			num = scanner.nextInt();
			
			if(num < 0)
			{
				System.out.print("Number is Negative");
				isNegative = true ;
			}
			else {
				sum = sum + num ;
			
			}
		}

	}

}
