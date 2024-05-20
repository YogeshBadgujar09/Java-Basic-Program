package com.yogesh.customcexception;

import java.util.Scanner;

public class DrivingLicence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Age :");
        int age = scanner.nextInt();

        try{
            if(age < 18){
                throw new CustomException("Enter valid age ");
            }
        }
        catch (Exception ex)
        {
            System.out.println("Exception : " + ex.getMessage());
        }

    }

}
