package com.github.sameerbhilare.strategy.payment;

public class Client {

    public static void main(String[] args) {

        // ✅ Behavior changes at runtime without modifying PaymentService.
        PaymentService service = new PaymentService();
        service.setPaymentStrategy(new CreditCardPaymentStrategy());
        service.processPayment(100.50);

        service.setPaymentStrategy(new UpiPaymentStrategy());
        service.processPayment(200.50);

        service.setPaymentStrategy(new NetBankingPaymentStrategy());
        service.processPayment(300.50);


        // Implementation using lambas
        // Since Strategy is just an interface with one method, it works perfectly with lambdas.
        PaymentStrategy upiPayment = amount -> System.out.println("Paid " + amount + " using UPI (Lambda)");

        // change behavior at runtime
        service.setPaymentStrategy(upiPayment);
        service.processPayment(500);
    }
}
