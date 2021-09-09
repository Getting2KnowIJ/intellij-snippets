package com.getting2knowij.navigation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExampleImplementationTest {
    @Test
    void exampleTest() {
        ExampleInterface example = new ExampleImplementation();
        example.exampleMethod();
        Assertions.assertNotNull(example);
    }
}