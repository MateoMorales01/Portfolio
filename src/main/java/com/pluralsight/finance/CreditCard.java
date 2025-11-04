package com.pluralsight.finance;

public class CreditCard extends Account {
    public CreditCard(String name, String accountNumber, double balance) {
        super(name, accountNumber, balance);
    }

    @Override
    public double getValue() {
        return getBalance();
    }
}
