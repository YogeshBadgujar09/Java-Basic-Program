package com.yogesh.functionoverride;


public class Sample {
    void msg()
    {
        System.out.println("override function");
        InterfaceDemo.super.msg();
    }

    public static void main(String[] args) {

        Sample sample = new Sample();
        sample.msg();


    }

}
