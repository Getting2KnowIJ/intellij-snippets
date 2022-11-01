package com.getting2knowij.editor;

@SuppressWarnings({"unused", "FieldMayBeFinal"})
public class MultiCaret {
  private long id;
  private String firstName;
  private String lastName;
  private int age;
  private String additionalNotes;

  private final String storageFilename = "customer.txt";
  private final String logFilename = "log.txt";

  public MultiCaret(long id, String firstName, String lastName, int age, String additionalNotes) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.additionalNotes = additionalNotes;
  }

  @Override
  public String toString() {
    return "MultiCaret{" +
        "id=" + id +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", age=" + age +
        ", additionalNotes='" + additionalNotes + '\'' +
        '}';
  }
}
