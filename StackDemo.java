import java.io.*;

import java.util.*;
 

class StackDemo {

   
    public static void main(String[] args)

    {
 

 
        Stack stack1 = new Stack();
 
 
        Stack<String> stack2 = new Stack<String>();
 

        // pushing the elements

        stack1.push("4");

        stack1.push("6");

        stack1.push("6");
 

        stack2.push("Hi");

        stack2.push("yogesh");

        stack2.push("rohit");
 

          // Printing the Stack Elements

        System.out.println(stack1);

        System.out.println(stack2);

    }
}