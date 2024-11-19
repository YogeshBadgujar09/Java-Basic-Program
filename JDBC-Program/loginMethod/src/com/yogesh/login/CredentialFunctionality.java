package com.yogesh.login;

 import java.sql.ResultSet;
 import java.sql.SQLException;

 import java.util.Scanner;

public class CredentialFunctionality {

    Scanner scanner;
    CredentialFunctionality(){
        signUp();
    }

    public void signUp()  {

        scanner = new Scanner(System.in);
        GlobalDB.createConnection();

            boolean flag = false;

            do {
                System.out.print("UserName : ");
                String userName = scanner.next();

                System.out.print("Password : ");
                String password = scanner.next();

                ResultSet resultSetUsernameAlreadyAvl = GlobalDB.selectQuery("SELECT * FROM credential WHERE username = '"+ userName +"'");

                try {
                    if(resultSetUsernameAlreadyAvl.next()) {
                        System.out.println("Username already exist , Please enter another Username .... !!! ");
                    }
                    else {
                        System.out.println("Register User successfully ... !!!");
                        flag = GlobalDB.dataStoreInTable(userName,password);
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }

            }while(!flag);

            GlobalDB.closeConnection();
    }

    public void signIn()
    {
        scanner = new Scanner(System.in);
        GlobalDB.createConnection();

        boolean flag = false;

            do {

                System.out.print("UserName : ");
                String userName = scanner.next();

                System.out.print("Password : ");
                String password = scanner.next();

                ResultSet resultSetUsernameAlreadyAvl = GlobalDB.selectQuery("SELECT * FROM credential WHERE username = '"+ userName +"'");

                try {
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
                } catch (SQLException ex) {
                    System.out.println("Please enter valid Username OR Password .... !!! ");
                    throw new RuntimeException(ex);
                }

            }while(!flag);

            GlobalDB.closeConnection();
    }


    public static void main(String[] args) {
        CredentialFunctionality creadentialFunctionality = new CredentialFunctionality();
    }
}
