package org.effectiveintellij.generation;

public class Customer {
    private long id;
    private String name;
    private Service service;

    public void setService(Service service) {
        this.service = service;
    }
}
