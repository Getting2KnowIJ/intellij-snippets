package com.getting2knowij.debugging;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class OrderTest {
    @Test
    void useThisTestWithTheDebuggerToTryCustomRenderers() {
        int orderId = 64732;
        Order order = new Order(orderId, new Customer("First", "Last"), List.of(new LineItem()));

        Assertions.assertEquals(orderId, order.getId());
    }
}