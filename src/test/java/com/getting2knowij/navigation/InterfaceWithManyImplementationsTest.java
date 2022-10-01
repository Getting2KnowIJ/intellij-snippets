package com.getting2knowij.navigation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InterfaceWithManyImplementationsTest {

  @Test
  void shouldDemonstrateNavigateToImplementation() {
    InterfaceWithManyImplementations exampleInterface = new Implementation2();
    exampleInterface.aMethodHere();
    // Not a real test, it doesn't actually check anything
    assertNotNull(exampleInterface);
  }
}