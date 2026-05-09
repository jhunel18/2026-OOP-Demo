package org.example.polymorphism;

public class Employee {
        protected String name; //protected meaning the child classes can access it directly

        Employee(String name) {
            this.name = name;
        }
        void computeSalary() {
            System.out.println("Computing salary...");
        }
}
