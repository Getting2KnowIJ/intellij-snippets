package com.getting2knowij.refactoring;

import com.getting2knowij.generation.Customer;
import com.getting2knowij.test.LineItem;

import java.util.List;

@SuppressWarnings({"unused", "ClassCanBeRecord"})
public class Order {
  private final long id;
  private final Customer customer;
  private final List<LineItem> lineItems;

  public Order(long id, Customer customer, List<LineItem> lineItems) {
    this.id = id;
    this.customer = customer;
    this.lineItems = lineItems;
  }

  public long getId() {
    return id;
  }

  public Customer getCustomer() {
    return customer;
  }

  public List<LineItem> getLineItems() {
    return lineItems;
  }
}
