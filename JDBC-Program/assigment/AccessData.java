package com.yogesh.assigment;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccessData {

	public static void main(String[] args) {
		
		
		try {

			Driver driver = new oracle.jdbc.driver.OracleDriver();
			DriverManager.registerDriver(driver);
			
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","system","2345");
			
			Statement statement = connection.createStatement();
			
			ResultSet resultSet = statement.executeQuery("SELECT * FROM studinfo");
			
			while(resultSet.next())
			{
				System.out.println("id : " + resultSet.getInt(1) + "\nname : " +resultSet.getString(2) );
				
			}
			
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
