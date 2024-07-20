package com.yogesh.bankmanagement;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class AccountModel
{

    String name ;
    String aadharNo ;
    String mobileNo ;
    String age ;
    String address ;
    String city ;
    String state ;
    String email ;
    String accountNumber ;
    String balance ;

    public String validateInput(String data, Scanner scanner) {
        Pattern pattern = Pattern.compile("[A-Za-z]{2,}");
        Matcher matcher = pattern.matcher(data);

        while (!matcher.matches())
        {
            System.out.println("please enter valid data[Enter Minimum 2 character");
            data = scanner.next();
            matcher = pattern.matcher(data);
        }

        return data ;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAadharNo(String aadharNo,Scanner scanner) {
        Pattern pattern = Pattern.compile("[0-9]{12}");
        Matcher matcher = pattern.matcher(aadharNo)  ;

        while (!matcher.matches())
        {
            System.out.println("please enter valid Aadhar Number [Enter 12 Digits] ");
            aadharNo = scanner.next();
            matcher = pattern.matcher(aadharNo);
        }

         this.aadharNo = aadharNo;
    }

    public void setMobileNo(String mobileNo,Scanner scanner ) {

        Pattern pattern = Pattern.compile("[0-9]{10}");
        Matcher matcher = pattern.matcher(mobileNo)  ;

        while (!matcher.matches())
        {
            System.out.println("please enter valid Mobile Number [Enter 10 Digits] ");
            mobileNo = scanner.next();
            matcher = pattern.matcher(mobileNo);
        }

        this.mobileNo = mobileNo;
    }

    public void setAge(String age ,Scanner scanner) {

        Pattern pattern = Pattern.compile("[0-9]{2}");
        Matcher matcher = pattern.matcher(age)  ;

        while (!matcher.matches())
        {
            System.out.println("please enter valid age");
            age = scanner.next();
            matcher = pattern.matcher(age);
        }

        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setEmail(String email ,Scanner scanner) {
        Pattern pattern =  Pattern.compile( "^[a-zA-Z0-9_]+@" +  "[a-zA-Z0-9-]+" + "\\." + "[a-z" + "]{2,3}$");
        Matcher matcher =  pattern.matcher(email);

        while (!matcher.matches())
        {
            System.out.println("please enter valid email .[Enter in lowercase] ");
            email = scanner.next();
            matcher = pattern.matcher(email);
        }
        this.email = email;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(String balance) {

        Pattern pattern =  Pattern.compile("^[0-9]{3,}$");
        Matcher matcher =  pattern.matcher(balance);

        while (!matcher.matches())
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter amount above 100 Rs.");
            balance = scanner.next();
            matcher = pattern.matcher(balance);
        }

        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getAadharNo() {
        return aadharNo;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public String getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getEmail() {
        return email;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return STR."NewAccountInfoModel{name='\{name}\{'\''}, aadharNo='\{aadharNo}\{'\''}, mobileNo='\{mobileNo}\{'\''}, age='\{age}\{'\''}, address='\{address}\{'\''}, city='\{city}\{'\''}, state='\{state}\{'\''}, email='\{email}\{'\''}, accountNumber='\{accountNumber}\{'\''}, balance='\{balance}\{'\''}\{'}'}";
    }
}
