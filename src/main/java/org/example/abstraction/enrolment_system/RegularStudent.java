package org.example.abstraction.enrolment_system;

public class RegularStudent extends Student{
    public RegularStudent(int id, String name, String email, int units){
        super(id, name, email, units);
    }

    @Override
    double calculateTuition() {
        return this.units * 1500;
    }
}
