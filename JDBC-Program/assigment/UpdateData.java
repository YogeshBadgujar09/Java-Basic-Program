package com.yogesh.assigment;

import java.sql.Connection;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateData {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			Driver driver = new oracle.jdbc.driver.OracleDriver();
			DriverManager.registerDriver(driver);
			
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521", "system", "2345");
			
			
			Statement statement = connection.createStatement();

		//	PreparedStatement preparedStatement = connection.prepareStatement("");
			
			System.out.println("Enter id for update Name :");
			int id = scanner.nextInt();
			
			ResultSet resultSet = statement.executeQuery("SELECT * FROM studinfo");
			
			while(resultSet.next())
			{
				 System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) );	
				 
				 if(resultSet.getInt(1) == id )
				 {
					 System.out.println("Enter name for Update :");
					 String updateName = scanner.next();
					 
					 statement.executeUpdate("Update studinfo set name = '" + updateName +"' where id = " + id +" " );
				 }
			}
			
			connection.close();
			
		} catch (SQLException e) {
			 
			System.out.println("Problem to connect with Database ... !!!");
			e.printStackTrace();
		}

	}

}
