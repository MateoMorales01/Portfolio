package com.pluralsight;

import com.pluralsight.finance.CheckingAccount;
import com.pluralsight.finance.CreditCard;
import com.pluralsight.finance.Gold;
import com.pluralsight.finance.Portfolio;

public class Application {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount("Melvin's Checking", "33681",368);
        CreditCard creditCard = new CreditCard("Melvin's Credit", "48790", 12000);
        Gold gold = new Gold("Melvin's Gold",4000, 12);

        Portfolio portfolio = new Portfolio("Melvin's Portfolio", "Melvin");

        portfolio.add(checkingAccount);
        portfolio.add(creditCard);
        portfolio.add(gold);
        System.out.println(portfolio.getValue());
    }
}
