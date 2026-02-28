package org.example.encapsulation;

public class BankAccount {
    //Change to public double balance
    private double balance;

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }
    }
    public double getBalance(){
        return balance;
    }
}
