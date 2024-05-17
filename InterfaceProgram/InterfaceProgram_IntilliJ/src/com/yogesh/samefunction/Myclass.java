package com.yogesh.samefunction;

public class Myclass implements Interface1 , Interface2{


    /**
     * function1 of Interface1 and function1 of Interface2 will automatically merge bye compiler
     */
    @Override
    public void function1() {
        System.out.println("Function1 Call");
    }

    @Override
    public void function2() {
        System.out.println("Function2 call");
    }



        public static void main(String[] args) {

        Myclass myclass = new Myclass();
        myclass.function1();
        myclass.function2();

        }



}
