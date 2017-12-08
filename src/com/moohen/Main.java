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

        VipCustomer mateuszVipAccount = new VipCustomer("Mateusz", "moohen@gmail.com", 1000000);

        System.out.println(mateuszVipAccount.getNameVipCustomer());
        System.out.println(mateuszVipAccount.getCreditLimit());
        System.out.println(mateuszVipAccount.getEmailAddress());

        VipCustomer aniaVipAccount = new VipCustomer("Ania", "ania@gmail.com");

        System.out.println(aniaVipAccount.getNameVipCustomer());
        System.out.println(aniaVipAccount.getCreditLimit());
        System.out.println(aniaVipAccount.getEmailAddress());

        VipCustomer zbyszekVipAccount = new VipCustomer();

        System.out.println(zbyszekVipAccount.getNameVipCustomer());
        System.out.println(zbyszekVipAccount.getCreditLimit());
        System.out.println(zbyszekVipAccount.getEmailAddress());

    }
}
