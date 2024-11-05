package com.yogesh.assigment;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertData {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int id ;
		String name;
		
		try {

			Driver driver = new oracle.jdbc.driver.OracleDriver();
			DriverManager.registerDriver(driver);
			
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","system","2345");
			
			PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO studinfo VALUES(?,?)");
			
			System.out.println("Enter Id :");
			id = scanner.nextInt();
			
			System.out.println("Enter name :");
			name = scanner.next();
			
			preparedStatement.setInt(1,id);
			preparedStatement.setString(2,name);
			
			preparedStatement.execute();
			
			connection.close();
			
		} catch (SQLException e) {
		 
			System.out.println("Problem to connect with database");
			e.printStackTrace();
		}
 
	}

}
