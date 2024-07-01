package com.yogesh.bankmanagement;

import java.util.Scanner ;

public class BankManagementMain {

    Scanner scanner = new Scanner(System.in);
    NewAccountInfoModel newAccountInfoModel = new NewAccountInfoModel();

    public void openAccount() {
        System.out.println("Enter Name :");
        newAccountInfoModel.setName(scanner.next());

        System.out.println("Enter aadhar number :");
        newAccountInfoModel.setAadharNo(scanner.next());

        System.out.println("Enter Mobile Number :");
        newAccountInfoModel.setMobileNo(scanner.next());

        System.out.println("Enter Your age :");
        newAccountInfoModel.setAge(scanner.next());

        System.out.println("Enter address");
        newAccountInfoModel.setAddress(scanner.next());

        System.out.println("Enter City :");
        newAccountInfoModel.setCity(scanner.next());

        System.out.println("Enter State :");
        newAccountInfoModel.setState(scanner.next());

        System.out.println("Enter email :");
        newAccountInfoModel.setEmail(scanner.next());

        System.out.println("Enter Initial Balance to Open Account :");
        newAccountInfoModel.setBalance(scanner.next());
    }

    public void accountInfo() {
        System.out.println(newAccountInfoModel.toString());
    }

    public void closeAccount() {
        newAccountInfoModel = null;
    }


    public static void main(String[] args) {

        System.out.println("Welcome to Bank Management System ");

        BankManagementMain bankManagementMain = new BankManagementMain();
        bankManagementMain.openAccount();
        bankManagementMain.accountInfo();
        bankManagementMain.closeAccount();
      
    }

}