package org.example.polymorphism;

class PartTimeEmployee extends Employee {

    int hoursWorked;
    double ratePerHour;

    PartTimeEmployee(String name, int hoursWorked, double ratePerHour) {
        super(name);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    @Override
    void computeSalary() {

        double salary = hoursWorked * ratePerHour;

        System.out.println(name + " Salary: " + salary);
    }
}
