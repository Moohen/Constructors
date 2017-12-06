package com.moohen;

public class Main {

    public static void main(String[] args) {

        BankAccount mateusz = new BankAccount();

        mateusz.setBalance(1000);

        mateusz.deposit(100);

        mateusz.withdraw(1100);
    }
}
