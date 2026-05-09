package org.example.inheritance.atm;

class CheckingAccount extends ATMAccount {

    double fee = 15;

    void withdrawWithFee(double amount) {

        double total = amount + fee;

        if (balance >= total) {
            balance -= total;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Fee charged: " + fee);
        } else {
            System.out.println("Insufficient balance (including fee)");
        }
    }

    void showAccountType() {
        System.out.println("Checking Account");
    }
}
