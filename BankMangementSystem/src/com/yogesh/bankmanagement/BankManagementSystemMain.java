package com.yogesh.bankmanagement;
import java.util.Random ;
import java.util.HashMap ;
import java.util.Map ;

import java.util.Scanner ;

public class BankManagementSystemMain {
    Map<String, Account> accountsTypeList = new HashMap<>();
    Scanner scanner = new Scanner(System.in);
    private int mainOperation;
    public void operation() {
        System.out.println("****  WelCome to Bank Management System ****");

        do {
            System.out.println("\n1.Open Account \n2.Search Account \n3.Cash Operation \n4.Update KYC \n5.Close Account");
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

                case 3:
                    //Use for cash Operation
                    searchAccount();
                    break;

                case  4 :
                    //Work for Update KYC
                    searchAccount();
                    break;
                case 5:
                    //Work for Close Account
                     searchAccount();  //This funtion first check account is exist and then close account
                break;
            }
        } while (mainOperation < 6);
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
                           System.out.println("Account Type :" + accountTypeName + "\n" +STR."*** Confirm Account ***\n\{accountModel.toString()}");

                           final int CLOSE_ACCOUNT = 5 ;
                           final int UPDATE_KYC = 4 ;
                           final int CASH_OPERATION = 3 ;
                           if(mainOperation == CLOSE_ACCOUNT ) {
                               closeAccount(account , accountModel);
                           }
                           if (mainOperation == UPDATE_KYC){
                               updateKYC(account,accountModel);
                           }
                           if (mainOperation == CASH_OPERATION){
                               cashOperation(accountModel);
                           }
                       }
                   }
               }
           }
           if(!flag) {
               System.out.println("No any Account Available !!!");
           }
    }

    public void cashOperation(AccountModel accountModel)
    {

        System.out.println("\n1.Deposit Cash 2.Withdraw Cash ");

            System.out.println("Enter Your Choice for Cash Operation :");
            int choice = scanner.nextInt();

            String balance = accountModel.balance;

            String amount ;

            switch (choice)
            {
                case 1 :
                    amount = enterAmount() ;
                    balance = String.valueOf(Long.parseLong(balance) + Long.parseLong(amount));
                break;

                case 2 :
                    final int MINIMUM_BALANCE = 1000  ;
                    amount = enterAmount() ;

                    String balanceValidation =  String.valueOf(Long.parseLong(balance) - Long.parseLong(amount) );
                    if(Long.parseLong(amount) < Long.parseLong(balance) && Long.parseLong(balanceValidation) >=  MINIMUM_BALANCE)
                    {
                        balance = balanceValidation ;
                    }
                    else{
                        System.out.println("Your balance is " + balance + " So enter valid amount." );

                        if(Long.parseLong(balanceValidation) <  MINIMUM_BALANCE)
                           System.out.println("Keep " + MINIMUM_BALANCE + " Minimum amount in Account");
                    }
                break ;
            }
            accountModel.setBalance(balance);
        }


    /**
     * This function is create for Take an amount from user.
     * Use for code optimization
     * @return amount for code optimization
     */
    public String enterAmount() {
        System.out.println("Enter a amount for Operation  :");
        String amount = scanner.next();

        return amount ;
    }
        

    public void updateKYC(Account account , AccountModel accountModel) {
        account.accountInfoOptimizeCode(accountModel);
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
