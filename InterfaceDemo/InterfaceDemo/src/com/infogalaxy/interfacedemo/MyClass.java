package com.infogalaxy.interfacedemo;

public class MyClass implements Interface1{
    @Override
    public void fun1() {
        System.out.println("Fun1 in MyClass");
    }
    @Override
    public void fun2() {
        System.out.println("Fun2 in MyClass");
        Interface1.super.fun2();
    }
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.fun1();
        myClass.fun2();
        Interface1.fun3();
    }
}
