package org.example.zajecia.observer;

public class CreditOfferModule implements BankObserver {
    private final double balanceThreshold;

    public CreditOfferModule(double balanceThreshold) {
        this.balanceThreshold = balanceThreshold;
    }

    @Override
    public void update(BankAccount account, String operationType, double amount) {
        if ("WITHDRAW".equals(operationType) && account.getBalance() < balanceThreshold) {
            System.out.printf("[KREDYT] %s, potrzebujesz dodatkowych środków? Oferujemy kredyt do 5000 zł!%n",
                    account.getAccountHolder());
        }
    }
}

