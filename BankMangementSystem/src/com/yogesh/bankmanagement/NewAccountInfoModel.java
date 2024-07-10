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

    public String getName() {
        return name;
    }

    public void setName(String name) {

        Pattern pattern = Pattern.compile("^[A-Za-z]{2,}$");
        Matcher matcher = pattern.matcher(name);

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

        Pattern pattern = Pattern.compile("^[0-9]{12}$");
        Matcher matcher = pattern.matcher(aadharNo);

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
        this.mobileNo = mobileNo;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
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
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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
        this.balance = balance;
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
