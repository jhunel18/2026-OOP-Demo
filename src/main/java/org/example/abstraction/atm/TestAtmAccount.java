package org.example.abstraction.atm;

public class TestAtmAccount {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(1000);
        s.withdraw(1500);
        System.out.println(s.balance);

        CheckingAccount c = new CheckingAccount(1000);
        c.withdraw(1500);
        System.out.println(c.balance);
    }
}
