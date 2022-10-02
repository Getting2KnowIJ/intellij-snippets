package com.getting2knowij.refactoring;

public class InspectionExamples {
  public static void main(String[] args) {
    new InspectionExamples().canReplaceDoWithWhile();
  }

  private void canReplaceDoWithWhile() {
    int i = 0;
    System.out.println(i++);
    while (i < 10) {
      System.out.println(i++);
    }
  }
}
