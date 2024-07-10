package com.yogesh.bankmanagement;

import java.util.Scanner ;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Name");
        String name = scanner.next();

        Pattern pattern = Pattern.compile("^[A-Za-z]{4,}$");
        Matcher matcher = pattern.matcher(name);
        System.out.println(matcher.matches());




    }
}
