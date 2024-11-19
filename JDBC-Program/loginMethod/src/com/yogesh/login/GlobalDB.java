package com.yogesh.login;

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
     public static void createConnection()  {
        try {
            driver = new oracle.jdbc.driver.OracleDriver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","system","2345");
            statement = connection.createStatement();

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

    public static boolean dataStoreInTable(String userName , String password)
    {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO credential VALUES(?,?)");
            preparedStatement.setString(1,userName);
            preparedStatement.setString(2,password);
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
