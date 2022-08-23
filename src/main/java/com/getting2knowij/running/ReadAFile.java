package com.getting2knowij.running;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

/**
 * Shows the difference between where an application looks for files when
 * it's run in IntelliJ IDEA vs when it's run from the command line.
 * <p/>
 * Run it from the command line (open the terminal at /intellij-snippets/src/main/java)
 * by first compiling it
 * <p/>
 * <code>&gt; javac com/getting2knowij/running/ReadAFile.java</code>
 * <p/>
 * then running it
 * <p/>
 * <code>&gt; java com.getting2knowij.running.ReadAFile</code>
 * <p/>
 * This will only pass if music.csv is in /intellij-snippets/src/main/java/
 * <p/>
 * Conversely, if you run it within IntelliJ IDEA, it will only work if
 * music.csv in the project root (/intellij-snippets). If the file is
 * anywhere else, the program will throw an exception. But you can get it to work
 * in IntelliJ IDEA if you set the "working directory" in the run configuration
 * to the location of music.csv.
 * <p/>
 */
public class ReadAFile {
  public static void main(String[] args) throws IOException {
    Path path = Path.of("music.csv");
    System.out.println("File path: " + path.toAbsolutePath());

    try (Stream<String> lines = Files.lines(path)) {
      lines.forEach(System.out::println);
    }
  }
}
