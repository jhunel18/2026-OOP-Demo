package org.example.abstraction.payment;

public class GcashPayment implements PaymentMethod{
    @Override
    public double pay(double amount) {
        double cashback = amount * 0.05;
        return amount - cashback;
    }
}
