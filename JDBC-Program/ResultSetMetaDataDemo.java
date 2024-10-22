package com.yogesh.databasemetadata;


import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.sql.Connection;
import oracle.jdbc.driver.OracleDriver;

public class ResultSetMetaDataDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try 
		{
			Driver driver = new OracleDriver();
			System.out.println("Driver Object Create Successfully ... !!!");
			
			DriverManager.registerDriver(driver);
			System.out.println("driver register successfully ... !!!");
			 
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521", "system",  "2345");
			System.out.println("Connect to database Successfully ... !!! ");
			
			Statement statement = connection.createStatement();
			System.out.println("Statement Object Create Successfully ... !!!"); 
			
			ResultSet resultSet = statement.executeQuery("SELECT * FROM imrd");
			System.out.println("ResultSet object Created ... !!!");
 		
			
			ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
			
			System.out.println("Column Available in imrd Table :" + resultSetMetaData.getColumnCount());
			System.out.println("First and Second Column Name of imrd table :" + resultSetMetaData.getColumnName(1) + "\t" + resultSetMetaData.getColumnName(2));
			System.out.println("Only Particular Column Name :" + resultSetMetaData.getColumnLabel(1));
			
			// To check type of data ----> TWO Ways
			
			// first Way : using getColumnType(), TYPE class , if else statement 
			System.out.println("Type of data in ID: " + resultSetMetaData.getColumnType(1) + "\tType of data in NAME: " + resultSetMetaData.getColumnType(2));
			
			if(resultSetMetaData.getColumnType(1) == Types.NUMERIC )
			{
				System.out.println("first column is INT type");
			}
		
			// Second Way : using getColumnTypeName()
			System.out.println("Type of data in both column : " + resultSetMetaData.getColumnTypeName(1) + "\t" +  resultSetMetaData.getColumnTypeName(2));
			
			
			System.out.println("Size of both column :" + resultSetMetaData.getColumnDisplaySize(1));
			
		} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
