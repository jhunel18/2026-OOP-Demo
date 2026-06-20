package org.example.abstraction.enrolment_system;

public class InternationalStudent extends Student{
    public InternationalStudent(int id, String name, String email, int units){
        super(id, name, email, units);
    }

    @Override
    double calculateTuition() {
        return (this.units * 1500) + 20000;
    }
}
