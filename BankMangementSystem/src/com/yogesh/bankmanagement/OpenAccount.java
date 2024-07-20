package com.yogesh.bankmanagement;

import java.util.*;

public class OpenAccount {

    Scanner scanner = new Scanner(System.in);
    List<AccountModel> accountsList = new ArrayList<>();

//    public void operation() {
//        int choice ;
//
//        do {
//            System.out.println("\n*** Welcome to Bank Management System ***");
//            System.out.println("\n1.Open Account 2.Close Account  3.Search Account 4.Cash Operation 5.View All Accounts 6.Update KYC 7.EXIT");
//
//            System.out.println("\nEnter Your Choice :");
//            choice = scanner.nextInt();
//
//            switch (choice)
//            {
//                case 1 :
//                    enterAccountHolderInfo();
//                    break;
//
//                case 2 :
//                    closeAccount();
//                    break;
//
//                case 3 :
//                    searchAccount();
//                    break;
//
//                case 4 :
//                    cashOperation();
//                    break;
//
//               case 5 :
//                     viewAllAccounts();
//                break;
//
//                case 6 :
//                    updateKYC();
//                break;
//
//            }
//        } while(choice < 7 );
//    }
//
//
//    public void updateKYC() {
//        AccountModel newAccountInfoModel;// = new NewAccountInfoModel();
//        newAccountInfoModel = findAccount() ;
//
//        if(newAccountInfoModel != null )
//        {
//            System.out.println("--- Confirm Account ---" + newAccountInfoModel.toString() );
//
//            String accountNumber = newAccountInfoModel.getAccountNumber() ;
//            String balance = newAccountInfoModel.getBalance();
//
//          //  multipleAccounts.remove(newAccountInfoModel);
//
//            accountInfoOptimizeCode(newAccountInfoModel) ;
//
//            System.out.println("Your Account Number is :  ");
//            newAccountInfoModel.setAccountNumber(accountNumber);
//            System.out.println(newAccountInfoModel.getAccountNumber());
//
//            newAccountInfoModel.setBalance(balance);
//
//            // multipleAccounts.add(newAccountInfoModel);
//
//        }
//    }
//    public void cashOperation() {
//        System.out.println("\n**** Cash Operation  ****");
//
//        AccountModel newAccountInfoModel = findAccount() ;
//
//        if(newAccountInfoModel != null)
//        {
//            System.out.println("----  Confirm Account Information ----\n"  + newAccountInfoModel.toString());
//
//            System.out.println("\n1.Deposit Cash 2.Withdraw Cash ");
//
//            System.out.println("Enter Your Choice for Cash Operation :");
//            int choice = scanner.nextInt();
//
//            String balance = newAccountInfoModel.balance;
//
//            String amount ;
//
//            switch (choice)
//            {
//
//                case 1 :
//                    amount = enterAmount() ;
//                    balance = String.valueOf(Long.parseLong(balance) + Long.parseLong(amount));
//                break;
//
//                case 2 :
//                    final int MINIMUM_BALANCE = 1000  ;
//
//                    amount = enterAmount() ;
//
//                    String balanceValidation =  String.valueOf(Long.parseLong(balance) - Long.parseLong(amount) );
//
//                    if(Long.parseLong(amount) < Long.parseLong(balance) && Long.parseLong(balanceValidation) >=  MINIMUM_BALANCE)
//                    {
//                        balance = balanceValidation ;
//                    }
//                    else{
//
//                        System.out.println("Your balance is " + balance + " So enter valid amount." );
//
//                        if(Long.parseLong(balanceValidation) <  MINIMUM_BALANCE)
//                           System.out.println("Keep " + MINIMUM_BALANCE + " Minimum amount in Account");
//                    }
//
//                break ;
//            }
//
//            newAccountInfoModel.setBalance(balance);
//        }
//
//    }
//
//    /**
//     * This function is create for Take an amount from user.
//     * Use for code optimization
//     * @return amount for code optimization
//     */
//    public String enterAmount() {
//        System.out.println("Enter a amount for Operation  :");
//        String amount = scanner.next();
//
//        return amount ;
//    }
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

//    public AccountModel findAccount() {
//
//        System.out.println("Enter Account Number  : ");
//        String accountNumber = scanner.next();
//
//       // NewAccountInfoModel newAccountInfoModel1 = null ;
//        boolean flag = false ;
//
//        if(accountsList != null)
//        {
//            for(AccountModel newAccountInfoModel : accountsList)
//            {
//                if(accountNumber.equals(newAccountInfoModel.getAccountNumber()))
//                {
//                    //newAccountInfoModel1 = newAccountInfoModel;
//                    flag = true ;
//
//                    return newAccountInfoModel ;
//                }
//            }
//        }
//        System.out.println("Account is not available");
//
//        return null ;
//    }

    public void accountInfoOptimizeCode(AccountModel newAccountInfoModel) {

        //NewAccountInfoModel newAccountInfoModel = new NewAccountInfoModel();

        System.out.println("Enter Name :");
        newAccountInfoModel.setName(newAccountInfoModel.validateInput(scanner.next(),scanner));

        System.out.println("Enter aadhar number :");
        newAccountInfoModel.setAadharNo(scanner.next(),scanner);

        System.out.println("Enter Mobile Number :");
        newAccountInfoModel.setMobileNo(scanner.next(),scanner);

        System.out.println("Enter Your age :");
        newAccountInfoModel.setAge(scanner.next(),scanner);

        System.out.println("Enter address");
        newAccountInfoModel.setAddress(newAccountInfoModel.validateInput(scanner.next(),scanner));

        System.out.println("Enter City :");
        newAccountInfoModel.setCity(newAccountInfoModel.validateInput(scanner.next(),scanner));

        System.out.println("Enter State :");
        newAccountInfoModel.setState(newAccountInfoModel.validateInput(scanner.next(),scanner));

        System.out.println("Enter email :");
        newAccountInfoModel.setEmail(scanner.next(),scanner);

        //return  newAccountInfoModel;
    }

    public void enterAccountHolderInfo() {


        AccountModel newAccountInfoModel = new AccountModel();
        accountInfoOptimizeCode(newAccountInfoModel);

        System.out.println("Your Account Number is :  ");
        newAccountInfoModel.setAccountNumber(generateAccountNumber());
        System.out.println(newAccountInfoModel.getAccountNumber());

        System.out.println("Enter Initial Balance to Open Account :");
        newAccountInfoModel.setBalance(scanner.next());

        accountsList.add(newAccountInfoModel);
    }

//    public void viewAllAccounts() {
//
//        if(accountsList !=  null)
//        {
//            for (AccountModel multipleAccount : accountsList) {
//                System.out.println(multipleAccount);
//            }
//        }
//
//    }
//
//    public void searchAccount() {
//
//        AccountModel newAccountInfoModel = findAccount() ;
//
//        if(newAccountInfoModel != null){
//            System.out.println(newAccountInfoModel.toString());
//        }
//
//    }
//
//    public void closeAccount() {
//
//        AccountModel newAccountInfoModel = findAccount();
//        if(newAccountInfoModel != null ) {
//             accountsList.remove(newAccountInfoModel) ;
//        }
//
//    }


//    public static void main(String[] args) {
//
//        BankManagementMain bankManagementMain = new BankManagementMain();
//        bankManagementMain.operation();
//
//    }

}