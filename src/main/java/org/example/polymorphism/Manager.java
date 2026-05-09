package org.example.polymorphism;

class Manager extends Employee {

    double basicSalary;
    double bonus;

    Manager(String name, double basicSalary, double bonus) {
        super(name);
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    @Override
    void computeSalary() {

        double totalSalary = basicSalary + bonus;

        System.out.println(name + " Salary: " + totalSalary);
    }
}
