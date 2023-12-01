package com.getting2knowij.editor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * This class contains code examples that demonstrate the features of IntelliJ IDEA
 * that make it easier to read code. One of those features is "Rendered View" of Javadocs,
 * which <i>formats</i> Javadocs and makes them prettier and easier to read. The font size of
 * these rendered docs is adjustable too.
 * <br/><br/>
 * Press (<b>⌃⌥Q</b> | <b>Ctrl+Alt+Q</b>) to toggle between rendered and code view.
 */
@SuppressWarnings({"unused", "SameParameterValue"})
public class ReadingCode {
  Customer inlayHintsShownForParameterNames(String name) {
    return findCustomer(name, null, null, 0, true);
  }

  void inlayHintsForChainedMethods() {
    Stream.of(1, 2, 3)
        .filter(it -> it % 2 == 0)
        .map(it -> "item: " + it)
        .forEach(System.out::println);
  }

  void inlayHintsShownForImplicitTypes() {
    var customers = List.of(new Customer(123, "Ms Customer"));
  }

  void popupDocumentation() {
    // press (F1 | Ctrl+Q) on a class or method for quick documentation
    var customers = new ArrayList<String>();
  }

  //<editor-fold desc="Helper methods">
  private Customer findCustomer(String name, String address, Integer orderNumber, int id, boolean ascending) {
    return null;
  }

  private void anotherMethodJustToBeFoldedAwayInEditorFold() {
    // pretend there's something here
  }
  //</editor-fold>

}
