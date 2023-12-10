package com.getting2knowij.vcs;

import org.junit.jupiter.api.Test;

class LogTest {
  @Test
  void shouldLogInfoMessages() {
    Log log = new Log(new StubOut());

    log.info("Test message");
  }

  private class StubOut implements Log.Out {
  }
}