package com.moohen;

public class BankAccount {

    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;
    private String accountNumber;
    private double balance;

    public BankAccount (String customerName, String customerEmailAddress, String customerPhoneNumber,
                        String accountNumber, double balance) {
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public BankAccount (String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
        System.out.println("Matesz your balance is " + getBalance());
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
