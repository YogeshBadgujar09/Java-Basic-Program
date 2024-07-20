package com.yogesh.bankmanagement;
import java.util.Random ;
import java.util.HashMap ;
import java.util.Map ;

public class BankManagementSystemMain {

    public static void main(String[] args) {

        Map<String, OpenAccount> accountsTypeList = new HashMap<>();

        Random random = new Random();

        System.out.println("**** Select Bank Account Type **** \n1.Saving AC \n2.Current Account \n3.Fixed Deposit AC \n4.Salary AC");

        System.out.println("Enter Your Choice :");
        int choice = random.nextInt(1,5);

        switch (choice)
        {
            case 1 :
                System.out.println("**** Saving AC ****");
                accountsTypeList.put("Saving AC",new OpenAccount());
                new OpenAccount().enterAccountHolderInfo();
                break;

            case 2 :
                System.out.println("**** Current AC ****");
                accountsTypeList.put("Current AC",new OpenAccount());
                new OpenAccount().enterAccountHolderInfo();
                break;

            case 3 :
                System.out.println("**** Fixed Deposit AC ****");
                accountsTypeList.put("Fixed Deposit AC",new OpenAccount());
                new OpenAccount().enterAccountHolderInfo();
                break;

            case 4 :
                System.out.println("**** Salary AC ****");
                accountsTypeList.put("Salary AC",new OpenAccount());
                new OpenAccount().enterAccountHolderInfo();
                break;
        }


   
    }


}
