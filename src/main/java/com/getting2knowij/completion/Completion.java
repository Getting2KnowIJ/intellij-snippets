package com.getting2knowij.completion;

import java.util.List;

public class Completion {
  public void basicCompletion() {
    // put your caret between the "t" and "l" of println
    // and press Ctrl+Space
    //  - select a solution and press Enter
    //  - select a solution and press tab
    //  - select a solution and press .
    System.out.println("Message");
    // Start typing "Sys", press . (full stop/period).
    // Use this to build up a chain of method calls
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

  public void smartCompletion() {
    // Uncomment the code  below
    // Put your cursor at the end of the line and type (⌃⇧␣ | Ctrl+Shift+Space)
    // IntelliJ IDEA will suggest only types that implement "List"
//    List<String> list = new
  }

  public void postfixCompletion() {
    // Uncomment the String below, and type "." after the closing quote.
    // Press the up arrow to see a list of postfix completion options
//    "Try Postfix"
  }
}
