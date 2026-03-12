package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String username = "";
        String password = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        username = sc.nextLine();
        System.out.println("Enter your password: ");
        password = sc.nextLine();

        if(username.equals("admin") && password.equals("1234")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }

    }
}
