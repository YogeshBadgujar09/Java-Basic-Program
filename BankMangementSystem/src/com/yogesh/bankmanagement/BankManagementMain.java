package com.yogesh.bankmanagement;

import java.util.List;
import java.util.Scanner ;
import java.util.Random ;
import java.util.ArrayList ;

public class BankManagementMain {

    Scanner scanner = new Scanner(System.in);

    List<NewAccountInfoModel> multipleAccounts = new ArrayList<>();

    NewAccountInfoModel newAccountInfoModel ;


    public void operationOnAccount()
    {
        int choice ;

        do {
            System.out.println("\n*** Welcome to Bank Management System ***");
            System.out.println("\n1.Open Account 2.Present Account Info 3.Close Account");

            System.out.println("\nEnter Your Choice :");
            choice = scanner.nextInt();

            switch (choice)
            {
                case 1 :
                    openAccount();
                    break;
//
//                case 2 :
//                    accountInfo();
//                    break;
//
//                case 3 :
//                    closeAccount();
//                    break;
            }
        } while(choice < 4 );
    }

    public String generateAccountNumber()
    {
        Random random = new Random();
        String accountNoStrForm  ;

        while(true)
        {
            int accountNumber = random.nextInt();
             accountNoStrForm = String.valueOf(accountNumber);

            if(accountNumber > 1 && accountNoStrForm.length() == 10)
            {
                return  "0000" + accountNoStrForm  ;
            }
        }

    }

    public void openAccount() {

        newAccountInfoModel = new NewAccountInfoModel();

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

        System.out.println("Your Account Number is :  ");
        newAccountInfoModel.setAccountNumber(generateAccountNumber());
        System.out.println(newAccountInfoModel.getAccountNumber());

        System.out.println("Enter Initial Balance to Open Account :");
        newAccountInfoModel.setBalance(scanner.next());

        multipleAccounts.add(newAccountInfoModel);
    }

//    public void accountInfo() {
//        System.out.println(newAccountInfoModel.toString());
//    }
//
//    public void closeAccount() {
//        newAccountInfoModel = null;
//    }


    public static void main(String[] args) {

        BankManagementMain bankManagementMain = new BankManagementMain();
        bankManagementMain.operationOnAccount();

    }

}