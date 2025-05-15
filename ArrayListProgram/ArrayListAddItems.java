package com.yogesh.arraylist;


import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAddItems {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Welcome to the ArrayList Item Adder!");

        while (true) {
            System.out.println("Enter a command (add, display, exit):");
            command = scanner.nextLine();

            switch (command.toLowerCase()) {
                case "add":
                    System.out.println("Enter an item to add:");
                    String item = scanner.nextLine();
                    items.add(item); // Add the item to the list
                    System.out.println("Added: " + item);
                    break;

                case "display":
                    System.out.println("Current items in the list: " + items);
                    break;

                case "exit":
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid command. Please try again.");
            }
        }
    }
}
