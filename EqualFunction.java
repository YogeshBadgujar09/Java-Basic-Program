package com.yogesh.stringfunction;

public class EqualFunction {

    public static void main(String[] args) {
        String name = "Yogesh";

        System.out.println(name.equals("yogesh"));
        System.out.println(name.equals("Yogesh"));

        System.out.println(name.equalsIgnoreCase("yogesh"));

    }
}
