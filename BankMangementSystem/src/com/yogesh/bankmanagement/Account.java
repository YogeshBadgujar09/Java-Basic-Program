package com.yogesh.bankmanagement;

import java.util.*;

public class Account {

    Scanner scanner = new Scanner(System.in);
    List<AccountModel> accountsList = new ArrayList<>();

//    public void cashOperation() {
//        System.out.println("\n**** Cash Operation  ****");
//
//        AccountModel newAccountInfoModel = findAccount() ;
//
//        if(newAccountInfoModel != null)
//        {
//            System.out.println("----  Confirm Account Information ----\n"  + newAccountInfoModel.toString());
//
//
//
//    }
//
    public String generateAccountNumber() {

        Random random = new Random();
        String accountNoStrForm  ;
        while(true) {
            int accountNumber = random.nextInt();
             accountNoStrForm = String.valueOf(accountNumber);

            if(accountNumber > 1 && accountNoStrForm.length() == 10) {
                return  "0000" + accountNoStrForm  ;
            }
        }
     }
    public void accountInfoOptimizeCode(AccountModel accountModel) {

        System.out.println("Enter Name :");
        accountModel.setName(accountModel.validateInput(scanner.next(),scanner));

        System.out.println("Enter aadhar number :");
        accountModel.setAadharNo(scanner.next(),scanner);

        System.out.println("Enter Mobile Number :");
        accountModel.setMobileNo(scanner.next(),scanner);

        System.out.println("Enter Your age :");
        accountModel.setAge(scanner.next(),scanner);

        System.out.println("Enter address");
        accountModel.setAddress(accountModel.validateInput(scanner.next(),scanner));

        System.out.println("Enter City :");
        accountModel.setCity(accountModel.validateInput(scanner.next(),scanner));

        System.out.println("Enter State :");
        accountModel.setState(accountModel.validateInput(scanner.next(),scanner));

        System.out.println("Enter email :");
        accountModel.setEmail(scanner.next(),scanner);
    }

    public void enterAccountHolderInfo() {

        AccountModel accountModel = new AccountModel();
        accountInfoOptimizeCode(accountModel);

        System.out.println("Your Account Number is :  ");
        accountModel.setAccountNumber(generateAccountNumber());
        System.out.println(accountModel.getAccountNumber());

        System.out.println("Enter Initial Balance to Open Account :");
        accountModel.setBalance(scanner.next());

        accountsList.add(accountModel);
    }
}