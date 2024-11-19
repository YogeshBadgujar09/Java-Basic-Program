package com.yogesh.login;

 import java.sql.*;

 import java.util.Scanner;

public class CredentialFunctionality {

    CredentialFunctionality(){

        signIn();

    }

    public void signUp()  {

        Scanner scanner = new Scanner(System.in);

        try {
            Driver driver = new oracle.jdbc.driver.OracleDriver();
            DriverManager.registerDriver(driver);

            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","system","2345");

            Statement statement = connection.createStatement();

            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO credential VALUES(?,?)");

            boolean flag = false;

            do {

                System.out.print("UserName : ");
                String userName = scanner.next();

                System.out.print("Password : ");
                String password = scanner.next();

                ResultSet resultSetUsernameAlreadyAvl = statement.executeQuery("SELECT * FROM credential WHERE username = '"+ userName +"'");

                if(resultSetUsernameAlreadyAvl.next()) {
                    System.out.println("Username already exist , Please enter another Username .... !!! ");
                }
                else {
                    System.out.println("Register User successfully ... !!!");
                    preparedStatement.setString(1,userName);
                    preparedStatement.setString(2,password);
                    preparedStatement.execute();
                    flag = true ;
                }

            }while(!flag);

            connection.close();

        } catch (SQLException e) {
            System.out.println("System Message :" + e.getMessage());
            throw new RuntimeException(e);
        }

    }

    public void signIn()
    {
        Scanner scanner = new Scanner(System.in);

        try {
            Driver driver = new oracle.jdbc.driver.OracleDriver();
            DriverManager.registerDriver(driver);

            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","system","2345");

            Statement statement = connection.createStatement();

            boolean flag = false;

            do {

                System.out.print("UserName : ");
                String userName = scanner.next();

                System.out.print("Password : ");
                String password = scanner.next();

                ResultSet resultSetUsernameAlreadyAvl = statement.executeQuery("SELECT * FROM credential WHERE username = '"+ userName +"'");

                if(resultSetUsernameAlreadyAvl.next()) {

                    if(resultSetUsernameAlreadyAvl.getString(1).equals(userName) && resultSetUsernameAlreadyAvl.getString(2).equals(password))
                    {
                        System.out.println("Welcome Back .... !!! ");
                        flag = true ;
                    } else if(resultSetUsernameAlreadyAvl.getString(1).equals(userName)){
                        System.out.println("Please enter valid Password ... !!!");
                    }

                }
                else {
                    System.out.println("Please enter valid Username OR Password .... !!! ");
                }

            }while(!flag);

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
