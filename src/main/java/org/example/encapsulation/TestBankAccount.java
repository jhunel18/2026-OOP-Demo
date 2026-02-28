package org.example.encapsulation;

public class TestBankAccount {
    public static void main(String[] args) {
        // When balance public in BankAccount, BankAccount.balance = -1000;
        BankAccount acc = new BankAccount();
        acc.deposit(100);
        System.out.println(acc.getBalance());
    }
}
