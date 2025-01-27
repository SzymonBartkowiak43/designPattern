package org.example.zajecia.observer;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Jan Kowalski", 1500);

        account.attachObserver(new CreditOfferModule(1000));
        account.attachObserver(new DepositOfferModule(5000));
        account.attachObserver(new CreditCardOfferModule(3));

        account.withdraw(600);
        account.deposit(5000);
        account.withdraw(100);
        account.withdraw(100);
        account.withdraw(100);
        account.deposit(200);
        account.withdraw(100);
    }
}