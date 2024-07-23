package com.yogesh.bankmanagement;
import java.util.Random ;
import java.util.HashMap ;
import java.util.Map ;

import java.util.Scanner ;

public class BankManagementSystemMain {

    Map<String, Account> accountsTypeList = new HashMap<>();
    public  void openAccount()
    {
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

    public void findAccount() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Account to find :");
        String accountNumber = scanner.next();

        for(String accountTypeName : accountsTypeList.keySet()) {

            System.out.println("Account Type :" + accountTypeName);
            Account account = accountsTypeList.get(accountTypeName);

            for(int i=0 ; i<account.accountsList.size(); i++)
            {
                AccountModel accountModel  = account.accountsList.get(i);

                if (accountNumber.equals(accountModel.getAccountNumber()))
                {
                    System.out.println("*** Account Information  ***\n" + accountModel.toString());
                }

            }
          
        }



    }

    public static void main(String[] args) {

    BankManagementSystemMain bankManagementSystemMain = new BankManagementSystemMain();
    bankManagementSystemMain.openAccount();


    }
}
