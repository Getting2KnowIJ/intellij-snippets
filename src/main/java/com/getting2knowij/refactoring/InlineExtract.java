package com.getting2knowij.refactoring;

import java.util.List;

public class InlineExtract {
  public static void main(String[] args) {
    InlineExtract inlineExtract = new InlineExtract();
    inlineExtract.createListAndDoStuffWithIt();
  }

  private void createListAndDoStuffWithIt() {
    List<String> strings = List.of("This", "is", "a", "list", "of", "Strings");
    int numberOfStrings = strings.size();

    // Try extracting this for loop as a method with (⌥⌘M | Ctrl+Alt+M)
    for (int i = 0; i < numberOfStrings; i++) {
      System.out.println("On iteration: "+i);
      System.out.println(strings.get(i));
      System.out.println();
    }

    List<String> lowerCaseList = createNewListOfLowerCase(strings);

    for (int i = 0; i < numberOfStrings; i++) {
      System.out.println("On iteration: "+i);
      System.out.println(lowerCaseList.get(i));
      System.out.println();
    }
  }

  private List<String> createNewListOfLowerCase(List<String> strings) {
    return strings.stream()
                  .map(String::toLowerCase)
                  .toList();
  }
}
