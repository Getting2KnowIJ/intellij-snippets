package com.getting2knowij.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarPerformanceTest {
    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car();
    }

    @Test
    void carDrivingCompletesInSpecifiedTime() {
        car.drive(1, 1);
        // note: this is not a real test! This is an example for find usages
    }
}