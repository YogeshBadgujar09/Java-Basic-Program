package com.yogesh.simpleprogram;

public class Sample implements Interface1 {

    @Override
    public void function1() {
            System.out.println("Function1 call");
    }

    @Override
    public void function2() {
        System.out.println("Function2 call");
    }



    public static void main(String[] args) {

        Sample sample = new Sample();
        sample.function1();
        sample.function2();
    }


}
