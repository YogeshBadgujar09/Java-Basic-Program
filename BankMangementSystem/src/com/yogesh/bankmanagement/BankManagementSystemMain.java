package com.yogesh.bankmanagement;
import java.util.Random ;
import java.util.HashMap ;
import java.util.Map ;

import java.util.Scanner ;

public class BankManagementSystemMain {

    Map<String, Account> accountsTypeList = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    int mainOperation;
    public void operation() {
        System.out.println("****  WelCome to Bank Management System ****");

        do {

            System.out.println("\n1.Open Account \n2.Search Account \n3.Close Account");
            System.out.println("Enter Your Choice :");
            mainOperation = scanner.nextInt();

            switch (mainOperation)
            {
                case 1 :
                    openAccount();
                break;

                case  2 :
                    searchAccount();
                break;

                case 3 :
                     searchAccount();  //This funtion first check account is exist and then close account
                break;
            }
        }
        while (mainOperation < 4);

    }

    public  void openAccount() {
        Random random = new Random();

        Account account = new Account();

        int choice ;

        System.out.println("**** Select Bank Account Type **** \n1.Saving AC \n2.Current Account \n3.Fixed Deposit AC \n4.Salary AC \n5.EXIT");

        System.out.println("Enter Your Choice :");
        choice = random.nextInt(1,6);
        System.out.println(choice);

        switch (choice)
        {
            case 1 :
                System.out.println("**** Saving AC ****");
                accountsTypeList.put("Saving AC", account);
                account.enterAccountHolderInfo();
                break;

            case 2 :
                System.out.println("**** Current AC ****");
                accountsTypeList.put("Current AC",account);
                account.enterAccountHolderInfo();
                break;

            case 3 :
                System.out.println("**** Fixed Deposit AC ****");
                accountsTypeList.put("Fixed Deposit AC",account);
                account.enterAccountHolderInfo();
                break;

            case 4 :
                System.out.println("**** Salary AC ****");
                accountsTypeList.put("Salary AC",account);
                account.enterAccountHolderInfo();
                break;
        }
    }


    /**
     * This function is create for code optimization purpose.
     * It will check current Account is available or not.
     *and work on other operation like Serarch Account , Close Account and Other operation
     */
       public void searchAccount() {

           boolean flag = false ;
           if(!accountsTypeList.isEmpty()) {

               System.out.println("Enter Account Number :");
               String accountNumber = scanner.next();

               for(String accountTypeName : accountsTypeList.keySet()) {

                   Account account = accountsTypeList.get(accountTypeName);
                   for(int i=0 ; i<account.accountsList.size(); i++) {

                       AccountModel accountModel = account.accountsList.get(i);
                       if (accountNumber.equals(accountModel.getAccountNumber())) {
                           flag = true ;
                           System.out.println("Account Type :" + accountTypeName);
                           System.out.println(STR."*** Confirm Account ***\n\{accountModel.toString()}");

                           final int CLOSE_ACCOUNT = 3 ;
                           if(mainOperation == CLOSE_ACCOUNT ) {
                               closeAccount(account , accountModel);
                           }
                       }
                   }
               }
           }
           if(!flag) {
               System.out.println("No any Account Available !!!");
           }
    }

    public void closeAccount(Account account , AccountModel accountModel) {
        System.out.println("\nAre you sure to close account. [ y / n ]");
        String confirm = scanner.next();
        if(confirm.charAt(0) == 'y' || confirm.charAt(0) == 'Y'){
            System.out.println("Account Close Successfully");
            account.accountsList.remove(accountModel);
        }
    }

    public static void main(String[] args) {

    BankManagementSystemMain bankManagementSystemMain = new BankManagementSystemMain();
    bankManagementSystemMain.operation();

    }
}
