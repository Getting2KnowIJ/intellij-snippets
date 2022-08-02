package com.getting2knowij.editor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@SuppressWarnings({"unused", "SameParameterValue"})
public class ReadingCode {
  Customer inlayHintsShownForParameterNames(String name) {
    // shows Parameter Name Hints, if enabled
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
  //</editor-fold>

}
