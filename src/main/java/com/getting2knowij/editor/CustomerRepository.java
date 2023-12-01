package com.getting2knowij.editor;

@SuppressWarnings("unused")
public class CustomerRepository {
  static Customer findCustomerByName(String name) {
    return findCustomer(name, null, null, 0, true);
  }

  //<editor-fold desc="Helper methods">
  private static Customer findCustomer(String name, String address, Integer orderNumber, int id, boolean ascending) {
    return null;
  }
  //</editor-fold>
}