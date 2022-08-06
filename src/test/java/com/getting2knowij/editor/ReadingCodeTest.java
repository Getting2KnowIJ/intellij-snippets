package com.getting2knowij.editor;

import org.junit.jupiter.api.Test;

class ReadingCodeTest {
  @Test
  void notATestButShowsTheUsagesOfTheseMethodsIfCodeVisionIsTurnedOn() {
    // This is not a test, do not write tests like this! We're using this test
    // to give "usages" for the methods so we can see the usages with Code Vision
    ReadingCode readingCode = new ReadingCode();
    readingCode.inlayHintsForChainedMethods();
    readingCode.inlayHintsShownForImplicitTypes();
    readingCode.inlayHintsShownForImplicitTypes();
    var customer = readingCode.inlayHintsShownForParameterNames("name 1");
    customer = readingCode.inlayHintsShownForParameterNames("name 2");
  }
}