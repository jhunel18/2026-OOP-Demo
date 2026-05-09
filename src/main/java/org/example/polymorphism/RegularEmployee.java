package org.example.polymorphism;

class RegularEmployee extends Employee {

    double monthlySalary;

    RegularEmployee(String name, double monthlySalary) {
        super(name); //calls the parent constructor
        this.monthlySalary = monthlySalary;
    }

    @Override
    void computeSalary() {
        System.out.println(name + " Salary: " + monthlySalary);
    }
    //replace the original behavior
}
