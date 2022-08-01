package com.getting2knowij.completion;

public class Completion {
  public void basicCompletion() {
    // put your caret between the "t" and "l" of println
    // and press Ctrl+Space
    //  - select a solution and press Enter
    //  - select a solution and press tab
    //  - select a solution and press .
    System.out.println("Message");
  }

  // delete the curly braces and body of the method;
  // place the caret after the brackets of the method declaration;
  // press (shift+cmd+enter | ctrl+shift+enter);
  // see IntelliJ IDEA inserts the curly braces
  public void completeStatement() {
    // delete the closing quote, closing brace, and semi-colon
    // press (shift+cmd+enter | ctrl+shift+enter);
    // see IntelliJ IDEA closes everything off
    System.out.println("Hello");
  }
}
