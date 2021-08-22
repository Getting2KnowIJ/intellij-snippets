package org.effectiveintellij.editor;

public class LongStrings {
    private final String aLongString = "Try out some of the editor tips on " +
                                       "this long string, for example, " +
                                       "pressing Enter in the middle of a line, " +
                                       "using (**⌃⇧J** | **Ctrl+Shift+J**) on " +
                                       "a line to join it with the line below, " +
                                       "or using Alt+Enter to inject a " +
                                       "language, like markdown.";

    private final String json = "{\n" +
                                "    \"name\":\"theName\",\n" +
                                "    \"id\":12432\n" +
                                "}\n";

    private final String sql = "SELECT * " +
                               "FROM Customer c" +
                               "WHERE c.id = ?";

}
