/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yogesh.backend;

/**
 *
 * @author Yogesh
 */
 import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;


public class GlobalDB {

    static Connection connection;
    static Driver driver ;
    static Statement statement;

    static PreparedStatement preparedStatement ;
     public static void createConnection()  {
        try {
            driver = new oracle.jdbc.driver.OracleDriver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","system","2345");
            statement = connection.createStatement();
            preparedStatement = connection.prepareStatement("INSERT INTO credential VALUES(?,?,?,?,?,?)");

        } catch (SQLException e) {
            System.out.println("Problem to get Connection .... !!! ");
            throw new RuntimeException(e);
        }
    }

    public static ResultSet selectQuery(String query)
    {
        try {
            ResultSet resultSet = statement.executeQuery(query);
            return  resultSet ;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean dataStoreInTable(String firstName,String lastName,String mobileNo,String email,String userName,String password)
    {
        try {

            preparedStatement.setString(1,firstName);
            preparedStatement.setString(2,lastName);
            preparedStatement.setString(3,mobileNo);
            preparedStatement.setString(4,email);
            preparedStatement.setString(5,userName);
            preparedStatement.setString(6,password);
            preparedStatement.execute();
            return true ;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println("Problem to close connection ... !!!");
            throw new RuntimeException(e);
        }
    }

}

