package org.example.abstraction.enrolment_system;

class ScholarStudent extends Student {
    public ScholarStudent(int id, String name, String email, int units){
        super(id, name, email, units);
    }

    @Override
    double calculateTuition() {
        double tf = this.units * 1500;
        double discount = tf * 0.50;
        return tf - discount;
    }
}
