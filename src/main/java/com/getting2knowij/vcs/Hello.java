package com.getting2knowij.vcs;

public class Hello {
  private static final String MESSAGE = "Hello %s!";

  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("You need to give an author");
    }
    String user = args[0];
    System.out.printf(MESSAGE, user);
  }

}
