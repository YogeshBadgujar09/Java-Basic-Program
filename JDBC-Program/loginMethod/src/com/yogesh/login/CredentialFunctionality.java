package com.yogesh.login;

 import java.sql.ResultSet;
 import java.sql.SQLException;

 import java.util.Scanner;

public class CredentialFunctionality {

    Scanner scanner;
    CredentialFunctionality(){

        System.out.println("Welcome To XYZ Bank ... !!!");

            scanner = new Scanner(System.in);

            System.out.println("1.SignIn 2.SignUp");

            System.out.println("Enter Your Choice :");
            int choice = scanner.nextInt();

            switch (choice)
            {
                case 1 :
                    signIn();
                    break;

                case 2 :
                    signUp();
                    break;

                default:
                    System.out.println("Enter Valid Operation ");

            }
    }

    public void signUp()  {

        scanner = new Scanner(System.in);
        GlobalDB.createConnection();

            boolean flag = false;

            do {

                
                String finalConfirmPassword;
                System.out.println("Enter First Name :");
                String firstName = scanner.next();

                System.out.println("Enter Last Name :");
                String lastName = scanner.next();

                System.out.println("Enter Mobile Number :");
                String mobileNo = scanner.next();

                String password = "garBagePassword"  ;
                String confirmPassword  = null ;
                do{
                    System.out.print("Enter UserName : ");
                    String userName = scanner.next();

                    ResultSet resultSetUsernameAlreadyAvl = GlobalDB.selectQuery("SELECT * FROM credential WHERE username = '"+ userName +"'");

                    try {
                        if(resultSetUsernameAlreadyAvl.next()) {
                            System.out.println("Username already exist , Please enter another Username .... !!! ");
                        }
                        else {

                            System.out.print("Enter Password : ");
                            password = scanner.next();

                            System.out.print("Confirm Password :");
                            confirmPassword = scanner.next();

                            if(password.equals(confirmPassword))
                            {
                                flag = GlobalDB.dataStoreInTable(userName,password,firstName,lastName,mobileNo);
                                System.out.println("Create account successfully ... !!!");
                            }
                            else {
                                System.out.println("please match password and confirm password .... !!!");
                            }

                        }
                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    }
             
                }while(!password.equals(confirmPassword) && !flag);
                

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
