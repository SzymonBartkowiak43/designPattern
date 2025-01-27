package org.example.zajecia.observer;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private final String accountHolder;
    private double balance;
    private final List<BankObserver> observers = new ArrayList<>();

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void attachObserver(BankObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers(String operationType, double amount) {
        for (BankObserver observer : observers) {
            observer.update(this, operationType, amount);
        }
    }

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Kwota wpłaty musi być większa od zera");
        balance += amount;
        System.out.printf("Wpłata: %.2f zł. Nowy stan konta: %.2f zł.%n", amount, balance);
        notifyObservers("DEPOSIT", amount);
    }

    public void withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Kwota wypłaty musi być większa od zera");
        if (amount > balance) throw new IllegalStateException("Brak wystarczających środków");
        balance -= amount;
        System.out.printf("Wypłata: %.2f zł. Nowy stan konta: %.2f zł.%n", amount, balance);
        notifyObservers("WITHDRAW", amount);
    }
}