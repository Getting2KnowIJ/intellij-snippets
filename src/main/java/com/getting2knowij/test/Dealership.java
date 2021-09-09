package com.getting2knowij.test;

@SuppressWarnings("unused")
public class Dealership {
    private final Car car;

    public Dealership() {
        car = new Car();
    }

    public void customerTestDrive() {
        car.drive();
    }
}
