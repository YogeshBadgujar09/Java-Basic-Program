package com.yogesh.bankmanagement;

import java.util.List;
import java.util.Scanner ;
import java.util.Random ;
import java.util.ArrayList ;

public class BankManagementMain {

    Scanner scanner = new Scanner(System.in);
    List<NewAccountInfoModel> multipleAccounts = new ArrayList<>();

    public void operation() {
        int choice ;

        do {
            System.out.println("\n*** Welcome to Bank Management System ***");
            System.out.println("\n1.Open Account 2.Close Account  3.Search Account 4.Cash Operation 5.View All Accounts 6.Update KYC");

            System.out.println("\nEnter Your Choice :");
            choice = scanner.nextInt();

            switch (choice)
            {
                case 1 :
                    openAccount();
                    break;

                case 2 :
                    closeAccount();
                    break;

                case 3 :
                    searchAccount();
                    break;

                case 4 :
                    cashOperation();
                    break;

               case 5 :
                     viewAllAccounts();
                break;

                case 6 :
                    updateKYC();
                break;

            }
        } while(choice < 7 );
    }


    public void updateKYC() {
        NewAccountInfoModel newAccountInfoModel = findAccount() ;

        if(newAccountInfoModel != null )
        {
            System.out.println("--- Confirm Account ---" + newAccountInfoModel.toString() );

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

          }
    }
    public void cashOperation() {
        System.out.println("\n**** Cash Operation  ****");

        NewAccountInfoModel newAccountInfoModel = findAccount() ;

        if(newAccountInfoModel != null)
        {
            System.out.println("----  Confirm Account Information ----\n"  + newAccountInfoModel.toString());

            System.out.println("\n1.Deposit Cash 2.Withdraw Cash ");

            System.out.println("Enter Your Choice for Cash Operation :");
            int choice = scanner.nextInt();

            String balance = newAccountInfoModel.balance;

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

            newAccountInfoModel.setBalance(balance);
        }

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
    public String generateAccountNumber() {

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

    public NewAccountInfoModel findAccount() {
        System.out.println("Enter Account Number  : ");
        String accountNumber = scanner.next();

        boolean flag = false ;

        if(multipleAccounts != null)
        {
            for(NewAccountInfoModel newAccountInfoModel : multipleAccounts )
            {
                if(accountNumber.equals(newAccountInfoModel.getAccountNumber()))
                {
                    flag = true ;
                    return newAccountInfoModel ;
                }
            }
        }
        if(!flag){
            System.out.println("Account is not available");
        }
        return null ;
    }

    public void openAccount() {

        NewAccountInfoModel newAccountInfoModel = new NewAccountInfoModel();

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

    public void viewAllAccounts() {

        if(multipleAccounts !=  null)
        {
            for (NewAccountInfoModel multipleAccount : multipleAccounts) {
                System.out.println(multipleAccount);
            }
        }

    }

    public void searchAccount() {

        NewAccountInfoModel newAccountInfoModel = findAccount() ;

        if(newAccountInfoModel != null){
            System.out.println(newAccountInfoModel.toString());
        }

    }

    public void closeAccount() {

        NewAccountInfoModel newAccountInfoModel = findAccount();
        if(newAccountInfoModel != null ) {
             multipleAccounts.remove(newAccountInfoModel) ;
        }

    }


    public static void main(String[] args) {

        BankManagementMain bankManagementMain = new BankManagementMain();
        bankManagementMain.operation();

    }

}