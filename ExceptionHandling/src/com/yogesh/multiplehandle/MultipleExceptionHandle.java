package com.yogesh.multiplehandle;

import java.util.Scanner;

public class MultipleExceptionHandle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int a ;
        int b ; 
        String name = null;
        int c = 0;    
        
        System.out.println("Enter a & b :");
        a = scanner.nextInt();
        b = scanner.nextInt();
        
        try {
            c = a / b;
            System.out.println("String Length : " + name.length());
        }
        /**
         * In Java Exception is SuperClass of Predefine exeption classes like ArithmaticException
         * ArrayOutOfBoud , StringOutOfBoud etc so Exception can easily handle all the Exeption in program
         * but we can not give a proper message to exeption
         */
        catch (Exception exception)
        {
            System.out.println("Exception Comes : " + exception.getMessage());
        }
        finally {
            System.out.println("Div : " + c);
        }
        
        
        
    }
    
}
