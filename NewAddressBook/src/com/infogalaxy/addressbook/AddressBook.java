package com.infogalaxy.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    //Contact contact = new Contact();
    ArrayList<Contact> contactList = new ArrayList<>();

    public void addContact() {
        Contact contact = new Contact();
        System.out.println("Enter the First Name:");
        contact.setFirstName(sc.next());
        System.out.println("Enter the Last Name:");
        contact.setLastName(sc.next());
        System.out.println("Enter the Address:");
        contact.setAddress(sc.next());
        System.out.println("Enter the City:");
        contact.setCity(sc.next());
        System.out.println("Enter the State:");
        contact.setState(sc.next());
        System.out.println("Enter the Zipcode:");
        contact.setZipcode(sc.next());
        System.out.println("Enter the Phone Number:");
        contact.setPhoneNumber(sc.next());
        System.out.println("Enter the Email:");
        contact.setEmail(sc.next());
        contactList.add(contact);
    }

    public void displayContact() {
        if(contactList.isEmpty()) {
            System.out.println("Contact Lits is Empty");
        } else {
            for(int i=0;i<contactList.size();i++) {
                Contact contact = contactList.get(i);
                System.out.println(contact.toString());
            }
        }
    }

    void editContact() {
        if(contactList.isEmpty()) {

        } else {
            System.out.println("Enter the First Name to Edit Contact:");
            String fname = sc.next();
            boolean found = false;

            for(int i=0;i<contactList.size();i++) {
                Contact contact = contactList.get(i);
                if (fname.equals(contact.getFirstName())) {
                    found = true;
                    System.out.println("COntact with Given Name Found");
                    System.out.println("Enter the Last Name:");
                    contact.setLastName(sc.next());
                    System.out.println("Enter the Address:");
                    contact.setAddress(sc.next());
                    System.out.println("Enter the City:");
                    contact.setCity(sc.next());
                    System.out.println("Enter the State:");
                    contact.setState(sc.next());
                    System.out.println("Enter the Zipcode:");
                    contact.setZipcode(sc.next());
                    System.out.println("Enter the Phone Number:");
                    contact.setPhoneNumber(sc.next());
                    System.out.println("Enter the Email:");
                    contact.setEmail(sc.next());
                }
            }
            if(!found) {
                System.out.println("Contact with Given Name Not Found");
            }
        }
    }

    public void deleteContact() {
        System.out.println("Enter the First Name to Delete the Contact:");
        String fname = sc.next();
        boolean found = false;

        for(int i=0;i<contactList.size();i++) {
            Contact contact = contactList.get(i);
            if (fname.equals(contact.getFirstName())) {
                found = true;
                System.out.println("COntact with Given Name Found");
                contactList.remove(contact);
            }
        }
        if(!found) {
            System.out.println("Contact with Given Name Not Found");
        }
    }

    public void contactMenu() {
        int choice=0;
        do {
            System.out.println("**********ADDRESS BOOK**********");
            System.out.println("1. ADD CONTACT \n2. EDIT CONTACT \n3. DELETE CONTACT \n4. DISPLAY CONTACT \n5. EXIT");
            System.out.println("Enter the Opration:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    editContact();
                    break;
                case 3:
                    deleteContact();
                    break;
                case 4:
                    displayContact();
                    break;
            }
        } while(choice<=4);
    }
}
