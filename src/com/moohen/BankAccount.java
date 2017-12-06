package com.moohen;

public class BankAccount {

    private int accountNumber;
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    private double balance;
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
        System.out.println("Matesz your balance is " + getBalance());
    }

    private String customerName;
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    private String email;
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    private int phoneNumber;
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Matesz your balance is " + getBalance());
    }

    public void withdraw(double withdrawAmount) {
        if (withdrawAmount <= this.balance) {
            this.balance -= withdrawAmount;
            System.out.println("Matesz your balance is " + getBalance());
        } else {
            System.out.println("You try withdraw more money than you have on account");
        }
    }


}
