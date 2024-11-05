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

			PreparedStatement preparedStatement = connection.prepareStatement("insert into studinfo(name) values(?)");
			
			System.out.println("Enter id for update Name :");
			int id = scanner.nextInt();
			
			ResultSet resultSet = statement.executeQuery("SELECT * FROM studinfo");
			
			while(resultSet.next())
			{
				if(resultSet.getInt(1) == id)
				{
					System.out.println("Your old Data is " + resultSet.getInt(1) + " " + resultSet.getString(2));
					String name ;
					
					System.out.println(" Enter a name for update :");
					name = scanner.next();
					
					preparedStatement.setString(2, name);
					preparedStatement.executeUpdate();
				}
			}
			
			connection.close();
			
		} catch (SQLException e) {
			 
			System.out.println("Problem to connect with Database ... !!!");
			e.printStackTrace();
		}

	}

}
