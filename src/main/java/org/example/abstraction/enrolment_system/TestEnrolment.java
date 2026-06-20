package org.example.abstraction.enrolment_system;

public class TestEnrolment {
    public static void main(String[] args) {
        RegularStudent regularStudent = new RegularStudent(1, "Jhunel", "jbp@test.com", 28);
        System.out.println(regularStudent.calculateTuition());
    }
}
