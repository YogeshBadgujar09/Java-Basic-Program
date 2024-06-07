package com.infogalaxy.interfacedemo;

public interface Interface1 {
    void fun1();
    default void fun2() {
        System.out.println("Fun2 in Interface1");
    }
    static void fun3() {
        System.out.println("Fun3 in Interface1");
    }
}
