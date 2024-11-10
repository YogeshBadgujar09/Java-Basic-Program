package com.yogesh.assigment;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class deleteData {
 
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			Driver driver = new oracle.jdbc.driver.OracleDriver();
			DriverManager.registerDriver(driver);
			
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521", "system", "2345");
			
			
			Statement statement = connection.createStatement();

		//	PreparedStatement preparedStatement = connection.prepareStatement("");
			
			System.out.println("Enter id for delete data :");
			int id = scanner.nextInt();
			
			ResultSet resultSet = statement.executeQuery("SELECT * FROM studinfo");
			
			while(resultSet.next())
			{
				 System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) );	
				 
				 if(resultSet.getInt(1) == id )
				 {					 
					 System.out.println("data delete successfully ... !!!");
					 statement.executeUpdate("DELETE FROM studinfo WHERE id = "+ id  +"");
				 }
			}
			
			connection.close();
			
		} catch (SQLException e) {
			 
			System.out.println("Problem to connect with Database ... !!!");
			e.printStackTrace();
		}

	}

		
}


