package com.yogesh.defaultfunction;

public interface InterfaceDemo {

    /**
     * default function can define in interface
     */
    default void msg()
    {
        System.out.println("Default function call");
    }

}
