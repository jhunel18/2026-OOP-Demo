package org.example.abstraction.payment;

public class MariBankPayment implements PaymentMethod{
    @Override
    public double pay(double amount) {
        double cashback;
        if(amount <= 1000){
            cashback = amount * 0.05;
        }
        else {
            cashback = amount * 0.10;
        }
        return amount - cashback;
    }
}
