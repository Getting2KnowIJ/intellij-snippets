package com.getting2knowij.suggest;

import com.getting2knowij.generation.Customer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import static java.lang.System.out;

@SuppressWarnings({"rawtypes", "unchecked", "unused", "MismatchedReadAndWriteOfArray"})
public class AltEnter {
  private final String[] stringArray = new String[]{"IntelliJ IDEA", "Space", "Code With Me", "TeamCity"};

  public void error() {
    // Uncomment to see an error
//    List<String> strings = new HashMap<Integer, String>();
  }

  public void warnings() {
    //"Lambda can be replaced with method reference"
    Arrays.sort(stringArray, (s1, s2) -> s1.compareToIgnoreCase(s2));
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

  public void fixSpelling() {
    Customer cusomer = new Customer();
  }

}
