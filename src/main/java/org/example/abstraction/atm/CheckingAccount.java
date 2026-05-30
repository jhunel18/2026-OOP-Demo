package org.example.abstraction.atm;

public class CheckingAccount extends AtmAccount{

    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawal completed");
    }
}
