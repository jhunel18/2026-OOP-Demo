package org.example.inheritance.atm;

class SavingsAccount extends ATMAccount {

    void addInterest() {
        balance += 100;
        System.out.println("Interest Added");
    }
}
