package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class NameList {

    public static void display(List<String> names) {
        if (names.isEmpty()) {
            System.out.println("No names in the list.");
        } else {
            for (String n : names) {
                System.out.println(n);
            }
        }
    }
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Please select an Operation \n1 - Add \n2 - Remove \n3 - Display \n4 - Exit");
            int choice = sc.nextInt();

            if(choice == 1){
                System.out.println("Enter the name you want to add: ");
                String name = sc.nextLine();
                names.add(name);
            } else if (choice == 2) {
                System.out.println("Enter the name you want to remove: ");
                String name = sc.nextLine();
                names.remove(name);
            } else if (choice == 3) {
                    display(names);
            } else if (choice == 4) {
                System.out.println("You chose to exit!");
                break;
            }
            else{
                System.out.println("Invalid Input");
            }

        }
    }
}
