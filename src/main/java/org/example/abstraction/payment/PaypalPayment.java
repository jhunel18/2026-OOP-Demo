package org.example.abstraction.payment;

public class PaypalPayment implements PaymentMethod{
    @Override
    public double pay(double amount) {
        double serviceFee = 50.00;
        return amount + serviceFee;
    }
}
