package org.example.zajecia.observer;

public interface BankObserver {
    void update(BankAccount account, String operationType, double amount);
}