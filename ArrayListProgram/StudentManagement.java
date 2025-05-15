package com.yogesh.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Welcome to the Student Management System!");

        while (true) {
            System.out.println("Enter a command (add, remove, display, exit):");
            command = scanner.nextLine();

            switch (command.toLowerCase()) {
                case "add":
                    System.out.println("Enter the student's name to add:");
                    String studentName = scanner.nextLine();
                    students.add(studentName); // Add the student to the list
                    System.out.println("Added: " + studentName);
                    break;

                case "remove":
                    System.out.println("Enter the student's name to remove:");
                    String nameToRemove = scanner.nextLine();
                    if (students.remove(nameToRemove)) {
                        System.out.println("Removed: " + nameToRemove);
                    } else {
                        System.out.println("Student not found: " + nameToRemove);
                    }
                    break;

                case "display":
                    System.out.println("Current students in the list: " + students);
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
