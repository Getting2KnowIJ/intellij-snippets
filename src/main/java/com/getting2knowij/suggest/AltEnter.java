package com.getting2knowij.suggest;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import static java.lang.System.out;
import static java.util.Arrays.sort;

@SuppressWarnings({"rawtypes", "unchecked", "unused", "MismatchedReadAndWriteOfArray"})
public class AltEnter {
    private final String[] stringArray = new String[]{"IntelliJ IDEA", "Space", "Code With Me", "TeamCity"};

    public void warnings() {
        //"Lambda can be replaced with method reference"
        sort(stringArray, (s1, s2) -> s1.compareToIgnoreCase(s2));
    }

    public void unusedCode() {
        Map<Integer, String> hashMap = new HashMap<Integer, String>();
    }

    public void workingCode() {
        //Remove redundant types
        Function<Function, Function> f3 = (Function function) -> function.compose(function);

        //Reverse for loop
        for (int i = 0; i < 10; i++) {
            out.println(i);
        }
    }
}
