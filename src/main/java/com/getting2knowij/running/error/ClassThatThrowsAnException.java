package com.getting2knowij.running.error;

public class ClassThatThrowsAnException {
  private final String message;

  public ClassThatThrowsAnException(String message) {
    this.message = message;
  }

  public void go() {
    throw new PlannedException(message);
  }
}
