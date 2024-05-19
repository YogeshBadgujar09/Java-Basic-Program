package com.yogesh.stackprogram;

import java.util.Scanner;

	
public class SimpleStackProgram {
	
	int arr[];
	int TOP = -1 ;
	
	Scanner scanner = new Scanner(System.in);
	
	
	void operation()
	{
		System.out.print("Enter Capcity of Stack : ");
		int capicity = scanner.nextInt();
		
		arr = new int[capicity];
		
		
		
		int choice ;
		
		do {
		
			System.out.println("Enter Your Choice : \n1.PUSH \n2.POP \n3.SHOW");
			choice = scanner.nextInt();
			
			switch(choice)
			{
				case 1 :
					pushOperation(arr, TOP, capicity);
				break ;
				
				case 2 :
					popOperation(arr, TOP);
				break ;
				
				case 3 :
					showStake(arr, TOP);
				break ;
			
			
			}
			
		}while(choice < 4);
	}
	
	
	public void pushOperation(int arr[] , int TOP , int capicity )
	{
		if(TOP < capicity)
		{
			System.out.println("Enter a number :");
			int addElement = scanner.nextInt();
			arr[++TOP] = addElement ;
		}
		else {
			System.out.println("Stack is Overflow");
		}
		
	}
	
	public void popOperation(int arr[] , int TOP)
	{
		if(TOP > 0)
		{
			System.out.print("Stake is Underflow");
		}
		else {
			
			TOP--;
		}
	}
	
	void showStake()
	{
		
		for(int i=TOP ; i<=0 ; i--) {
			
			System.out.println(arr[i]);
		}
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		
		SimpleStackProgram stack = new SimpleStackProgram();
		
		stack.operation();

		
		
		
		
		
		
		
		
		
		
		

	}

}
