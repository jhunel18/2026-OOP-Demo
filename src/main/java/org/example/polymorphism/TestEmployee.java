package org.example.polymorphism;

public class TestEmployee {

    public static void main(String[] args) {


//        Employee[] employees = new Employee[3];
//
//        employees[0] = new RegularEmployee("Juan", 30000);
//
//        employees[1] = new PartTimeEmployee("Maria", 80, 150);
//
//        employees[2] = new Manager("Pedro", 50000, 10000);
//
//        for(Employee emp : employees) {
//
//            emp.computeSalary(); //Dynamic method dispatch
//        }
        RegularEmployee e1 = new RegularEmployee("Jhunel", 80000);
        e1.computeSalary();
        PartTimeEmployee pt = new PartTimeEmployee("Jhunel", 100, 200);
        pt.computeSalary();
        Manager m = new Manager("Jhunel", 8000, 2000);
        m.computeSalary();
    }
}
