package com.getting2knowij.error;

import java.util.Arrays;
import java.util.List;

@SuppressWarnings("unused")
public class ScrollBarIndicators {
  public static void main(String[] args) {
    // this shows up as a warning
    List<Object> objects = Arrays.asList();

    // TODO this is an item to do

    List<String> strings;
    // this is an error
    System.out.println(strings);
  }

  private void exampleMethodHere() {
    // this is code to
    // create more than one
    // page of code in
    // the editor so we
    // can see what happens
    // to the right scroll
    // bar when the code is
    // not currently
    // visible in the
    // editor window.
  }
}


