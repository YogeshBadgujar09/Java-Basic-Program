package com.yogesh.login;

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



}
