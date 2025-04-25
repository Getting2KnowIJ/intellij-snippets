package com.getting2knowij.editor;

@SuppressWarnings({"TextBlockMigration", "unused"})
public class LanguageInjection {
  // Text blocks (introduced in Java 15) are a more helpful way of representing other code in String values
  private final String json = """
      {
        "openStreetMapId": 2852153005,
        "location": {
          "coordinates": [
            "-73.616748",
            "45.4699795"
          ],
          "type": "Point"
        },
        "cuisine": "coffee_shop",
        "name": "Cafelito"
      }
      """;

  private final String html = "<html>\n" +
                              "  <body>\n" +
                              "    <p>Hello World.</p>\n" +
                              "  </body>\n" +
                              "</html>\n";

  private final String query = "SELECT id, last_name FROM employee" +
                               "WHERE city = 'London'" +
                               "ORDER BY id, last_name;";

  private final String script = "function hello() {\n" +
                                "  print(\"Hello World\");\n" +
                                "}\n" +
                                "\n" +
                                "hello();\n";

}
