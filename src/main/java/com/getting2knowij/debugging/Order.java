package com.getting2knowij.debugging;

import java.util.List;

public class Order {
  private final int id;
  private final Customer customer;
  private final List<LineItem> lineItems;

  public Order(int id, Customer customer, List<LineItem> lineItems) {
    this.id = id;
    this.customer = customer;
    this.lineItems = lineItems;
  }

  public int getId() {
    return id;
  }
}
