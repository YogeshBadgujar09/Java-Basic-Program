package com.yogesh.functionoverride;

public interface InterfaceDemo {

     default void msg(){
          System.out.println("msg function call");
     }


}
