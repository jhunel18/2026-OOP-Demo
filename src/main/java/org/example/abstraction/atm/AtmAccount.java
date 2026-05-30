package org.example.abstraction.atm;

abstract class AtmAccount {
    protected double balance;

    public AtmAccount(double balance) {
        this.balance = balance;
    }

    //Concrete method
    public void deposit(double amount) {
        balance += amount;
    }
    // abstract method
    public abstract void withdraw(double amount);
}
