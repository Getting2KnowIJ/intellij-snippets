package org.effectiveintellij.error;

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
}
