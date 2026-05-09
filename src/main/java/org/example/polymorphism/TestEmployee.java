package org.example.polymorphism;

public class TestEmployee {

    public static void main(String[] args) {

        Employee[] employees = new Employee[3];

        employees[0] = new RegularEmployee("Juan", 30000);

        employees[1] = new PartTimeEmployee("Maria", 80, 150);

        employees[2] = new Manager("Pedro", 50000, 10000);

        for(Employee emp : employees) {

            emp.computeSalary(); //Dynamic method dispatch
        }
    }
}
