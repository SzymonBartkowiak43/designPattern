package org.example.zajecia.observer;

public class DepositOfferModule implements BankObserver {
    private final double depositThreshold;

    public DepositOfferModule(double depositThreshold) {
        this.depositThreshold = depositThreshold;
    }

    @Override
    public void update(BankAccount account, String operationType, double amount) {
        if ("DEPOSIT".equals(operationType) && amount >= depositThreshold) {
            System.out.printf("[LOKATA] %s, zainwestuj %.2f zł w lokatę 5%%!%n",
                    account.getAccountHolder(), amount);
        }
    }
}