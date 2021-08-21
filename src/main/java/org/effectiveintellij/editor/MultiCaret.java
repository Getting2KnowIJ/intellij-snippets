package org.effectiveintellij.editor;

@SuppressWarnings("unused")
public class MultiCaret {
    private long id;
    private String firstName;
    private String lastName;
    private int age;
    private String additionalNotes;

    private final String storageFilename = "customer";
    private final String logFilename = "log";

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
