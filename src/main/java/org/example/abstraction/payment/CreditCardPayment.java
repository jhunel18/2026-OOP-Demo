package org.example.abstraction.payment;

public class CreditCardPayment implements PaymentMethod{

    @Override
    public double pay(double amount) {
        double fee = amount * 0.02;
        return amount + fee;
    }
}
