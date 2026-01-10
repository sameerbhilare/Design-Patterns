package com.github.sameerbhilare.strategy.payment;

// algorithm
public class NetBankingPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Net Banking.");
    }
}
