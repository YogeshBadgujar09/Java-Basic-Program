package com.yogesh.bankmanagement;
import java.util.Map ;
import  java.util.HashMap ;
import java.util.Random;
import java.util.Scanner;

public class BankAccountType {

    Random random = new Random();

    //Scanner scanner = new Scanner(System.in);
    Map<String,BankManagementMain> multipleAccountType = new HashMap<>();
    public void chooseAccountType(){

        BankManagementMain bankManagementMain ;

        System.out.println("**** Account Type ****   \n1.Saving AC  \n2.Current AC \n3.Fixed Deposit AC \n4.Salary AC ");

        System.out.println("\nEnter Number For Account Type.");
        int accountType = random.nextInt(1,5);

        System.out.println(accountType);

        switch (accountType)
        {
            case 1 :
                multipleAccountType.put("SavingAC" , new BankManagementMain());

                break;

            case 2 :
                multipleAccountType.put("CurrentAC" ,new BankManagementMain());
                break;

            case 3 :
                multipleAccountType.put("FixedDepositAC" ,new BankManagementMain());
                break;

            case 4 :
                multipleAccountType.put("SalaryAC" ,new BankManagementMain());
                break;
        }


    }


    public static void main(String[] args) {

    BankAccountType bankAccountType = new BankAccountType();
    bankAccountType.chooseAccountType();



    }

}
