package com.moohen;

public class BankAccount {

    private String customerName;
    private String customerEmailAdress;
    private String customerPhoneNumber;
    private String accountNumber;
    private double balance;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAdress() {
        return customerEmailAdress;
    }

    public void setCustomerEmailAdress(String customerEmailAdress) {
        this.customerEmailAdress = customerEmailAdress;
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
