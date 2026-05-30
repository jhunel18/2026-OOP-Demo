package org.example.abstraction.payment;

public class TestPaymentMethod {
    public static void main(String[] args) {
        GcashPayment gcashPayment = new GcashPayment();
        System.out.println(gcashPayment.pay(1000));

        CreditCardPayment creditCardPayment = new CreditCardPayment();
        System.out.println(creditCardPayment.pay(1000));

        PaypalPayment paypalPayment = new PaypalPayment();
        System.out.println(paypalPayment.pay(1000));

        MariBankPayment mariBankPayment = new MariBankPayment();
        System.out.println(mariBankPayment.pay(1000));
        System.out.println(mariBankPayment.pay(2000));

    }
}
