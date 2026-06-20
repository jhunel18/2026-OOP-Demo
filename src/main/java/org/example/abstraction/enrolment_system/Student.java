package org.example.abstraction.enrolment_system;

abstract class Student {
    int id;
    String sName;
    String email;
    int units;

    public Student(int id, String email, String sName, int units) {
        this.email = email;
        this.sName = sName;
        this.id = id;
        this.units = units;
    }

    abstract double calculateTuition();

}
