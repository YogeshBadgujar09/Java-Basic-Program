package com.infogalaxy.addressbook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {
    Map<String,AddressBook> addressBookMap = new HashMap<>();
    Scanner scanner = new Scanner(System.in);
    public void addAddressBook() {
        System.out.println("Enter the AddressBoon Name:");
        String addressBookName = scanner.next();
        //AddressBook addressBook = new AddressBook();
        if(addressBookMap.containsKey(addressBookName)) {
            System.out.println("This AddressBook is Already Available");
        } else {
            addressBookMap.put(addressBookName,new AddressBook());
            System.out.println("New Address Book Added.");
        }
    }
    public void displayAddressBook() {
        System.out.println(addressBookMap.keySet());
    }
    public void deleteAddressBook() {
        System.out.println("Enter the AddressBook Name to Delete:");
        String addressBookName = scanner.next();
        if(addressBookMap.containsKey(addressBookName)) {
            addressBookMap.remove(addressBookName);
            System.out.println("AddressBook Deleted");
        } else {
            System.out.println("AddressBook with Given Name is Not Available");
        }
    }
    public void selectAddressBook() {
        displayAddressBook();
        System.out.println("Please Enter the AddressBook Name to Select for Contact:");
        String addressBookName = scanner.next();
        if(addressBookMap.containsKey(addressBookName)) {
            AddressBook addressBook = addressBookMap.get(addressBookName);
            addressBook.contactMenu();
        } else {
            System.out.println("AddressBook with Given Name Not Available");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        AddressBookMain addressBookMain = new AddressBookMain();
        do {
            System.out.println("**** ADDRESS BOOK MENU ****");
            System.out.println("1. ADD ADDRESS BOOK \n2. DISPLAY ADDRESS BOOKS \n3. REMOVE ADDRESS BOOK \n4. SELECT ADDRESS BOOK \n5. EXIT");
            System.out.println("Enter the Choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addressBookMain.addAddressBook();
                    break;
                case 2:
                    addressBookMain.displayAddressBook();
                    break;
                case 3:
                    addressBookMain.deleteAddressBook();
                    break;
                case 4:
                    addressBookMain.selectAddressBook();
                    break;
            }
        } while (choice<=5);
    }
}
