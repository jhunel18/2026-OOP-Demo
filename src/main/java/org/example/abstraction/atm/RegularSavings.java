package org.example.abstraction.atm;

public class RegularSavings extends AtmAccount{

    public RegularSavings(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance <= 100){
            System.out.println("100.00 is the maintaining balance");
        }
        balance -= amount;
    }
}
