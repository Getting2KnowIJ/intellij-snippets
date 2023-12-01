package com.getting2knowij.editor;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerRepositoryTest {

  private final Customer expected = new Customer(0, "the name");

  @Test
  @Disabled
  void shouldFindCustomerByName() {
    Customer actual = CustomerRepository.findCustomerByName("the name");

    assertEquals(expected, actual);
  }
}