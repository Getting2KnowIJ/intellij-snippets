package com.getting2knowij.running;

public class EnvironmentVariableExample {
  public static void main(String[] args) {
    String logDirectory = System.getenv("LOG_DIR");
    System.out.println("logDirectory = " + logDirectory);
  }
}
