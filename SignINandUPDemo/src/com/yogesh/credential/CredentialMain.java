package com.yogesh.credential;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;


public class CredentialMain {
	 
	public void signUp()
	{
		int userId = 0;
		String userName = null ;
		
		Scanner scanner = new Scanner(System.in);
		try {
			
			//Step 1 : Register Driver  
			Driver driver = new OracleDriver();
			DriverManager.registerDriver(driver);
			
			//Step 2 : Get Connection 
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","system","2345");
			
			//Step 3 : Statement object 
			PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO InfoTable VALUES(?,?)");
			
			//Step 4 : Execute Query
			System.out.println("Enter User Id :");
			userId = scanner.nextInt();
			preparedStatement.setInt(1, userId);
			
			System.out.println("Enter Username :");
			userName = scanner.next();
			preparedStatement.setString(2, userName );
			
			preparedStatement.executeUpdate(); 
			
			//Step 5 : Connection Close
			connection.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Problem to connection");
			e.printStackTrace();
		}
		
		
			
		
	}
	
//	public void getDetails()
//	{
//		System.out.println("\nUser Id :" + this.userId + "\t Username :" + this.userName);
//	} 

	public static void main(String[] args) {
		 
		CredentialMain cm = new CredentialMain();
		cm.signUp();
		//cm.getDetails();
	}

}
