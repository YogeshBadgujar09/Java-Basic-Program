package com.infogalaxy.addressbook;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
        String name = "Nayan";

        String nameExp = "^[A-Z]{1}[A-Za-z]{2,}$";
		Pattern pattern = Pattern.compile(nameExp);
        Matcher matcher = pattern.matcher(name);
        System.out.println("Valid Name = "+matcher.matches());

        String mobno = "1234567890";
        Pattern pattern1 = Pattern.compile("^[0-9]{10}$");
        Matcher matcher1 = pattern1.matcher(mobno);
        System.out.println("Valid Mobile Number:"+matcher1.matches());
    }
}
