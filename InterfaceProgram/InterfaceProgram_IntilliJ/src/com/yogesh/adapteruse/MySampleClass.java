package com.yogesh.adapteruse;


import com.yogesh.samefunction.Myclass;

/**
 * MySample is Main Class
 * and UnderstandAdapterClass show adapter class use where interface is implements
 */

public class MySampleClass extends UnderstandAdapterClass {

    /**Here , we don't need to implements all function ,
     * we use only Some function which we want touse ,
     * but that all function are implements in a class that class called Adapter class
     * and extend that class where you want to use function ;
      */


    public static void main(String[] args) {

        MySampleClass mySampleClass = new MySampleClass();
        mySampleClass.function();
    }

}
