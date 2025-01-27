package org.example.zajecia.observer;

public class CreditCardOfferModule implements BankObserver {
    private final int withdrawalThreshold;
    private int withdrawalCount;

    public CreditCardOfferModule(int withdrawalThreshold) {
        this.withdrawalThreshold = withdrawalThreshold;
    }

    @Override
    public void update(BankAccount account, String operationType, double amount) {
        if ("WITHDRAW".equals(operationType)) {
            withdrawalCount++;
            if (withdrawalCount >= withdrawalThreshold) {
                System.out.printf("[KARTA] %s, odbierz premiową kartę po %d wypłatach!%n",
                        account.getAccountHolder(), withdrawalCount);
                withdrawalCount = 0;
            }
        }
    }
}