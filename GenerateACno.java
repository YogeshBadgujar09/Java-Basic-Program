//package com.yogesh.bankmanagement;

import java.util.Random;

public class GenerateACno {
    public void generateAccountNumber()
    {
        Random random = new Random();
        int accountNumber ;
        String stringForm ;

        while(true)
        {
            accountNumber =  random.nextInt();
            stringForm = String.valueOf(accountNumber);

            if(accountNumber > 1 && stringForm.length() == 10)
            {
                System.out.println(accountNumber);
                break ;
            }

        }

    }

    public static void main(String[] args) {

        GenerateACno obj = new GenerateACno();
        obj.generateAccountNumber();


    }
}