package com.yogesh.bankmanagement;

public class StringAdd {
    public static void main(String[] args) {
        String Balane = "1000";
        String DB = "100";

        Balane = String.valueOf(Long.valueOf(Balane) + Long.valueOf(DB));

        System.out.println(Balane);

    }
}
