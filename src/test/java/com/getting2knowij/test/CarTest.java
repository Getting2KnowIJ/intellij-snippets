package com.getting2knowij.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void shouldCreateCar() {
        Car car = new Car();
        assertNotNull(car);
    }

    @Test
    void shouldDriveForwardsWithNoOtherInstructions() {
        Car car = new Car();
        car.drive();
        // need to check the car moved forward
    }
}