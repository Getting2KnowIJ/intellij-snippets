package com.getting2knowij.running;

import com.getting2knowij.running.error.ClassThatThrowsAnException;

public class StackTraceInTerminal {
  public static void main(String[] args) {
    var exceptionThrower = new ClassThatThrowsAnException("Should show link in terminal");
    exceptionThrower.go();
  }
}
