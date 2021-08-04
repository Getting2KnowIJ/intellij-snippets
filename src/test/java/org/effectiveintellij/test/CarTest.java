package org.effectiveintellij.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void shouldCreateCar() {
        Car car = new Car();
        assertNotNull(car);
    }
}