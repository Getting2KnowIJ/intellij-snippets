package com.getting2knowij.running;

import java.util.Objects;

@SuppressWarnings("ClassCanBeRecord")
public class DebugExample {
    public static void main(String[] args) {
        Person trisha = new Person("Trisha", "Gee");
        System.out.print("Hello ");
        System.out.print(trisha.firstName());
        System.out.println("!");
        System.out.println("How are you today?");
    }

    private static final class Person {
        private final String firstName;
        private final String lastName;

        private Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String firstName() {
            return firstName;
        }

        public String lastName() {
            return lastName;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) return true;
            if (obj == null || obj.getClass() != this.getClass()) return false;
            var that = (Person) obj;
            return Objects.equals(this.firstName, that.firstName) &&
                    Objects.equals(this.lastName, that.lastName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(firstName, lastName);
        }

        @Override
        public String toString() {
            return "Person[" +
                    "firstName=" + firstName + ", " +
                    "lastName=" + lastName + ']';
        }
    }
}
