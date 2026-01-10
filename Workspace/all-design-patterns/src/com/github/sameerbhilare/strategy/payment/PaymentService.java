package com.github.sameerbhilare.strategy.payment;

// Context
public class PaymentService {

    PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount) {
        paymentStrategy.pay(amount);
    }
}
