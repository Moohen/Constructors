package com.moohen;

public class Main {

    public static void main(String[] args) {

        BankAccount mateuszAccount = new BankAccount("Mateusz", "matt.moohen@gmail.com",
                                        "510-066-248", "1111-2222-3333-4444", 1000);

        System.out.println(mateuszAccount.getBalance());
        System.out.println(mateuszAccount.getAccountNumber());

        mateuszAccount.setBalance(1000);

        mateuszAccount.deposit(100);

        mateuszAccount.withdraw(1100);

        mateuszAccount.withdraw(1);
    }
}
