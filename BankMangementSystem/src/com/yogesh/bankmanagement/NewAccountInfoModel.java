package com.yogesh.bankmanagement;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class NewAccountInfoModel
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

    Pattern pattern ;
    Matcher matcher ;
    public String getName() {
        return name;
    }

    public void setName(String name) {

        pattern = Pattern.compile("^[A-Za-z]{2,}$");
        matcher = pattern.matcher(name);

        if(matcher.matches())
        {
            this.name = name;
        }
        else {
            System.out.println("Enter valid name");
        }

    }



    public String getAadharNo() {
        return aadharNo;
    }

    public void setAadharNo(String aadharNo) {

        pattern = Pattern.compile("^[0-9]{12}$");
        matcher = pattern.matcher(aadharNo);

        if(matcher.matches())
        {
            this.aadharNo = aadharNo;
        }
        else {
            System.out.println("Enter valid Aadhar Number");
        }

    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {

        pattern = Pattern.compile("^[0-9]{10}$");
        matcher = pattern.matcher(mobileNo);

        if(matcher.matches())
        {
            this.mobileNo = mobileNo;
        }
        else{
            System.out.println("Enter valid Mobile Number ");
        }

    }

    public String getAge() {
        return age;
    }

    public void setAge(String age)
    {
        pattern = Pattern.compile("^[0-9]{2}$");
        matcher = pattern.matcher(age);

        if(matcher.matches())
        {
            this.age = age ;
        }
        else{
            System.out.println("Enter valid Age ");
        }

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {

        pattern = Pattern.compile("^[A-Za-z]{4,}$");
        matcher = pattern.matcher(city);

        if(matcher.matches())
        {
            this.city = city ;
        }
        else {
            System.out.println("Enter Valid City Name Minimum 4 Character");
        }
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {


        pattern = Pattern.compile("^[A-Za-z]{3,}$");
        matcher = pattern.matcher(city);

        if(matcher.matches())
        {
            this.state = state;
        }
        else {
            System.out.println("Enter Valid State");
        }
    }

    public String getEmail() {


        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {

        pattern = Pattern.compile("^[0-9]{1,}$");
        matcher = pattern.matcher(balance);

        if(matcher.matches())
        {
            this.balance = balance;
        }
        else {
            System.out.println("Enter Valid State");
        }


    }


    @Override
    public String toString() {
        return "NewAccountInfoModel{" +
                "name='" + name + '\'' +
                ", aadharNo='" + aadharNo + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", email='" + email + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance='" + balance + '\'' +
                '}';
    }
}
