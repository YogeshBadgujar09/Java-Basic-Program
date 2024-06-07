package com.infogalaxy.addressbook;

@FunctionalInterface
interface Calc {
    int add(int a,int b);
}

public class MyClass {
    public static void main(String[] args) {
        Calc obj = (a,b) -> a+b;
        int c = obj.add(5,9);
        System.out.println("Add="+c);
    }
}
