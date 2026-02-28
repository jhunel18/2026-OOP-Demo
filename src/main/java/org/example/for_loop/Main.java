package org.example.for_loop;

public class Main {
    public static void main(String[] args) {
        int iteration = 0;
        int sum = 0;
        for(int i = 0; i < 6; i++){
            iteration += 1;
            System.out.println("Iteration = " + iteration + " Sum = " + sum + " i =  " + i);
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}
