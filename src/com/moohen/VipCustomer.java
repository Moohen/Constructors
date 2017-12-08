package com.moohen;

public class VipCustomer {

    private String nameVipCustomer;
    private String emailAddress;
    private double creditLimit;

    public VipCustomer() {
        this("Default name", "Default email address", 10000);
    }

    public VipCustomer(String nameVipCustomer, String emailAddress) {
        this(nameVipCustomer, emailAddress, 10000);
    }

    public VipCustomer(String nameVipCustomer, String emailAddress, double creditLimit) {
        this.nameVipCustomer = nameVipCustomer;
        this.emailAddress = emailAddress;
        this.creditLimit = creditLimit;
    }

    public String getNameVipCustomer() {
        return nameVipCustomer;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

}
