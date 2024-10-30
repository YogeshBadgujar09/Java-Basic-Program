package com.yogesh.credential;

import java.util.Scanner;

public class CredentialMain {
	
	private int userId = 0;
	private String userName = null ;
	
	public void signUp()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter User Id :");
		this.userId = scanner.nextInt();
		
		System.out.println("Enter Username :");
		this.userName = scanner.next();
	}
	
	public void getDetails()
	{
		System.out.println("\nUser Id :" + this.userId + "\t Username :" + this.userName);
	} 

	public static void main(String[] args) {
		 
		CredentialMain cm = new CredentialMain();
		cm.signUp();
		cm.getDetails();
	}

}
