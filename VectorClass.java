package com.yogesh.listinterface;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorClass
{
    public static void main(String[] args) {

        /**
         * here List is a interface and new is object of List.
         * Here Vector class implements 
         * object of List is created using get a reference of vector class
         * We can also do, Vector<String> name = new Vector<>();
         *
         */

        List<String> name = new Vector<>();
        name.add("yogesh");
        name.add("shubham");
        name.add("jayesh");

        for (int i=0 ; i<name.size() ; i++)
        {
            System.out.println(name.get(i));
        }



    }
}
