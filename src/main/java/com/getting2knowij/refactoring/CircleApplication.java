package com.getting2knowij.refactoring;

public class CircleApplication {
  private static void createMessage() {

  }

  public static void main(String[] args) {
    Circle circle = new Circle("the circle");

    String name = circle.getName();

    System.out.println(name);
  }
}
