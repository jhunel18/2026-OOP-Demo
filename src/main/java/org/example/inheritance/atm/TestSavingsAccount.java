package org.example.inheritance.atm;

public class TestSavingsAccount {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount();

        acc.deposit(1000);
        acc.withdraw(500);
        acc.addInterest();

        System.out.println("Balance: " + acc.balance);
    }
}
