package org.example.inheritance.vehicle;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Car();
        car.honk();
        System.out.println(car.brand + " " + car.modelName);
    }
}
