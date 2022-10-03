package com.getting2knowij.editor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

@SuppressWarnings("unused")
public class FormatCode {
    void tryFormattingThisMethod() {
    // use (⌘⌥L | Ctrl+Alt+L) to format this whole class file
      int val = 0;
    for (int i = 0; i <5; i++) {
      if (val == 4) System.out.println(val);
        val = i;
      }
    // then try selecting just part of the method and pressing (⌘⌥L | Ctrl+Alt+L)
  }

  void methodToChangeFormat() throws IOException {
    Path path = Path.of("music.csv");

    try (Stream<String> lines = Files.lines(path)) {
      lines.map(s -> s.split(","))
           .filter(strings -> strings[0].contains("the"))
           .forEach(System.out::println);
    }
  }
}
