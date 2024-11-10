package com.yogesh.login;

 import java.sql.*;

 import java.util.Scanner;

public class CredentialFunctionality {

    CredentialFunctionality(){

        signUp();

    }

    public void signUp()  {

        Scanner scanner = new Scanner(System.in);

        try {
            Driver driver = new oracle.jdbc.driver.OracleDriver();
            DriverManager.registerDriver(driver);

            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","system","2345");

            Statement statement = connection.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE ,
                    ResultSet.CONCUR_UPDATABLE
            );

            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO credential VALUES(?,?)");

            ResultSet resultSet = statement.executeQuery("SELECT username FROM credential");

            boolean usernameStatus = false ;
           // boolean findUsername = false;

            do{
                System.out.print("UserName : ");
                String userName = scanner.next();

                System.out.print("Password : ");
                String password = scanner.next();

                while(resultSet.next())
                {
                    System.out.println("Data :" + resultSet.getString(1));
                    if(resultSet.getString(1).equals(userName))
                    {
                        usernameStatus = true ;
                        System.out.println("Username Available ...!");
                        resultSet.absolute(1);
                        break;
                    }

                }

                if(!usernameStatus)
                {
                    System.out.println("Enter you username ... !");
                    usernameStatus = true;
                }

            }
            while(usernameStatus);

            connection.close();

        } catch (SQLException e) {
            System.out.println("System Message :" + e.getMessage());
            throw new RuntimeException(e);
        }

    }


    public static void main(String[] args) {
        CredentialFunctionality creadentialFunctionality = new CredentialFunctionality();

    }
}
