/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yogesh.backend;

/**
 *
 * @author Yogesh
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputValidation {

    Pattern pattern ;
    Matcher matcher ;
    public String mobileNoValidation(String mobileNo , Scanner scanner){
         pattern = Pattern.compile("^[0-9]{10}$");
         matcher = pattern.matcher(mobileNo);

        while(!matcher.matches())
        {
            System.out.println("Please enter valid mobile number ... !!!");
            mobileNo = scanner.next();
            matcher = pattern.matcher(mobileNo);
        }
        return mobileNo;
    }

    public String emailIdValidation(String emailId , Scanner scanner)
    {
        pattern = Pattern.compile( "^[a-zA-Z0-9_+&*-]+@" +  "[a-zA-Z0-9-]+" + "\\." + "[a-z" + "]{2,3}$");
        matcher = pattern.matcher(emailId);

        while(!matcher.matches())
        {
            System.out.println("please enter valid gmail .... !!!");
            emailId = scanner.next();
            matcher = pattern.matcher(emailId);
        }
        return emailId ;
    }
    
    public String passwordValidation(String password, Scanner scanner)
    {
        pattern = Pattern.compile( "^[a-zA-Z0-9_+&*-]{8,15}$");
        matcher = pattern.matcher(password);

        while(!matcher.matches())
        {
          
            final int  MAXIMUM_PASS_SIZE = 15;
            final int MINIMUM_PASS_SIZE = 8 ;
        
            if(password.length()< MINIMUM_PASS_SIZE){
                System.out.println("passward minimum size should be 8 Character ");
            } else if( password.length() > MAXIMUM_PASS_SIZE){
                System.out.println("passward maximum size should be 15 Character ");
            }
            
            
            password = scanner.next();
            matcher = pattern.matcher(password);
        }
        return password ;
    }

}

